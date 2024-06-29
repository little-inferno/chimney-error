import io.scalaland.chimney.dsl._

import scala.annotation.StaticAnnotation

case class Kek(param1: Option[Int] = None, param2: List[String] = Nil, param3: Option[String] = None)

final case class annot() extends StaticAnnotation

case class Lol(
  param1: Option[String] = None,
  param2: List[String] = Nil,
  @annot() param3: Option[String] = None,
  param4: Option[String] = None
)

object Test120 extends App {
  val kek = Kek(Some(1), "2" :: "3" :: Nil, Some("4"))

  println(
    kek
      .into[Lol]
      .withFieldComputed(_.param1, _.param1.map(_.toString))
      .enableDefaultValues
      .enableOptionDefaultsToNone
      .transform
  )
}
