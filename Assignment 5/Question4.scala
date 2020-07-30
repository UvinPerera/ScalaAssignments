class Account(id:String,n:Int,bal:Double)
{
	val nic:String=id
	val anumber:Int=n
	var balance:Double=bal

	def printAccount():Unit= // prints account details
	{
		println("NIC:"+this.nic)
		println("Acc NO:"+this.anumber)
		println("Balance:"+this.balance)
		println()
			
	}

}


object Question4 {
	  def main(args: Array[String]): Unit = {

		val acc1 = new Account("123V",123,10000)	
		val acc2 = new Account("234V",234,10000)	
		val acc3 = new Account("345V",345,-10000)
		var bank:List[Account]=List(acc1,acc2,acc3)
		listNegativeAccounts(bank) //lists all negative balanced accounts
		sumOfAccounts(bank) // shows the sum of accounts
		intrestCalculator(bank) //intrest calculator

		println("**** Summary ****")
		println()
		for(elem<-bank) elem.printAccount //prints all existsing accounts
		
	
	}

	def listNegativeAccounts(bnk:List[Account]):Unit=
	{
		val res = bnk.filter(_.balance<0)
		println("**** Banks with negative balances ****")
		if(res.size == 0) println("None\n") // shows a message when no negative balanced accounts are presented
		for(element<-res) // prints negative balanced account
		{
			element.printAccount
			
		}
			
	}
	
	def sumOfAccounts(bnk:List[Account]):Unit=
	{
		val amountList = bnk.map(x=>x.balance) // creates a list of balances
		val sum = amountList.reduce((x,y)=>x+y) // takes sum of balances
		println("Total sum of accounts:"+sum) // prints balanaces
	}

	def intrestCalculator(bnk:List[Account]):Unit =
	{
		for(element<-bnk)
		{
			if(element.balance>=0) element.balance*=(1+0.05/100) // intrest for positive balanced accounts 0.05%
			else element.balance*=(1+0.1/100) // intrest for negative balanced accounts 0.1%
		
		}
		
	}

}
