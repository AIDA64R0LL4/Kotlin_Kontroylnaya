import PackageBakery.Bakery
class BekaryShop (NameCake: String, Dough: String, Сream: String) : Bakery(NameCake,Dough,Сream){
    private var Price: Double=45.0;
    public fun SetPrice(): Double{
    return Price
    }
    public fun SetPrice(Price: Double){
        if (Price<0){
            println("Цена пироженого не может быть отрицательной, ваше введённая стоимость измениться на 45₽")
        }
        else{
            this.Price=Price
        }
    }
    private var Calories: Double=45.0;
    public fun SetCalories(): Double{
        return Calories
    }
    public fun SetCalories(Price: Double){
        if (Calories<0){
            println("Калорийность пироженого не может быть отрицательной, ваше введённая стоимость измениться на 20кл")
        }
        else{
            this.Calories=Calories
        }
    }
    override fun BakeryInfo(){
        println("Название пироженого $NameCake, сорт теста $Dough, вид крема $Сream, калорийность пироженого $Calories кл , стоимость пироженого $Price₽")
    }
}