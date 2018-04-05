object countSort extends App{
  import util.Random.nextInt

  def countSort(input: List[Int], min: Int, max: Int): List[Int] =
    input.foldLeft(Array.fill(max - min + 1)(0)) { (arr, n) =>
      arr(n - min) += 1
      arr
    }.zipWithIndex.foldLeft(List[Int]()) {
      case (lst, (cnt, ndx)) => List.fill(cnt)(ndx + min) ::: lst
    }.reverse

  val x = List.fill(20)(100).map(nextInt)

  println("Przec sortowaniem: " + x)
  println("Po sortowaniu: " + countSort(x,1,100))

}