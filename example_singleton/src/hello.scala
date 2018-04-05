object hello extends App {


  //Zdefiniowane pierwszego singletonu; object nazwaSingletonu {ciało singletonu}
  object generujRandom {

    def generuj() : Unit = {
      import util.Random.nextInt

      val x = List.fill(10)(100).map(nextInt)
      println("\n" + x)
      println(x.sorted)
    }

    //Wywołanie drugiego singletonu;
    wywolaj.wywolaj10()
  }

  //Zdefiniowane drugiego singletonu;
  object wywolaj {

    def wywolaj10(): Unit = {
      for ( x <- 0 to 10) {
        generujRandom.generuj()
      }
    }
  }

  //Wywołanie kolejnego singletonu;
  generujRandom
}