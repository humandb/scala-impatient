package io.humandb

object Chapter2 {
  def main(args: Array[String]): Unit = {
    exercise1()
    exercise2()
    exercise3()
    exercise4()
    exercise5()
    exercise6()
    exercise7()
    exercise8()
    exercise9()
    exercise10()
  }

  def exercise1(): Unit = {

    println(
      """
        | Exercise 1
        | The signum of a number is 1 if the number is positive, -1 if it's negative, and 0 if it is zero. Write a
        | function that computes this value.
      """.stripMargin)

    def signum(x: Int) = x match {
      case x if x < 0 => -1
      case x if x > 0 =>  1
      case _          =>  0
    }

    println(signum(20) + ": should be +1")
    println(signum(-3) + ": should be -1")
    println(signum(0)  + ": should be  0")
  }

  def exercise2(): Unit = {
    println(
      """
        | Exercise 2
        | What is the value of an empty block expresion {}? What's its type?
      """.stripMargin)

      println({})
      println({}.getClass())
  }

  def exercise3(): Unit = {
    println(
      """
        | Exercise 3
        | Come up with one situation where the assigment x = y = 1 is valid in Scala (Hint: Pick a suitable type for x)
      """.stripMargin)

    var x: Unit = {}
    var y: Int = 3
    x = y = 1
  }

  def exercise4() : Unit = {
    println(
      """
        | Exercise 4
        | Write a Scala equivalent for the Java loop
        | for (int i = 10; i >= 0; i--) System.out.println(i);
      """.stripMargin)

    for( i <- new Range(10, 0, -1)) {
      println(i)
    }
  }

  def exercise5() : Unit = {
    println(
      """
        | Exercise 5
        | Write a procedure countdown(n: Int) that prints out the numbers from n to 0
      """.stripMargin)

    def countdown(n: Int): Unit = {
      for ( i <- Range(n, 0, -1)) {
        println(i)
      }
    }

    countdown(5)
  }

  def exercise6(): Unit = {
    println(
      """
        | Exercise 6
        | Write a for loop for computing the product of the Unicode codes of all letters in a string. For example,
        | the product of the characters in "Hello" is 9415087488L
      """.stripMargin)

    var count = 1L
    for ( letter <- "Hello") {
      count *= letter
    }

    println("'Hello' value is " + count)
  }

  def exercise7(): Unit = {
    println(
      """
        | Exercise 7
        | Solve the preceding exercise without writing a loop. (Hint: Look at the `StringOps` Scaladoc)
        |
      """.stripMargin)

    val count = "Hello".foldRight(1L)( (x, y) => y * x)

    println("'Hello' value is " + count)
  }

  def exercise8(): Unit = {
    println(
      """
        | Exercise 8
        | Write a function product(s: String) that computes the product, as described in the preceding exercise
      """.stripMargin)

    def product(s: String): Long = {
      s.foldRight(1L)( (x, y) => y * x)
    }

    println("'Hello' value is " + product("Hello"))
  }

  def exercise9(): Unit = {
    println(
      """
        | Exercise 9
        | Make the function of the preceding exercise a recursive function
      """.stripMargin)

    def product(s: String): Long = {
      if (s.length == 1) {
        1L * s.head
      }else{
        s(0) * product(s.tail)
      }
    }

    println("'Hello' value is " + product("Hello"))
  }

  def exercise10(): Unit = {
    println(
    """
      | Exercise 10
      | Write a function that computes x^n, where n is integer. Use the following recursive definition:
      |
      | - x^n = y^2 if n is even and positive, where y = x^n/2
      | - x^n = x*x^-1 if n is odd and positive
      | - x^0 = 1
      | - x^n = 1/x^n if n is negative
      |
      | Don't use a return statement
    """.stripMargin
    )

    def my_pow(x: Float, n: Int): Float = {
      if (n == 0) {
        1
      } else {

        if (n == 2) {
          x * x

        } else {

          if (n > 0 & n % 2 == 1) {
            x * my_pow(x, n - 1)

          } else {

            if (n > 2 & n % 2 == 0) {
              my_pow(my_pow(x, n / 2), 2)

            } else {

              1 / my_pow(x, n)
            }
          }
        }
      }
    }

    println("Value of 2^10 = " + my_pow(2, 10))
    println("Value of 2^5  = " + my_pow(2, 5))

  }
}