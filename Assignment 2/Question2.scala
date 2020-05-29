import scala.util.control.Breaks._
object Question2 {
	  def main(args: Array[String]): Unit = {
		    
		println("Maximum profit gained per show is:"+profit())
	  }

	def profit():Double={
		
		var noOfVisitors:Double=25
		var ticketPrice:Double=0
		var before:Double=0
		var after:Double=0
		var profit:Double=0
		
		breakable{
			while(true){

				ticketPrice=(180-noOfVisitors)/4
				before = (noOfVisitors*ticketPrice)-(500+3*noOfVisitors)
				ticketPrice=(180-(noOfVisitors+1))/4
				after = ((noOfVisitors+1)*ticketPrice)-(500+3*(noOfVisitors+1))
				if(after<before) {
					profit=before
					break
				}
				noOfVisitors=noOfVisitors+1
				
			}
	}
		
		
		return profit
	}
}
