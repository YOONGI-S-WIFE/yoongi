package com.YOONGI_S_WIFE.yoongi

class suga {
}

fun main() {

    var cara_1 : Int = (1 .. 6).random()
    var cara_2 : Int = (1 .. 6).random()

    println("este es el juego craps")
    println("ganaras si sacas 1 en ambos dados")
    println("ganaras si la suma de los 2 dados es igual a 3")
    println("ganaras si sacas un total de 11 puntos en la suma de ambos dados")
    println("ganaras si obtienes 2 o 12 en la suma de los dados")
    println("ganaras si sacas un 7 en la suma de los dados")


    println("en el primer dado saco $cara_1")
    println("en el segundo dado saco $cara_2")

    if (cara_2 == 1 && cara_1 == 1) {

        println("usted saco un par de 1, por ende ganaste")

    }

    else if (cara_2 + cara_1 ==3) {

        println("has ganado, felcitaciones, sacaste un total de 3 en la suma de los lanzamientos de los 2 dados")

    } else if (cara_2 + cara_1 == 11) {

        println("has ganado, felcitaciones, sacaste un total de 11 en la suma de los lanzamientos de los 2 dados")

    } else if (cara_2 + cara_1 == 2) {

        println("has ganado, felcitaciones, sacaste un total de 2 en la suma de los lanzamientos de los 2 dados")

    } else if (cara_2 + cara_1 == 12) {

        println("has ganado, felcitaciones, sacaste un total de 12 en la suma de los lanzamientos de los 2 dados")

    } else if (cara_2 + cara_1 == 7) {

        println("has ganado, felcitaciones, sacaste un total de 7 en la suma de los lanzamientos de los 2 dados")

    } else {

        println("perdiste por culer@, vuelve a intentar")

    }

}