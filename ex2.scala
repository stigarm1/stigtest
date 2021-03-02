object ex2 {
   def main(args:Array[String]) {
      println(matchTest(2))
      println(dos(3))
   }
   
   def matchTest(x:Int):String = x match{
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case 4 => "four"
      case _ => "many"
   }
   def dos(x:Int):Int=2*x
}
