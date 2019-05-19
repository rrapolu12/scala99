object P07Flatten {

  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }

  def main(args: Array[String]): Unit = {

    val ls = List(List(1,2),List(3,4),List(5,6))
    println(flatten(ls))
  }
}
