import scala.util.Try

class EssentialsRecap {

  // values
  val aBoolean: Boolean = false

  // expression are EVALUATED to a value
  val anIfExpression = if (2 > 3) "bigger" else "smaller"

  // instructions vs expressions
  val theUnit = println("Hello, Scala") // Unit = "void" in the other languages

  // OOP
  class Animal
  class Cat extends Animal
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  // inheritance model: extend <= 1 class, but inherit from >= 0 traits
  class Crocodile extends Animal with Carnivore {
    override def eat(animal: Animal): Unit = println("Crunch!")
  }

  // singleton
  object MySingleton // singleton pattern in one line!

  // companions
  object Carnivore // companion object of the class Carnivore

  // generics
  class MyList[A]

  // method notations (prefix, infix, postfix)
  val three = 1 + 2
  val anotherThree = 1.+(2) // infix

  // Infix notation: calling the method without a dot and parentheses.
  val containsTwo = list contains 2
  val list = List(1, 2, 3)

  // Postfix notation: calling a parameterless method without a dot.
  import scala.language.postfixOps
  val headElement = list.head

  println(s"List contains 2: $containsTwo, head element: $headElement")

  // functional programming
  val incrementer: Int => Int = x => x + 1
  val incremented = incrementer(45) // 46

  // map, flatMap, filter
  val processedList = List(1, 2, 3).map(incrementer) // List(2, 3, 4)
  val aLongerList = List(1, 2, 3).flatMap(x => List(x, x + 1)) // List(1,2, 2,3, 3,4)

  // options and try
  val anOption: Option[Int] = Option( /* something that might be null */ 3) // Some(3)
  val doubledOption: Option[Int] = anOption.map(_ * 2)

  val anAttempt = Try( /* something that might throw */ 42) // Success(42)

  // TODO: Missing section parts

  // some more advanced stuff
  trait HigherKindedType[F[_]]
  trait SequenceChecker[F[_]] {
    def isSequential: Boolean
  }

  val listChecker = new SequenceChecker[List] {
    override def isSequential: Boolean = true
  }
}
