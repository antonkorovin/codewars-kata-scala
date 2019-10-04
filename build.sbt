name := "codewars-kata"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.13.1"

scalacOptions ++= Seq(
  "-encoding"
  , "UTF-8"
  , "-deprecation"
  , "-unchecked"
  , "-feature"
  , "-explaintypes"
  , "-Xlint"
  , "-Xfatal-warnings"
  , "-Ywarn-dead-code"
  , "-Ywarn-unused:imports"
  , "-Ywarn-unused:locals"
  , "-Ywarn-unused:params"
)



libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"

resolvers += "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases"
