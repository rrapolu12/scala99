object P06Palindrome {

def isPanlindrome[A](ls:List[A]): Boolean = ls == ls.reverse

  def main(args: Array[String]): Unit = {
    val ls = List(1, 2, 3, 2, 1)
    println(isPanlindrome(ls))
  }
}
