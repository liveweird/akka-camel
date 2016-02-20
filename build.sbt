name := """akka-sample-camel-scala"""

version := "2.4.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.0",
  "com.typesafe.akka" %% "akka-camel" % "2.4.0",
  "org.apache.camel" % "camel-jetty" % "2.16.1",
  "org.apache.camel" % "camel-quartz" % "2.16.1",
  "org.slf4j" % "slf4j-api" % "1.7.16",
  "ch.qos.logback" % "logback-classic" % "1.0.7"
)


fork in run := true