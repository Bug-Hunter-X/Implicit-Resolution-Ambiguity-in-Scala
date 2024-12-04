```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: T => Int): Int = ev(value)
}

object Main extends App {
  implicit val intToInt: Int => Int = identity
  val myInt = new MyClass(5)
  println(myInt.myMethod)

  implicit val stringToInt: String => Int = _.toInt
  val myString = new MyClass("10")
  println(myString.myMethod)

  //This will not compile because there is no implicit conversion defined for Double to Int
  val myDouble = new MyClass(3.14)
  //println(myDouble.myMethod) // Compilation error
}
```