object Ex00 extends App {
  for (a <- 1 to 42) yield println(42)
  println("***************************************")
  var a = 0
  while (a < 42) {
    println(42)
    a = a+1
  }
  println("***************************************")
  (1 to 42) foreach(_ => println(42))
}
