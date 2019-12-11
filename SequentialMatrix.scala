import scala.math

object SequentialMatrix {
  def main(args: Array[String]): Unit = {
    val start_time = System.nanoTime()
    val r1 = 2
    val r2 = 2
    val c3 = 2
    val c4 = 2
    val rr1 = 2
    val rr2 = 2
    val cc1 = 2
    val cc2 = 2

    val result1 = r1 * rr1
    val result2 = r2 * rr2
    val result3 = cc1 * c3
    val result4 = cc2 * c4
    val result = result1 + result2 + result3 + result4
    val end_time = System.nanoTime()
    println("time is " + (end_time - start_time) / (1e6 * 60 * 60))
    print(result)
  }

}
