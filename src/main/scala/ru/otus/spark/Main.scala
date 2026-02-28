package ru.otus.spark

import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]): Unit = {
    val logFile = "C:\\Users\\Goopy\\Projects\\SparkOtusProject\\README.md" // Should be some file on your system
    val spark = SparkSession
        .builder()
        .config("spark.sql.caseSensitive", value = true)
        .config("spark.sql.session.timeZone", value = "UTC")
        .config("spark.driver.memory", value = "8G")
        .appName("Simple Application")
        .master("local[*]")
        .getOrCreate()

      spark.sparkContext.setLogLevel("WARN")

    val logData = spark.read.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    spark.stop()
  }
}