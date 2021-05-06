def main(args: Array[String]): Unit = {
  // display our an inner class works
  print(" Hello, Scala , ICE Electives ")
  val ex = new Exercises()
  print(3, 4, 5)


}

class Exercises {
  def shapes(x: Double, y: Double, z: Double) = {

    def square(): Unit = {
      val square = x * x
      print(" The Area of Square is : " + square)
    }

    def triangle(): Unit = {

      val z = 0.5
      val triangle = x * x * z
      print("The Area of Tingle is : " + triangle)
    }

    square()
    triangle()

  }

}
