package com.YOONGI_S_WIFE.yoongi

class suga {
}

fun main() {

    var cara_1 : Int = (1 .. 6).random()
    var cara_2 : Int = (1 .. 6).random()

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

        println("prediste por culer@")

    }

}