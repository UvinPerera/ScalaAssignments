import scala.io.StdIn.readInt

object Question1 {
	  def main(args: Array[String]): Unit = {

		println("Enter number:")
		var number : Int = readInt()
			    
		prime(number,0,1)
	  }

	def prime(input:Int,flag:Int=0,iterativeArg:Int):Unit={
		if(input<=1 || flag>2){
			println("Not a prime number")
			return 
		}

		if(iterativeArg>input){
			println("Prime number")
			return
		}
		
		if(input%iterativeArg == 0){
			if(iterativeArg<=input){
				prime(input,flag+1,iterativeArg+1)
			}
		}
		
		else if(iterativeArg<=input){
				prime(input,flag,iterativeArg+1)
			}

		
		

	
	}
}
