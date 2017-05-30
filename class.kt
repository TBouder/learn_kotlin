class	Car(val Type: String, val Model: Int, var Price: Double,
			var Km: Int, var Owner: String)
{
	fun		SetPrice(newPrice:Double):Unit	{this.Price = newPrice}
	fun		GetPrice():Double?				{return (this.Price)}
}

fun		main(args: Array<String>)
{
	var	FirstCar = Car("BMW", 2015, 10000.5, 150, "Thomas")

	println(FirstCar.GetPrice())
	FirstCar.SetPrice(100.0)
	println(FirstCar.GetPrice())
}
