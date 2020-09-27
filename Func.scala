object Func {

  object Math{
    def square(a:Int): Int = a*a
  }

  def add(a:Int, b:Int): Int ={
    return a+b //Redundant keyword 'return'
  }
  def sub(a:Int, b:Int): Int ={
    a-b
  }
  def mul(a:Int, b:Int): Int = a*b

  def div(a:Int, b:Int): Int = a/b

  def main(args : Array[String]): Unit ={
    println(add(10, 5))
    println(sub(10, 5))
    println(mul(10, 5))
    println(div(10, 5))
    println(Math.square(10))
    println(Math square 5)
  }
}
