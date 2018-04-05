object Hello extends App {

  //Deklaracja stałej; val nazwastalej = wartosc
  val mojaStala = 1234
  println(mojaStala)

  //Deklaracja zmiennej; var nazwaZmiennej : typ = wartosc
  var mojaZmienna : String = "\nOpen the pod bay doors, HAL."
  println(mojaZmienna)



  //Deklaracja funkcji; def nazwaFunkcji (wartości) : typ = { kod }
  def mojaFunkcja( ) : Unit = {
    println("I'm sorry, Dave. I'm afraid I can't do that.")
  }
  //Wywołanie funkcji
  mojaFunkcja()



  //Deklaracja klasy; class nazwaKlasy (wartości) { ciało klasy }
  class osoba (val imie: String, val nazwisko: String) {

    val pelne : String = imie + " " + nazwisko

    def caleImieiNazwisko( ) : Unit = {
      println(pelne)
    }

    def tylkoImie( ) : Unit =  {
      println(imie)
    }

    def tylkoNazwisko( ) : Unit = {
      println(nazwisko)
    }
  }

  //Wywołanie klasy
  val p = new osoba("Adrian", "Rupala")
  p.caleImieiNazwisko()
  p.tylkoImie()
  p.tylkoNazwisko()



  //Zdefiniowane singletonu; object nazwaSingletonu { ciało singletonu; jakieś czynności }
  object Logger {

    def info (message: String): Unit = {
        println(s"\nWiadomość: $message")
      }

    info("Singleton ogranicza towrzenie obiektów danej klasy do jednej instancji oraz zapewnia globalny dostęp do stworzone obiektu.")
  }

  //Wywołanie singletonu
  Logger
}