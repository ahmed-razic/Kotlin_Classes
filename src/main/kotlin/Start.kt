fun main() {
    val pleco = FishPlecostomus()
    val shark = FishShark(SilverColor)

    println(pleco.myColor)
    println(pleco.eat())

    println(shark.myColor)
    println(shark.eat())

}

fun makeFish(){
    val myShark = Shark()
    println(myShark.color)
    myShark.eat()

    val myPlecostomus = Plecostomus()
    println(myPlecostomus.color)
    myPlecostomus.eat()
}