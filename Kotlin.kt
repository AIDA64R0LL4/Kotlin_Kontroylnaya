import PackageBakery.Bakery as pBekaryShop
fun main(){
    println("Если хотите узнать информацию о Брауни, то введите с клавиатуры 1, если хотите узнать информацию о Эклерах, то введите с клавиаутуры 2")
    var X = readLine()!!.toInt()
    if(X==1) {
        var Brownie = BekaryShop("Брауни", "Песочное", "Баварский крем")
        println("Напишите калорийность пироженого")
        var Calories = readLine()!!.toDouble()
        Brownie.SetCalories(Calories)
        println("Напишите стоимость пироженого")
        var Price = readLine()!!.toDouble()
        Brownie.SetPrice(Price)
        Brownie.BakeryInfo()
    }
    if(X==2) {
        var eclairs = BekaryShop("Эклеры", "Песочное", "Молочный крем")
        println("Напишите калорийность пироженого")
        var Calories1 = readLine()!!.toDouble()
        eclairs.SetCalories(Calories1)
        println("Напишите стоимость пироженого")
        var Price1 = readLine()!!.toDouble()
        eclairs.SetPrice(Price1)
        eclairs.BakeryInfo()
    }

}
