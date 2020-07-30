class Rational(numerator:Int,denominator:Int)
{
	def neg()
	{
		println("Negative value is ="+"-"+numerator+"/"+denominator)
	}

}


object Question1 {
	  def main(args: Array[String]): Unit = {
	
		
		val x = new Rational(1,2)	//Rational number is 1/2
		x.neg				//Prints the negative value of rational number which is -1/2

	
	}
}
