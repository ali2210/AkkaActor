name := "Akka"

version := "0.1"

scalaVersion := "2.12.6"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
// https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.14"
// https://mvnrepository.com/artifact/com.typesafe.akka/akka-testkit
//libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.5.14" % Test
//// https://mvnrepository.com/artifact/com.typesafe.akka/akka-slf4j
//libraryDependencies += "com.typesafe.akka" %% "akka-slf4j" % "2.5.14"
//// https://mvnrepository.com/artifact/junit/junit
//libraryDependencies += "junit" % "junit" % "4.12" % Test
//// https://mvnrepository.com/artifact/org.scalatest/scalatest
//libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % Test