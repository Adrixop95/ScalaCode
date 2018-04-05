object Hello extends App {

  //Deklaracja klasy; class nazwaKlasy (wartości) { ciało klasy }
  class obliczenia () {

    //Funkcja obliczająca wybrany przez użytkownika element z ciągu Fibonacciego
    def fibonacciReturn(n : Long) : Long = {
      if (n == 0 || n == 1) {
        return n
      }

      return fibonacciReturn(n - 1) + fibonacciReturn(n - 2)
    }

    def fibonacciwReturn(n : Long) : Long = {
      if (n == 0 || n == 1) {
        return n
      }

      fibonacciwReturn(n - 1) + fibonacciwReturn(n - 2)
    }
  }

  //Wywołanie klasy (przypisanie do wartości p)
  val p = new obliczenia()

  //Przykład pętli "For"
  var a = 0

  println("Ile iteracji chcesz przeprowadzić?")
  val input = scala.io.StdIn.readInt()

  for (a <- 0 to input) {
    println("Iteracja: "+ a + " Wynik: " + p.fibonacciReturn(a))
  }
  for (a <- 0 to input) {
    println("Iteracja: "+ a + " Wynik: " + p.fibonacciwReturn(a))
  }
}
