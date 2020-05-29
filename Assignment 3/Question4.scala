import scala.io.StdIn.readInt

object Question4 {
	  def main(args: Array[String]): Unit = {
		print("Enter number of terms in even and odd series:")
		var number:Int = readInt()
		println("Odd series")
		oddPrint(number)
		println("\nEven series")
		evenPrint(number)
		println()
		
	  }

	def oddPrint(n:Int):Unit = {
		if(n==0) {return}
		else{

			oddPrint(n-1)	
			var x:Int = 2*n+1	
			print(x.toString()+" ")
			
		}

	}

	def evenPrint(n:Int):Unit = {
		if(n==0) {return}
		else{
				
			evenPrint(n-1)	
			var x:Int = 2*n	
			print(x.toString()+" ")
			
		}

	}
}

