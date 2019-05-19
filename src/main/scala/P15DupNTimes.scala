
object P15DupNTimes {

  def duplicateN[A](n: Int, ls: List[A]): List[A] =
    ls flatMap { List.fill(n)(_) }

  def main(args: Array[String]): Unit = {

    val ls = List('a, 'b, 'c, 'c, 'd)
    println(duplicateN(3,ls))
  }
}
