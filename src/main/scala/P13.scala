object P13 {

  def encodeDirect[A](ls: List[A]) : List[(Int,Any)] =

    if (ls.isEmpty) Nil
    else {
      val (packed, next ) = ls span(_ == ls.head)
      (packed.length, packed.head) :: encodeDirect(next)
    }

  def main(args: Array[String]): Unit = {
    val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(encodeDirect(ls))
  }

}

