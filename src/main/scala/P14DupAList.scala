object P14DupAList {


  def duplicate[A](ls: List[A]): List[A] = {
    ls flatMap (e => List(e, e))
  }

  def main(args: Array[String]): Unit = {
    println(duplicate(List('a, 'b, 'c, 'c, 'd)))
  }
}
