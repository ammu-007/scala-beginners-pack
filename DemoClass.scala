class User(var name: String, var age: Int)

object DemoClass {
  def main(args: Array[String]): Unit = {
    val user = new User("Aman", 19)
    println(user.name)
    println(user.age)
    user.name = "Ammu"
    println(user.name)
  }
}
