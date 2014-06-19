name := """play-sbt-web-tester"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "org.webjars" % "bootstrap" % "3.1.1-2",
  "org.webjars" % "jquery" % "1.11.1",
  "org.webjars" % "underscorejs" % "1.6.0-3"
)

JstKeys.prettify in Assets := true

JstKeys.outputPath := "javascripts/templates.js"