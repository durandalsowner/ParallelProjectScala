import scala.collection.mutable.ListBuffer

object map {
  def main(args: Array[String]): Unit = {
    var sequentialduration1 = new ListBuffer[String]()
    for( w <- 1 to 10)
    {
      val list = (1 to w * 1000000).toList
      val t1 = System.nanoTime
      val maplist = list.map(_ + 999)
      val duration = (System.nanoTime - t1) / 1e9d
      sequentialduration1 += duration.toString()
    }
    val durationlist1 = sequentialduration1.toList
    println("Long list Sequential Execution time = ", durationlist1)

    var sequentialduration2 = new ListBuffer[String]()
    for( w <- 1 to 10)
    {
      val plist = (1 to w * 1000000 ).toList.par
      val t2 = System.nanoTime
      val maplist = plist.map(_ + 999)
      val duration = (System.nanoTime - t2) / 1e9d
      sequentialduration2 += duration.toString()
    }
    val durationlist2 = sequentialduration2.toList
    println("Long List Parallel Execution time = ", durationlist2)

    var sequentialduration3 = new ListBuffer[String]()
    for( w <- 1 to 10)
    {
      val list = (1 to w * 1000).toList
      val t1 = System.nanoTime
      val maplist = list.map(_ + 999)
      val duration = (System.nanoTime - t1) / 1e9d
      sequentialduration3 += duration.toString()
    }
    val durationlist3 = sequentialduration3.toList
    println("Short list Sequential Execution time = ", durationlist3)


    var sequentialduration4 = new ListBuffer[String]()
    for( w <- 1 to 10)
    {
      val plist = (1 to w * 1000 ).toList.par
      val t2 = System.nanoTime
      val maplist = plist.map(_ + 999)
      val duration = (System.nanoTime - t2) / 1e9d
      sequentialduration4 += duration.toString()

    }
    val durationlist4 = sequentialduration4.toList
    println("Short List Parallel Execution time = ", durationlist4)
  }
}
