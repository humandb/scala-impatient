package io.humandb

object Chapter4 {
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
        | Set up a map of prices for a number of gizmos that you covet. Then produce a second map with the same keys
        | and the prices at a 10 percent discount.
        |
      """.stripMargin)

    val myMap = ( "iPad" -> 100, "iPhone" -> 200, "iPod" -> 140)
  }

  def exercise2(): Unit = {
    println(
      """
        | Exercise 2
        | Write a program that reads words from a file. Use a mutable map to count how often each word appears. To read
        | the words, simply use `java.util.Scanner`.
        | At the end, print out all words and their counts.
        |
      """.stripMargin)

    val myMap =  ( "iPad" -> 100, "iPhone" -> 200, "iPod" -> 140)
  }

  def exercise3(): Unit = {
    println(
      """
        | Exercise 3
        | Repeat the preceding exercise with an inmutable map.
        |
      """.stripMargin)
  }

  def exercise4(): Unit = {
    println(
      """
        | Exercise 4
        | Repeat the preceding exercise with a sorted map, so that the words are printed in sorted order.
        |
      """.stripMargin)
  }

  def exercise5(): Unit = {
    println(
      """
        | Exercise 5
        | Repeat the preceding exercise with a `java.util.TreeMap` that you adapt to the Scala API.
        |
      """.stripMargin)
  }

  def exercise6(): Unit = {
    println(
      """
        | Exercise 6
        | Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY, and similarly for the other
        | weekdays. Demonstrate that the elements are visited in insertion order.
        |
      """.stripMargin)
  }

  def exercise7(): Unit = {
    println(
      """
        | Exercise 7
        | Print a table of all Java properties, like this:
        | ( ... see book ... )
        | You need to define the length of the longest key before you can print the table.
        |
      """.stripMargin)
  }

  def exercise8(): Unit = {
    println(
      """
        | Exercise 8
        | Write a function minmax(values: Array[Int]) that returns a pair containing the smallest and largest values
        | in the array.
        |
      """.stripMargin)
  }

  def exercise9(): Unit = {
    println(
      """
        | Exercise 9
        | Write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing the counts of values
        | less than v, equal to v and greater than v.
        |
      """.stripMargin)
  }

  def exercise10(): Unit = {
    println(
      """
        | Exercise 10
        | What happens when you zip together two strings, such as "Hello".zip("World)? Come up with a plausible use case.
        |
      """.stripMargin)
  }
}