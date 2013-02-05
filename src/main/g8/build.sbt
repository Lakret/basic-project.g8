name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.0"

resolvers ++= Seq(
  "Sonatype OSS Releases" at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
  "org.scalaz" %% "scalaz-core" % "6.0.4",
  "com.chuusai" % "shapeless" % "1.2.3" cross CrossVersion.full
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
