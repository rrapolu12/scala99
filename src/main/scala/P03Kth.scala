object P03Kth {

  def nthBuiltIn[A](n:Int, ls:List[A]): A = {
    if(n >= 0) ls(n)
    else throw new NoSuchElementException
  }

  def nthRecursive[A](n:Int, ls:List[A]):A = (n,ls)match {
    case (0, h :: _)      => h
    case (n, _ :: tail)   =>  nthRecursive(n - 1,tail)
    case (_,Nil)          => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    val ls = List(1,2,3,4,5)
    println(nthBuiltIn(2,ls))
    println(nthRecursive(2,ls))
  }

}
