name := "AkkaExecute"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.4.0"
libraryDependencies += "com.typesafe.akka" % "akka-remote_2.11" % "2.4.0"