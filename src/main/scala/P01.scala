object P01 {

  def lastBuiltIn[A](ls: List[A]): A = {
    ls.last
  }

  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil => h
    case _ :: tail => lastRecursive(tail)
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    val ls = List(1, 2, 3, 4, 5)
    println(lastBuiltIn(ls))
    println(lastRecursive(ls))
  }
}

