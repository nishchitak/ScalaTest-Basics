import scala.collection.mutable.ListBuffer

object BasicDataStructures {

  def main (args: Array[String]): Unit = {
    println("\nHello World")
    workingWithArrays()

  }

  def workingWithArrays(): Unit = {
    // Example of an Array holding few Integers
    val plainOldNumbers: Array[Int] = new Array[Int](4)
    plainOldNumbers(0)=0
    plainOldNumbers(1)=1
    plainOldNumbers(2)=2
    plainOldNumbers(3)=3
    print("\nPlain Old Numbers: ")
    for (i <- 0 to 3) {
      print(plainOldNumbers(i))
    }


    // Example of an Array loading its value into a ListBuffer(based on a condition) & then finally producing a List
    val greetStrings: Array[String] = new Array[String](8)
    val greetStringsStartingWithH_ListBuffer = new ListBuffer[String]
    greetStrings(0)="Hello"
    greetStrings(1)="Namaste"
    greetStrings(2)="Hola"
    greetStrings(3)="Bonjour"
    greetStrings(4)="Hi"
    greetStrings(5)="Halo"
    greetStrings(6)="Ola"
    greetStrings(7)="Hey"

    for(i <- 0 to 7) {
      if (greetStrings(i).startsWith("H")) {
        greetStringsStartingWithH_ListBuffer+= greetStrings(i)
      }
    }
    val greetStringsStartingWithH_List = greetStringsStartingWithH_ListBuffer.toList

    println("\n\nGreet Strings Starting With H: ")
    print(greetStringsStartingWithH_ListBuffer)
    println("")
    println(greetStringsStartingWithH_List)

  }



}
