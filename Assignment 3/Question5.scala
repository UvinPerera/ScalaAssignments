import scala.io.StdIn.readInt

object Question6 {
	  def main(args: Array[String]): Unit = {
		print("Enter number of terms in even terms to be summed:")
		var number:Int = readInt()
		var sum:Int = evenPrint(number)
		println("Sum of "+number.toString()+" terms in the even series is:"+sum.toString())
		
	  }

	

	def evenPrint(n:Int):Int = {
		if(n==0) {return 0}
		
		return 2*n+evenPrint(n-1)
		

	}
}

