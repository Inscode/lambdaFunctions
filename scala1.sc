object InterestCalculator {
  def calculateInterest(depositAmount: Double): Double = {
    val interestRate = depositAmount match {
      case amount if amount <= 20000 => 0.02
      case amount if amount <= 200000 => 0.04
      case amount if amount <= 2000000 => 0.035
      case _ => 0.065
    }

    val calculate = (amount: Double, rate: Double) => amount * rate

    calculate(depositAmount, interestRate)
  }

  def main(args: Array[String]): Unit = {
    val deposit1 = 15000.0
    val deposit2 = 100000.0
    val deposit3 = 500000.0
    val deposit4 = 2500000.0

    println(s"Interest for Rs. $deposit1: ${calculateInterest(deposit1)}")
    println(s"Interest for Rs. $deposit2: ${calculateInterest(deposit2)}")
    println(s"Interest for Rs. $deposit3: ${calculateInterest(deposit3)}")
    println(s"Interest for Rs. $deposit4: ${calculateInterest(deposit4)}")
  }
}
