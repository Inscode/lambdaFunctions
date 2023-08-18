object MyClass {
    val interest: (Int) => Double = (amount) => {
        if (amount <= 20000) 0.02 * amount
        else if (amount <= 200000) 0.035 * amount
        else if (amount <= 2000000) 0.04 * amount
        else 0.065 * amount
    }


    def main(args: Array[String]) = {
        val int1 = interest(10000)
        val int2 = interest(30000)
        val int3 = interest(100000)
        val int4 = interest(1000000)
        val int5 = interest(10000000)

        println(s"Interest for 10000: ${"%.2f".format(int1)}")
        println(s"Interest for 30000: ${"%.2f".format(int2)}")
        println(s"Interest for 100000: ${"%.2f".format(int3)}")
        println(s"Interest for 1000000: ${"%.2f".format(int4)}")
        println(s"Interest for 10000000: ${"%.2f".format(int5)}")
    }
}
