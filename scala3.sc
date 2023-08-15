object StringFormattingExample {
  def main(args: Array[String]): Unit = {
     val formattedName = formatNames("Niroshan", (input, _) => toUpper(input, some(1)) 
     println(formattedName)

  }

  def toUpper(input: String, index: Option[Int] = None): String = {
    index match {
      case Some(i) if i >= 0 && i < input.length =>
        input.updated(i, input.charAt(i).toUpper)
      case _ => input.toUpperCase()
    }
  }

  def toLower(input: String, index: Option[Int] = None): String = {
    index match {
      case Some(i) if i >= 0 && i < input.length =>
        input.updated(i, input.charAt(i).toLower)
      case _ => input.toLowerCase()
    }
  }

  def formatNames(name: String, formatFunction: (String, Option[Int]) => String, index: Option[Int] = None): String = {
    formatFunction(name, index)
  }
}
