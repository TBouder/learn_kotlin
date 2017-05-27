//Default Main Function to learn Kotlin

/*
**	Function Overload
*/
fun	sum(n1: Double, n2: Double):Double
{
	return (n1 + n2);
}
fun	sum(n1: Int, n2: Int):Int
{
	return (n1 + n2);
}

/*
**	Function Polymorph
*/
fun	show(number: Int):Unit
{
	println(number)
}
fun	show(float: Double):Unit
{
	println(float)
}
fun	show(str: String):Unit
{
	println(str)
}

// ---------------------------------------------------------------------------//

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
	var		array = ArrayList<String>()

	/*
	**	!! at the end -> Cannot be null
	*/
	Bool = true
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
		println("Item: ${item}")
	while (number >= 1)
		println("Number: ${number--}")

	array.add("Test")
	array.add("Testeu")
	array.add("Testa")
	array.add("Tester")
	array[2] = "Maison"

	for (elem in array)
		println("${elem}")
	if (array.contains("Maison"))
		println("YEP")
	else
		println("NOP")

	println(sum(10.3, 42.0));
}
