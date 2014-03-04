name := "scala-intro"

organization := "org.ardlema"

version := "0.0.1"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.0" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test" withSources() withJavadoc(),
  "net.liftweb" % "lift-json_2.10" % "2.5.1"
)

initialCommands := "import org.ardlema.scalaintro._"

