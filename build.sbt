name := "spark-scala-project"
version := "0.1.0"
scalaVersion := "2.13.10"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.3.1",
  "org.apache.spark" %% "spark-sql" % "3.3.1",
  "org.scalatest" %% "scalatest" % "3.2.10" % Test
)