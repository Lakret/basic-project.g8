name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
  "org.scalaz" %% "scalaz-core" % "6.0.4"
)

scalacOptions ++= Seq("-deprecation", "-feature",
                      "-language:implicitConversions", "-language:reflectiveCalls",
  	                  "-language:existentials", "-language:postfixOps")

EclipseKeys.withSource := true

initialCommands := """
  import $organization$.$name;format="lower,word"$._
  import scalaz._
  import Scalaz._
""
