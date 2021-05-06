class Exercises {
  def main(args: Array[String]) {
    println(" " + shapes(3, 4, 5))
  }

  //the out class for nested functions
  def shapes(x: Double, y: Double, z: Double) {
    // the inner class
    def square(): Unit = {

      print(" The Area of Square is : " + x * x)

    }

    // the second inner class
    def triangle() {

      //added a variable to the formula

      print("The Area of Tingle is : " + x * y * z)

    }


    triangle()
    triangle()

  }


}

