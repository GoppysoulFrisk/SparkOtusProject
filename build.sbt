name := "spark-scala-project"
version := "0.1.0"

ThisBuild / organization := "ru.otus.spark"
ThisBuild / version := "1.0"
ThisBuild / scalaVersion := "2.13.10"

lazy val sparkVersion = "3.5.7"
lazy val circeVersion = "0.14.9"

ThisBuild / libraryDependencies ++= Seq(
	"org.apache.spark" %% "spark-core" % sparkVersion,
	"org.apache.spark" %% "spark-sql" % sparkVersion
)

fork := true
// Compile / mainClass := Some("ru.otus.spark.DataframeApp")

javaOptions += "-Dhadoop.security.authentication=none"