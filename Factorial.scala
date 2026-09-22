/*
 * Factorial Program in Scala
 *
 * Compile:
 *   scalac Factorial.scala
 *
 * Run:
 *   scala FactorialDriver
 *
 * Or with Scala 3:
 *   scala Factorial.scala
 */

def factorial1(numIn: Int): Int = {
  var fac = 1
  var counter = numIn

  if (numIn > 0) {
    while (counter > 1) {
      fac = fac * counter
      counter = counter - 1
    }
    fac
  } else {
    -1
  }
}

object FactorialDriver {
  def main(args: Array[String]): Unit = {
    print("Enter the number >>> ")
    val input = scala.io.StdIn.readInt()

    if (factorial1(input) == -1) {
      println("Invalid Number in input !!!")
    } else {
      println(s"Factorial for $input is ${factorial1(input)}")
    }
  }
}
