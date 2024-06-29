ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

ThisBuild / scalacOptions += "-Ymacro-annotations"

lazy val root = (project in file("."))
  .settings(name := "chimney-error")
  .aggregate(chimney075, chimney120)

lazy val chimney075 = (project in file("chimney075"))
  .settings(libraryDependencies += "io.scalaland" %% "chimney" % "0.7.5")

lazy val chimney120 = (project in file("chimney120"))
  .settings(libraryDependencies += "io.scalaland" %% "chimney" % "1.2.0")
