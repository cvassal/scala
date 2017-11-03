object Ex01 extends App {
  val srcList = List(1,2,3,4,5,6)

  val newList: List[Int] = srcList.map(number => number*2)
  val newList2: List[Int] = for (num <- srcList) yield (num*2)

  val sumOfNewList: Int = newList.reduce((number1, number2 )=> number1+number2)

  val about: String = "[" + newList.mkString(",") + "] = " + sumOfNewList

  println(about)
}
