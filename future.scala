import scala.concurrent.{Future, future}
import scala.concurrent.ExecutionContext.Implicits.global


object Future {
  def runMultiply(i: Int,j: Int): Future[Double] = future {
    val result = i * j
    println(s"returning multiply: $result")
    result
  }
}

object CalculateMatrix extends App {
  println("starting futures")
  val start_time = System.nanoTime()
  val result1 = Future.runMultiply(2, 2)
  val result2 = Future.runMultiply(2, 2)
  val result3 = Future.runMultiply(2, 2)
  val result4 = Future.runMultiply(2, 2)

  println("before comprehension")
  val result = for {
    r1 <- result1
    r2 <- result2
    r3 <- result3
    r4 <- result4
  } yield (r1 + r2 + r3 + r4)

  println("before onSuccess")
  result onSuccess {
    case result => {
      val end_time = System.nanoTime()
      println("time is " + (end_time - start_time) / (1e6 * 60 * 60))
      println(s"total = $result")

    }
  }


  println("before sleep at the end")
  Thread.sleep(2000)  // important: keep the jvm alive
}