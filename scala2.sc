object PatternMatchingExample {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide exactly one integer input.")
      return
    }

    val input = args(0).toInt

    val checkInput: Int => String = {
      case x if x <= 0 => "Negative/Zero"
      case x if x % 2 == 0 => "Even number"
      case _ => "Odd number"
    }

    val result = checkInput(input)
    println(result)
  }
}
