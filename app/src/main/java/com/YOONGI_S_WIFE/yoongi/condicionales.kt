package com.YOONGI_S_WIFE.yoongi

class condicionales {

}

/*fun main() {


    println("vamos a saber si el numero que digites es par o impar")
    var numero : Int = readLine()!!.toInt()

    if (numero % 2 == 0) {

        println("el numero es par")

    } else {

        println("el numero no es par")
    }



    println("escribe un numero de 1 a 20")
    var numero_1 : Int = readLine()!!.toInt()

    if (numero_1 in 1..20) {

        println("el numero esta en el rango, te mereces una estrellita")

    }

    else {

        println("por que hiciste lo contrario a lo que se te pidio?")

    }

}

*/
fun main() {


var valor : Int = (1 .. 50).random()

println("el numero es : $valor")

when (valor) {

    0 -> println("el resultado es 0")
    1,2,3,4,5,6,7,8,9,10 -> println("el resultado esta entre 1 y 10")
    in 11 .. 49 -> println("el resultado esta entre 11 y 49")
    else -> println("el resultado es mayor a 49")

}

}