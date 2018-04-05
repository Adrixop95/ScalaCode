object Hello2 extends App {
  def sum1(ns: Int*): Int = {
    ns.foldLeft(0)((n, m) => n + m)
  }

  def sumR(ns: Int*): Int = {
    ns.foldLeft(0)((n, m) => return n + m)
  }

  println(sum1(33, 42, 99))
  println(sumR(33, 42, 99))
}
