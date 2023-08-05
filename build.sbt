ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "zbot"
  )

val circeVersion = "0.14.1"

libraryDependencies += "dev.zio" %% "zio" % "2.0.10"
libraryDependencies += "dev.zio" %% "zio-http" % "3.0.0-RC2"
libraryDependencies ++= Seq(
  "io.getquill"          %% "quill-jdbc-zio" % "4.1.0",
  "org.postgresql"       %  "postgresql"     % "42.3.1",
)

libraryDependencies += "io.github.apimorphism" %% "telegramium-core" % "7.66.0"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)