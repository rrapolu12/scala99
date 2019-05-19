object P02LastButOne {

  def lastButOne[A](ls: List[A]): A = {
    ls.init.last
  }

  def lastButOneRecursive[A](ls: List[A]): A = ls match {

    case h :: _ :: Nil => h
    case _ :: tail => println(tail); lastButOneRecursive(tail)
    case _ => throw new NoSuchElementException

  }

  def main(args: Array[String]): Unit = {
    val ls = List(1, 2, 3, 4, 5)
    println(lastButOne(ls))
    println(lastButOneRecursive(ls))
  }
}
