object Main {
  def main(args: Array[String]): Unit = {
    // Import SparkSession
    import org.apache.spark.sql.SparkSession

    // Initialize Spark session
    val spark = SparkSession.builder()
      .appName("Spark Scala Project")
      .master("local[*]") // Use local mode for testing
      .getOrCreate()

    // Example data processing task
    val data = Seq(("Alice", 1), ("Bob", 2), ("Cathy", 3))
    val df = spark.createDataFrame(data).toDF("name", "value")

    // Show the DataFrame
    df.show()

    // Stop the Spark session
    spark.stop()
  }
}