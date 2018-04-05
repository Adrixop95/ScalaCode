object Hello extends App {

  //Deklaracja funkcji anonimowej
  var x = (q:Int) => q+1
  println(x(10))

  //Deklaracja funkcji anonimowej z wieloma parametrami
  var z = (w: Int, e: Int) => w*e
  println(z(2,20))

}