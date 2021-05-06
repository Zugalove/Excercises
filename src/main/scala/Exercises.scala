def main(args: Array[String]): Unit = {
  // display our an inner class works
  print(" Hello, Scala , ICE Electives ")
  val ex = new Exercises()
  print(3, 4, 5)

}

class Exercises {
  //the out class for nested functions
  def shapes(x: Double, y: Double, z: Double) = {
    // the inner class
    def square(): Unit = {
      val square = x * x
      print(" The Area of Square is : " + square)
    }

    // the second inner class
    def triangle(): Unit = {

      val z = 0.
      //added a variable to the formula
      val triangle = x * y * z
      print("The Area of Tingle is : " + triangle)
    }
    // calling the two methods
    square()
    triangle()

  }

}
