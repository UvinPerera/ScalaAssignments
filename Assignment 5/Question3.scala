class Account(id:String,n:Int,bal:Double)
{
	val nic:String=id
	val anumber:Int=n
	var balance:Double=bal

	def transfer(acc:Account,amount:Int):Unit=
	{
		this.balance=this.balance+amount // increases balance of this object
		acc.balance=acc.balance-amount   // reduces the balance of the second object
	}
	
	def printAcc():Unit= // prints account details
	{
		println("NIC:"+this.nic)
		println("Account Number:"+this.anumber)
		println("Balanace:"+this.balance)
	}

}


object Question3 {
	  def main(args: Array[String]): Unit = {
	
		var acc1 = new Account("89778uhj",12,100) // account object 
		var acc2 = new Account("89798uhj",11,50) // account object
		acc1.transfer(acc2,25) //transfers 25 ammount from acc2 to acc1
		acc1.printAcc
		println()
		acc2.printAcc
		
		
	
	}
}
