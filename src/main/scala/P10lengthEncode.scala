object P10lengthEncode {

  import P09DupSubList.pack

  def encode[A](ls: List[A]): List[(Int,A)] = {

    pack(ls) map {e => (e.length,e.head)}
  }

  def main(args: Array[String]): Unit = {

    val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(encode(ls))
  }
}
