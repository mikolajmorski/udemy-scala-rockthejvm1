package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {


  def factorial(n: Int): Int = {
    if(n <= 1) 1
    else n * factorial(n-1)
  }



  def factorialTailRecursion(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, acumulator: BigInt): BigInt = {
      if(x <= 1) acumulator
      else factorialHelper(x-1, x*acumulator)
    }
    factorialHelper(n, 1)
  }

  println(factorialTailRecursion(20000))

  //WHEN NEED LOOPS, USE Tail_Recursion


}
