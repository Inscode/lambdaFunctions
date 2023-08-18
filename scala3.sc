object MyClass {
    val toUpper: (String) => String = (str) => str.toUpperCase()

    val toLower: (String) => String = (str) => str.toLowerCase()

    val formatNames: (String, Int, Int, String => String) => Unit = (name, start, end, format) => {
        if (start == 0 && end == 0) println(format(name)) // To format the complete name use 0 for both start and end
        else {
            val startingName = name.substring(0, start)
            val formattedName = name.substring(start, end)
            val remainingName = name.substring(end)
            println(startingName + format(formattedName) + remainingName)
        }
    }


    def main(args: Array[String]) = {
        formatNames("Benny", 0, 0, toUpper)
        formatNames("Niroshan", 0, 2, toUpper)
        formatNames("Saman", 0, 0, toLower)
        formatNames("Kumara", 5, 6, toUpper)
    }
}
