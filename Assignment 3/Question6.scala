import scala.io.StdIn.readInt

object Question6{
	  def main(args: Array[String]): Unit = {
		print("Enter number of terms in fibonacci series:")
		var number:Int = readInt()
		print("The series:")
		printSeries(number)
		print("\b ")
		println()
		
		
	  }

	

	def fibo(n:Int):Int = {
		if(n==1) {return 0}
		if(n==2) {return 1}
		
		return fibo(n-2)+fibo(n-1)
		

	}
	
	def printSeries(x:Int):Unit ={
	
		if(x==0) {return}
		
		else{
			printSeries(x-1)
			var temp:Int = fibo(x)
			print(temp.toString()+",")
		}

	}
}

