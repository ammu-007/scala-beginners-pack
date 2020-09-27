object forLoop {
  def main(args: Array[String]) {
    {
      //    for( x <- (1 until  5)){
      //      println(x)
      //    }
      //    for( x <- 1 to 3;  y <- 10 to 15){
      //    println("Multiple ranges: " + x + " " + y)
      //    }
      val my_list = List(4, 5, 7, 8, 9, 6, 2, 1, 2, 0, 4)
      for (x <- my_list; if x < 6 && x > 2)
        println(x)
      val yielded_list = for {
        i <- my_list
        if i<6
      }yield i
        println(yielded_list)
    }
  }
}