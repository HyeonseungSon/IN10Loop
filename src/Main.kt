/*

 */
fun main() {

    val a1 = 1..10
    println("a1 : $a1") // a1 : 1..10
    for (item in a1) {
        println("a1 : $item")
    }

    println("---------------------")

    val a2 = 1..10 step 2
    for (item in a2) {
        println("a2 : $item")
    }

    println("---------------------")

    val a3 = 10 downTo 1
    for (item in a3) {
        println("a3 : $item")
    }

    println("---------------------")

    val a4 = 10 downTo 1 step 2
    for (item in a4) {
        println("a4 : $item")
    }

    // while
    var a5 = 0
    // var a5 = 100

    while (a5 < 10) {
        println("a5 : $a5")
        a5++
    }

    println("---------------------")
    // do while
    var a6 = 0
    //var a6 = 100
    do {
        println("a6 : $a6")
        a6++
    } while (a6 < 10)

}



