package lectures.part1basics

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value "+ x)
    println("by value "+ x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name " + x)
    println("by name " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def inifinite(): Int = 1 + inifinite()

  def printlnFirst(x: Int, y: => Int): Unit = println(x)

  printlnFirst(42, inifinite())
}
