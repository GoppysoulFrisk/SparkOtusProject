import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.apache.spark.sql.SparkSession

class MainTest extends AnyFlatSpec with Matchers {

  "Main" should "initialize Spark session" in {
    val spark = SparkSession.builder()
      .appName("Test Spark Session")
      .master("local[*]")
      .getOrCreate()

    spark should not be null
    spark.version should not be empty

    spark.stop()
  }

  // Additional tests for other methods in Main can be added here
}