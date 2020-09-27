object matchExp {
  def main(args : Array[String]): Unit =
  {
    val x = 151;
//    x match {
//      case 5 => println("Five")
//      case 10 => println("Ten")
//      case 15 => println("Fifteen")
//      case _ => println(x)
//    }
    val y = 5;
    y match {
      case 2 | 4 | 6 | 8 => println("even")
      case 1 | 3 | 5 | 7 => println("odd")
    }
  }
}
