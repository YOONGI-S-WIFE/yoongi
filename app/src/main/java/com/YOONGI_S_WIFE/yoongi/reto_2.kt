package com.YOONGI_S_WIFE.yoongi

class reto_2 {

}

fun main() {

    println("bienvenid@ a supermercados Noes, estamos de aniversario, por ello te daremos un descuento si tu uenta es mayor a 50.000 pesos")
    println("si sacas una pelota roja obtienes el 10% de descuento del valor total de tu compra")
    println("si sacas una pelota azul obtienes el 30% de descuento del valor total de tu compra")
    println("si sacas una pelota amarilla obtienes el 50% de descuento del valor total de tu compra")
    println("si sacas una pelota blanca obtienes el 100% de descuento del valor total de tu compra")

    var seguir : String = "si";
    var valor_original_compra : Int = 0;
    var nueva_venta : String = "";
    var valor_final_compra : Float = 0F;

    do {

    while (seguir == "si") {

        println("digite el valor del producto")
        var valor_producto : Int = readLine()!!.toInt();

        println("digite la cantidad de items de este producto")
        var items : Int = readLine()!!.toInt();

        valor_original_compra = valor_original_compra + (valor_producto * items)

        println("desea seguir agregrando productos a su compra?, si lo desea dijite si, de lo contrario dijite no")

        seguir = readLine()!!.toString()

    }

        println("el valor total de su compra es de : $valor_original_compra")
        println("ahora veremos si podras llevarte tu compra gratis")

        var color_pelota : Int = (1 .. 4).random()

        if (color_pelota == 1 && valor_original_compra > 50000) {

            println("sacaste la pelota de color rojo, conseguiste el 10% de descuento")
            println("gracias a esto pasas de pagar $valor_original_compra a pagar ${valor_original_compra - (valor_original_compra * 0.10)}")
            valor_final_compra = valor_original_compra - (valor_original_compra * 0.10F)

        } else if (color_pelota == 2 && valor_original_compra > 50000) {

            println("sacaste la pelota de color azul, conseguiste el 30% de descuento")
            println("gracias a esto pasas de pagar $valor_original_compra a pagar ${valor_original_compra - (valor_original_compra * 0.30)}")
            valor_final_compra = valor_original_compra - (valor_original_compra * 0.30F)

        } else if (color_pelota == 3 && valor_original_compra > 50000) {

            println("sacaste la pelota de color amarillo, conseguiste el 50% de descuento")
            println("gracias a esto pasas de pagar $valor_original_compra a pagar ${valor_original_compra - (valor_original_compra * 0.50)}")
            valor_final_compra = valor_original_compra - (valor_original_compra * 0.50F)

        } else if (color_pelota == 4 && valor_original_compra > 50000){

            println("sacaste la pelota de color blanco, conseguiste el 100% de descuento")
            println("gracias a esto te lleva tu compra totalmente gratis, felicitaciones")

        } else {

            println("lo sentimos tu compra no cumplio cn el precio minimo que son 50.000 pesos")

        }

        println("con cuanto cancelaras?")
        var recibe_cajero : Int = readLine()!!.toInt()

        if (recibe_cajero >= valor_final_compra)

} while ()

    println("")

}