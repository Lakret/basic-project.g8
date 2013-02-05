name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
  "org.scalaz" %% "scalaz-core" % "6.0.4"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
