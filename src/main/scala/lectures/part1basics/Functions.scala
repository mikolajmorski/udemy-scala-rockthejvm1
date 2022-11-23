package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int) = {
    a + " "  + b
  }

  println(aFunction("Hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n==1)aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))


  //Wheen need loops, use recursion.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int) : Int = {
    def aSmallerFunction(a: Int, b: Int) : Int = a+b

    aSmallerFunction(n, n-1)
  }

  /*
   1. A greeting function (name, age => Hi my name it $name and I am $age years old
   2. Factorial function 1 * 2*3*.....*n
   3. A fibonaci function f(1)=1 f(2)=1
   f(n)=f(n-1) + f(n-2)
   4. Test is a number is prime
   */

  def greetingFunction(name: String, age:Int): Unit = {
    print("Hi my name is " + name + " and I am age " + age)
  }

  def factorialFunction(n: Int): Int = {
    if(n>1) n*factorialFunction(n-1)
    else n
  }

  private val i: Int = factorialFunction(5)
  println(i)

  def fibonaciFunction(n: Int): Int = {
    if(n<= 2) 1
    else fibonaciFunction(n-1) + fibonaciFunction(n-2)

  }

  private val f: Int = fibonaciFunction(8)
  println("Fibonaci " +f)

  def primeNumbers(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if(t<=1) true
      else n % t != 0 && isPrimeUntil(t-1)
    isPrimeUntil(n/2)

  }

  private val prime = primeNumbers(4)
  println("Prime: " + prime)

}
