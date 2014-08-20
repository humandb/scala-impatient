package io.humandb

/**
  * High-Order Functions
  */
object Chapter12 {
	
	def main(args: Array[String]): Unit = {
		exercise1()
	}

	/**
     * Write a function `values(fun: (Int) => Int, low: Int, high: Int)` that yields
     * a collection of function inputs and outputs in a given range. For example,
     * `values( x => x * x, -5, 5)` should produce a collection of pairs 
     * `(-5,25),(-4,16), ..., (5, 25)`
     */
	def exercise1(): Unit = {

		def values( fun: (Int) => Int, low: Int, high: Int): List[(Int, Int)] = {
			for( i <- low to int) {
				yield List(i, fun(i))
			}
		}

		val test = values( (x => x * x ), -5, 5)
		println(test)
	}
}
