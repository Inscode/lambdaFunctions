object MyClass {
    val interest: (Int) => Double = (amount) => {
        if (amount <= 20000) 0.02 * amount
        else if (amount <= 200000) 0.035 * amount
        else if (amount <= 2000000) 0.04 * amount
        else 0.065 * amount
    }


    def main(args: Array[String]) = {
        val sam1 = interest(10000)
        val sam2 = interest(23000)
        val sam3 = interest(150000)
        val sam4 = interest(190000)
        val sam5 = interest(23000000)

        println(s"Interest for 10000: ${"%.2f".format(sam1)}")
        println(s"Interest for 23000: ${"%.2f".format(sam2)}")
        println(s"Interest for 150000: ${"%.2f".format(sam3)}")
        println(s"Interest for 190000: ${"%.2f".format(sam4)}")
        println(s"Interest for 23000000: ${"%.2f".format(sam5)}")
    }
}
