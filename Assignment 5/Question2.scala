class Rational(x:Int,y:Int)
{
	def numerator=x;
	def denominator=y;
	
	def sub(rationalNum:Rational):Rational=  //does the subtraction
	{
		var tempNum=this.numerator*rationalNum.denominator-this.denominator*rationalNum.numerator 
		
		var tempDen=this.denominator*rationalNum.denominator
		
		var rat=new Rational(tempNum,tempDen)
		return rat
	}

	def printRat():Unit=
	{
		println(this.numerator+"/"+this.denominator) 	//prints rational number
	}

	

}


object Question2 {
	  def main(args: Array[String]): Unit = {
	
		val x = new Rational(3,4)
		val y = new Rational(5,8)
		val z = new Rational(2,7)
		val res = x.sub(y).sub(z)
		res.printRat
		

	
	}
}
