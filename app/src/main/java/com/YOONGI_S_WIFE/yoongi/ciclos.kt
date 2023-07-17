package com.YOONGI_S_WIFE.yoongi

class ciclos {

}

/*fun main() {

    for (i in 1 .. 5) println("$i") // para contar

    println("------------------------")

    for (i in 5 downTo 1) println("$i") // para contar en reversa

    for (i in 1  .. 30 step 2) println("$i") // contar de 2 en 2 hasta 30

    for (i in 'a' .. 'z') println("$i") // para mostrar letras

}

fun main() {

    var numero_par : Int = 0;
    var numero_impar : Int =0;
    var total_pares : Int = 0;
    var total_impares : Int = 0;

    for (i in 1 ..6) {

        println("digite por favor un numero")

        var numero : Int = readLine()!!.toInt();

        if (numero % 2 == 0) {

            println("el numero es par")

            numero_par ++

            total_pares = total_pares + numero

        } else {

            println("el numero es impar")

            numero_impar ++

            total_impares = total_impares + numero

        }

    }

    println("usted digito $numero_par numeros pares y la suma de estos es: $total_pares ")
    println("usted digito $numero_impar numeros impares y la suma de estos es: $total_impares ")

}

fun main() {

    var valor_seleccion = true
    var seleccion : String = ""
    var numero_par : Int = 0;
    var numero_impar : Int =0;
    var total_pares : Int = 0;
    var total_impares : Int = 0;

    do {

        println("digite por favor un numero")

        var numero : Int = readLine()!!.toInt();

        if (numero % 2 == 0) {

            println("el numero es par")

            numero_par ++

            total_pares = total_pares + numero

        } else {

            println("el numero es impar")

            numero_impar ++

            total_impares = total_impares + numero

        }

        println("desea continuar, si es asi dijite true, de lo contrario false?")

        seleccion = readLine()!!.toString();

        if (seleccion == "false"){

            valor_seleccion = false

        } else {

            valor_seleccion = true

        }

    } while (valor_seleccion == true)

    println("usted digito $numero_par numeros pares y la suma de estos es: $total_pares ")
    println("usted digito $numero_impar numeros impares y la suma de estos es: $total_impares ")

}

*/