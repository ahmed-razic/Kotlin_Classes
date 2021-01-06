interface FishColor {
    val myColor: String
}

interface FishAction {
    fun eat()
}

object GoldColor : FishColor {
    override val myColor = "gold"
}

object SilverColor : FishColor {
    override val myColor: String = "silver"
}

class PrintingFishAction(val food: String) : FishAction{
    override fun eat() {
        println("eats $food")
    }
}

class FishPlecostomus(fishColor: FishColor = GoldColor): FishAction by PrintingFishAction("algae"), FishColor by fishColor {

}

class FishShark(fishColor: FishColor): FishAction, FishColor by fishColor {
    override fun eat() {
        println("hunt and eat many fish")
    }
}

