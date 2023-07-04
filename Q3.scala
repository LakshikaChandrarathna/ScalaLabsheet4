object Q3 {
  def main(args: Array[String]): Unit = {
    val inputName = scala.io.StdIn.readLine("Enter  Name: ")

    println()
    println("1 - uppercase")
    println("2 - Capitalize the second letter of the name")
    println("3 - lowercase")
    println("4 - Capitalize the last letter of the name")
    println()

    val choice = scala.io.StdIn.readLine("Enter your choice - ").toInt

    val formattedName = selectType(choice, inputName)
    println("Formatted based on the provided formatFunction - " + formattedName)
  }

  def converttoUpper(inputString: String): String = {
    inputString.toUpperCase
  }

  def converttoLower(inputString: String): String = {
    inputString.toLowerCase
  }

  def Nametype(name: String, formatFunction: String => String): String = {
    formatFunction(name)
  }

  def selectType(choice: Int, inputName: String): String = {
    choice match {
      case 1 => Nametype(inputName, converttoUpper)
      case 2 => Nametype(inputName, str => str.head + (str.charAt(1).toUpper + str.drop(2)))
      case 3 => Nametype(inputName, converttoLower)
      case 4 => Nametype(inputName, str => str.init + str.last.toUpper)
      case _ => "You made an Invalid choice"
    }
  }
}
