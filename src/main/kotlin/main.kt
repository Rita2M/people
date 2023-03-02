fun main() {
    val likes = 1311
    val people = "Людям"
    val people2 = "Человеку"
    val yy = (likes % 10)
    val tt = (likes % 100)
    val result = if (yy == 1 && tt != 11) people2 else people
    println(result)
}
