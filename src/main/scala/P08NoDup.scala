object P08NoDup {

  //remove consecutive duplicates

  def dupStdRecursive[A](ls:List[A]):List[A] = ls match {
    case Nil => Nil
    case h::tail => h :: dupStdRecursive(tail.dropWhile( _ == h))
  }

  def dupTailRecursive[A](ls: List[A]) : List[A] = {
    def tailR(result: List[A], curList: List[A]) : List[A] = curList match {
      case h :: tail => tailR(h :: result, tail.dropWhile(_ == h))
      case Nil => result.reverse
    }
    tailR(Nil, ls)
  }

  // Tail recursive.
  def compressTailRecursive[A](ls: List[A]): List[A] = {
    def compressR(result: List[A], curList: List[A]): List[A] = curList match {
      case h :: tail => compressR(h :: result, tail.dropWhile(_ == h))
      case Nil       => result.reverse
    }
    compressR(Nil, ls)
  }

  def compressFunctional[A](ls:List[A]): List[A] =
    ls.foldRight(List[A]()){ (h,r) => {

      if(r.isEmpty || r.head != h) h :: r
      else r
    }
  }

  def main(args: Array[String]): Unit = {

    val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(dupStdRecursive(ls))
    println(dupTailRecursive(ls))
    println(compressTailRecursive(ls))
    println(compressFunctional(ls))
  }
}
