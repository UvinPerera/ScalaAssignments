object Question1 {
	  def main(args: Array[String]): Unit = {
		println("Salary taken by a typical employee for a week is:"+salary(40,20,0.1))	    
		
	  }

	def salary(workHours:Int,OT:Int,taxRate:Double):Double={
		var workRate:Double = 150
		var OTRate:Double = 75
		var totalSalary = (workHours*workRate+OT*OTRate)*(1-taxRate)
		return totalSalary
	}
}
