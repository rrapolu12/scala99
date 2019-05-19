object P05ReverseList {

  def reverseBuiltin[A](ls: List[A]): List[A] = ls.reverse

  def reverseRecursive[A](ls:List[A]):List[A] = ls match {
    case Nil => Nil
    case h :: tail => reverseRecursive(tail) ::: List(h)
  }

  def reverseTailR[A](ls: List[A]):List[A] = {
    def tailR(result: List[A], curList: List[A]): List[A] = ls match {
      case Nil => result
      case h :: tail => tailR(h :: result, tail)
    }
    tailR(Nil,ls)
  }

  def main(args: Array[String]): Unit = {

    val ls = List(1,2,3,4,5)
    println(reverseBuiltin(ls))
    println(reverseRecursive(ls))
    println(reverseTailR(ls))
  }

}
