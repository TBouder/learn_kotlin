//Default Main Function to learn Kotlin

fun main(args: Array<String>)
{
	/*
	**	? at the end -> Can be null
	*/
	val		Bool:Boolean
	val		numberSecond:Int
	var		number:Int
	var		string:String
	var		stringSecond:String?

	/*
	**	!! at the end -> Cannot be null
	*/
	Bool = true
	println("Enter a Number: ")
	number = 10
	string = "Helloooo"
	println("Enter your Name: ")
	stringSecond = readLine()!!.toString()

	/*
	**	Output
	*/
	//"TERNAIRE"
	numberSecond = if (!Bool) 7 else 100
	println(string + ' ' + stringSecond + ' ' + number + ' ' + numberSecond)
	when (number)
	{
		1			-> println("number === 1")
		2			-> println("number === 2")
		3			-> println("number === 3")
		4			-> println("number === 4")
		in 5..42	-> println("number >= 5 && <= 42")
		!in 43..70	-> println("number <= 43 || >= 70")
		else		-> println("Nop")
	}

	for (item in 1..10)
		println("Item: " + item)
	while (number >= 1)
		println("Number: " + number--)
}
