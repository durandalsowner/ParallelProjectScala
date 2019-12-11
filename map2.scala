import java.util.concurrent.ForkJoinPool
import scala.collection.parallel
import scala.collection.mutable.ListBuffer

object map2 {

  def main(args: Array[String]): Unit = {

    for( w <- 1 to 10)
      {print(w)}

    println(Runtime.getRuntime.availableProcessors())

    val commonPool = ForkJoinPool.commonPool()

     println (commonPool.getParallelism)


    var paralleldurations1 = new ListBuffer[String]()
    for( w <- 1 to 10)
    {
      val list = (1 to w * 1000000).toList.par
      val t1 = System.nanoTime
      val maplist = list.map(_ + 999)
      val duration = (System.nanoTime - t1) / 1e9d
      paralleldurations1 += duration.toString()
    }
    val durationlist1 = paralleldurations1.toList
    println("Default Execution time = ", durationlist1)

    val fjpool = new ForkJoinPool(2)
    val customTaskSupport = new parallel.ForkJoinTaskSupport(fjpool)

 var paralleldurations2 = new ListBuffer[String]()
    for( w <- 1 to 10)
    {
      val plist = (1 to w * 1000000 ).toList.par
      plist.tasksupport = customTaskSupport
      val t2 = System.nanoTime
      val maplist = plist.map(_ + 999)
      val duration = (System.nanoTime - t2) / 1e9d
      paralleldurations2 += duration.toString()
    }
    val durationlist2 = paralleldurations2.toList
    println("Parallelism 2 Parallel Execution time = ", durationlist2)

    val fjpool2 = new ForkJoinPool(4)
    val customTaskSupport2 = new parallel.ForkJoinTaskSupport(fjpool2)

    var paralleldurations3 = new ListBuffer[String]()
    for( w <- 1 to 10)
    {
      val plist2 = (1 to w * 1000000 ).toList.par
      plist2.tasksupport = customTaskSupport2
      val t3 = System.nanoTime
      val maplist = plist2.map(_ + 999)
      val duration = (System.nanoTime - t3) / 1e9d
      paralleldurations3 += duration.toString()
    }
    val durationlist3 = paralleldurations3.toList
    println("Parallelism 4 Parallel Execution time = ", durationlist3)

    val fjpool3 = new ForkJoinPool(6)
    val customTaskSupport3 = new parallel.ForkJoinTaskSupport(fjpool3)

    var paralleldurations4 = new ListBuffer[String]()
    for( w <- 1 to 10)
    {
      val plist3 = (1 to w * 1000000 ).toList.par
      plist3.tasksupport = customTaskSupport3
      val t3 = System.nanoTime
      val maplist = plist3.map(_ + 999)
      val duration = (System.nanoTime - t3) / 1e9d
      paralleldurations4 += duration.toString()
    }
    val durationlist4 = paralleldurations4.toList
    println("Parallelism 6 Parallel Execution time = ", durationlist4)

    val fjpool4 = new ForkJoinPool(8)
    val customTaskSupport4 = new parallel.ForkJoinTaskSupport(fjpool4)

    var paralleldurations5 = new ListBuffer[String]()
    for( w <- 1 to 10)
    {
      val plist3 = (1 to w * 1000000 ).toList.par
      plist3.tasksupport = customTaskSupport4
      val t3 = System.nanoTime
      val maplist = plist3.map(_ + 999)
      val duration = (System.nanoTime - t3) / 1e9d
      paralleldurations5 += duration.toString()
    }
    val durationlist5 = paralleldurations5.toList
    println("Parallelism 8 Parallel Execution time = ", durationlist5)


    val fjpool5 = new ForkJoinPool(10)
    val customTaskSupport5 = new parallel.ForkJoinTaskSupport(fjpool5)

    var paralleldurations6 = new ListBuffer[String]()
    for( w <- 1 to 10)
    {
      val plist3 = (1 to w * 1000000 ).toList.par
      plist3.tasksupport = customTaskSupport5
      val t3 = System.nanoTime
      val maplist = plist3.map(_ + 999)
      val duration = (System.nanoTime - t3) / 1e9d
      paralleldurations6 += duration.toString()
    }
    val durationlist6 = paralleldurations6.toList
    println("Parallelism 10 Parallel Execution time = ", durationlist6)

    val fjpool6 = new ForkJoinPool(12)
    val customTaskSupport6 = new parallel.ForkJoinTaskSupport(fjpool6)

    var paralleldurations7 = new ListBuffer[String]()
    for( w <- 1 to 10)
    {
      val plist3 = (1 to w * 1000000 ).toList.par
      plist3.tasksupport = customTaskSupport6
      val t3 = System.nanoTime
      val maplist = plist3.map(_ + 999)
      val duration = (System.nanoTime - t3) / 1e9d
      paralleldurations7 += duration.toString()
    }
    val durationlist7 = paralleldurations7.toList
    println("Parallelism 12 Parallel Execution time = ", durationlist7)




  }
}
