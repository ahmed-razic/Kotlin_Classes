abstract class AquariumFish: FishAction1 {
    abstract val color: String
    override fun eat() {
        println("yum")
    }
}

interface FishAction1 {
    fun eat()
}

class Shark: AquariumFish() {
    override val color: String = "gray"
//    override fun eat(){
//        println("hunt and eat fish")
//    }
}

class Plecostomus: AquariumFish() {
    override val color: String = "gold"
//    override fun eat(){
//        println("eat algae")
//    }
}