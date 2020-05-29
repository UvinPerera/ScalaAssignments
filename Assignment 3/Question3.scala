import scala.io.StdIn.readInt

object Question3 {
	  def main(args: Array[String]): Unit = {

		println("Enter value for n:")
		var number : Int = readInt()
		print("Sum from 1 to "+number.toString()+" is:")
		print(sum(number))
		println()
	  }

	def sum(n:Int):Int = {
		
		if(n == 0){
			
			return 0
		}
		
		return n+sum(n-1)

	}
}

