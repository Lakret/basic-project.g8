name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
)

scalacOptions ++= Seq("-deprecation", "-feature",
                      "-language:implicitConversions", "-language:reflectiveCalls",
  	              "-language:postfixOps")

initialCommands := """
  import $organization$.$name;format="lower,word"$._
"""
