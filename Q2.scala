object Q2 {
  def main(args: Array[String]): Unit = {
    print("Enter  number: ")
    val InputNumber = scala.io.StdIn.readInt()

    patternMatching(InputNumber)
  }

  def patternMatching(InputNumber: Int): Unit = {
    InputNumber match {
      case number if number <= 0 => println("Given number is a NEGATIVE NUMBER")
      case number if number == 0 => println("Given number is ZERO")
      case _ =>
    }

    InputNumber match {
      case number if number % 2 == 0 => print("Given number is an EVEN NUMBER")
      case _ => print("Given number is an ODD NUMBER")
    }
  }
}
