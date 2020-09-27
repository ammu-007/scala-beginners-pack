object HigherOrderFunction {
  def math(x: Double, y: Double, func: (Double, Double)=>Double): Double = func(x, y)
  def nested_math(x: Double, y: Double, z:Double, func: (Double, Double)=>Double): Double = func(func(x, y), z)
  def multiply(x: Double, y: Double): Double ={
    x*y
  }

  def main(args: Array[String]): Unit ={
    val a: Double = 10
    val b: Double = 20
    val c: Double = 30
    val result = math(a, b, (x: Double, y:Double) => x+y)   //Passing anonymous function
    val nested_result = nested_math(a, b, c, _ min _)       //Wild card notation
    val product = math(a, b, multiply)
    println(result)
    println(nested_result)
    println(product)
  }
}
