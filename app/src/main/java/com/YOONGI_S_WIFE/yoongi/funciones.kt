package com.YOONGI_S_WIFE.yoongi

class funciones {

}

fun area_circulo () {

    var pi : Float = 3.1416f

    println("digite por favor el radio del circulo")

    var radio : Float = readLine()!!.toFloat()

    println("el area del circulo es : ${(radio * radio) *  pi }")


}

fun perimetro_circulo () {

    var pi : Float = 3.1416f

    println("digite por favor el radio del circulo")

    var radio : Float = readLine()!!.toFloat()

    println("el perimetro del circulo es : ${radio * (2 * pi) }")


}

fun area_triangulo (base_triangulo : Float?, altura_triangulo : Float?){

    var resultado : Float = base_triangulo!! * altura_triangulo!! / 2

    println("el area del triangulo es: $resultado")

}

fun perimetro_triangulo (base_triangulo : Float?, lado_1_triangulo : Float?, lado_2_triangulo : Float?) {

    var resultado : Float = base_triangulo!! + lado_1_triangulo!! + lado_2_triangulo!!

    println("el perimetro del triangulo es: $resultado")

}

fun area_rectangulo (base_reactangulo : Float, altura_rectangulo : Float) : Float {

    return base_reactangulo * altura_rectangulo

}

fun perimetro_ractangulo (base_reactangulo : Float, altura_rectangulo : Float) : Float {

    return (base_reactangulo * 2) + (altura_rectangulo * 2)

}

fun main() {

    var otra_vez : String = ""

     do {

        println("cual deseas hallar")
        println("digite 1 para hallar el area del circulo")
        println("digite 2 para hallar el perimetro del circulo")
        println("digite 3 para hallar el area del triangulo")
        println("digite 4 para hallar el perimetro del triangulo")
        println("digite 5 para hallar en area del rectangulo")
        println("digite 6 para hallar el perimetro del rectangulo")

        var datos: Int = readLine()!!.toInt()

        if (datos === 1) {

            area_circulo()

        } else if (datos === 2) {

            perimetro_circulo()

        } else if (datos === 3) {

            println("digite la base del triangulo")
            var base_triangulo: Float = readLine()!!.toFloat()

            println("digite la altura del triangulo")
            var altura_triangulo: Float = readLine()!!.toFloat()

            area_triangulo(base_triangulo, altura_triangulo)


        } else if (datos === 4) {

            println("digite la base del triangulo")
            var base_triangulo: Float = readLine()!!.toFloat()

            println("digite el lado 1 del triangulo")
            var lado_1_triangulo: Float = readLine()!!.toFloat()

            println("digite el lado 2 del triangulo")
            var lado_2_triangulo: Float = readLine()!!.toFloat()

            perimetro_triangulo(base_triangulo, lado_1_triangulo, lado_2_triangulo)

        } else if (datos === 5) {

            println("por favor digite la base del rectangulo")
            var base_rectangulo : Float = readLine()!!.toFloat()

            println("por favor digite la altura del rectangulo")
            var altura_rectangulo : Float = readLine()!!.toFloat()

            println(perimetro_ractangulo(base_rectangulo, altura_rectangulo))

        } else if (datos === 6) {

            println("por favor digite la base del rectangulo")
            var base_rectangulo : Float = readLine()!!.toFloat()

            println("por favor digite la altura del rectangulo")
            var altura_rectangulo : Float = readLine()!!.toFloat()

            println(area_rectangulo(base_rectangulo, altura_rectangulo))

        }

        println("desea realizar otra operacion")
         otra_vez = readLine()!!.toString()

    } while (otra_vez == "si")

}

