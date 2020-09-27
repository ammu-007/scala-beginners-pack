import java.util.Date

object PartiallyAppliedFunction {

  def log(date: Date, message: String): Unit = {
    println(date + ": " + message)
  }

  def main(args: Array[String]): Unit =
  {
    val sum = (a: Int, b: Int, c: Int) => a + b + c
    val f = sum(10, _: Int, _: Int)
    println(f(20, 30))

    val date = new Date
    val newLog = log(date, _: String)
    newLog("System crash")
    newLog("Stack overflow")
  }
}
