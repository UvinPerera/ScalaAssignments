import scala.io.StdIn.readInt

object Question2 {
	  def main(args: Array[String]): Unit = {

		println("Enter number of terms to print in series:")
		var number : Int = readInt()
	
		primeSeq(number)
		print("\b")
		print(" ")
		println()
	  }

	def isPrime(input:Int,flag:Int=0,iterativeArg:Int):Unit={

		if(input<=1 || flag>2){
			return 
		}

		if(iterativeArg>input){
			print(input.toString()+",")
			return 
		}
		
		if(input%iterativeArg == 0){
			if(iterativeArg<=input){
				isPrime(input,flag+1,iterativeArg+1)
			}
		}
		
		else if(iterativeArg<=input){
				isPrime(input,flag,iterativeArg+1)
			}

		return 
	
	}

	def primeSeq(numberOfTerms:Int): Unit={
		if(numberOfTerms == 0) {return}
		
		else{
				
			primeSeq(numberOfTerms-1)
			isPrime(numberOfTerms,0,1)
		
		}

	}
}
