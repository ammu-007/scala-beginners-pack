object Anonymous {
  def main(args : Array[String]) {
    val add = (x: Int, y: Int) => x + y; //Anonymous function or first class function
    println(add(45, 34))
  }
}
