
object Ceaser {
	  def main(args: Array[String]): Unit = {
		
		val asciiSize : Int = 255 // my alphabet is the extended ascii table
		var key =1 // the shift increment
		var str :String = "AbCD" //string needed to be encrypted 

		val encrypt = (c:Char, key:Int) => (((c.toInt+key)%asciiSize).toChar) //encrypted by 1st turning to is corresponding ascii value,add the shift and turned to a character
		val decrypt = (c:Char, key:Int) => (((if(c.toInt<key) asciiSize+(c.toInt-key) else(c.toInt-key))%asciiSize).toChar) // the reverse of above process, conditions applied to avoid negative indexes


		var pp =str.toCharArray.map(x=>encrypt(x,key)) //makes a char array, applies the encrypt algorith and stores in a variable
		var result = pp.mkString("") // makes the char array to string

		var ppp =result.toCharArray.map(x=>decrypt(x,key)) //makes a char array, applies the decrypt algorith and stores in a variable
		var result1 = ppp.mkString("") // makes the char array to string
		
		println("Encrypted string:"+result) //encrypted data
		println("Decrypted string:"+result1) // decrepted data

}

}




