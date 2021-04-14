import org.apache.spark.sql.SparkSession

object Test1 {
  def main(args: Array[String]): Unit = {
    val spark: SparkSession = SparkSession.
      builder
      .appName("My Spark Application")
      .config("spark.master","local[*]")
      .getOrCreate


  }
}
