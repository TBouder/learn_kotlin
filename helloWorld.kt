//Default Main Function to learn Kotlin

fun main(args: Array<String>)
{
	val		numberSecond:Int
	var		number:Int
	var		string:String
	var		stringSecond:String?

	numberSecond = 42
	println("Enter a Number: ")
	number = readLine()!!.toInt()
	string = "Helloooo"
	println("Enter your Name: ")
	stringSecond = readLine()!!.toString()
	println(string + ' ' + stringSecond + ' ' + number + ' ' + numberSecond)
}
