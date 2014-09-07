package io.humandb

object Chapter3 {
  def main(args: Array[String]): Unit = {
    exerices1()
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
        | Wite a code snippet that sets a to an array of n random integers between 0 (inclusive) and n (exclusive)
        |
      """.stripMargin)

  }

  def exercise2(): Unit = {
    println(
      """
        | Exercise 2
        | Write a loop that swaps adjacent elements of an array of integers. For example, Array(1,2,3,4,5) becomes
        | Array(2,1,4,3,5)
        |
      """.stripMargin)
  }

  def exercise3(): Unit = {
    println(
      """
        | Exercise 3
        | Repeat the preceding assignment but produce a new array with the swapped values. Use for/yield
        |
      """.stripMargin)
  }

  def exercise4(): Unit = {
    println(
      """
        | Exercise 4
        | Given an array of integers, produce a new array that contains all positive values of the original array,
        | in their original order, followed by all values that are zero or negative, in their original order.
        |
      """.stripMargin)
  }

  def exercise5(): Unit = {
    println(
      """
        | Exercise 5
        | How do you compute the average of an Array[Double]
        |
      """.stripMargin)
  }

  def exercise6(): Unit = {
    println(
      """
        | Exercise 6
        | How do you rearrange the elements of an Array[Int] so that they appear in reverse sorted order? How do you
        | do the same with an ArrayBuffer[Int]
      """.stripMargin)
  }

  def exercise7(): Unit = {
    println(
      """
        | Exercise 7
        | Write a code snippet that produces all values from an array with duplicates removed. (Hint: Scaladoc)
      """.stripMargin)
  }

  def exercise8(): Unit = {
    println(
      """
        | Exercise 8
        | Rewrite the example at the en of Section 3.4. Collect indexes of the negative elements, reverse the sequence,
        | drop the last index, and call a.remove(i) for each index. Compare the efficiciency of this approach with the
        | two approaches in Section 3.4
        |
      """.stripMargin)
  }

  def exercise9(): Unit = {
    println(
      """
        | Exercise 9
        | Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDS that are in America.
        | Strip off the "America/" prefix and sort the result.
      """.stripMargin)
  }

  def exercise10(): Unit = {
    println(
      """
        | Exercise 10
        | Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with the call
        |   `SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]`
        | Then call `getNativesForFlavor` method with parameter `DataFlavor.imageFlavor` and get the return
        | value as a Scala buffer. (Why this obscure class? It's hard to find uses of java.util.List in the
        | standard Java library).
      """.stripMargin)
  }
}