package com.YOONGI_S_WIFE.yoongi

class arreglos {


}

fun main() {

    var bts = arrayOf("namjoon", "jin", "yoongi", "hoseok", "jimin", "taehyung", "jungkook")

    print (bts.contentToString()) // asi se muestra la informacion de un arreglo

    bts [1] = "seok jin" // asi se le cambia el dato a una posicion especifica del arreglo

    print (bts.contentToString())

    for ((posicion, miembro) in bts.withIndex()) {

        print ("el miembro $miembro esta en la posicion $posicion") // mostrar los elementos de un arreglo con su posicion dentro de este

    }

    var grupos_kpop = mutableListOf ("black pink", "bts", "exo", "twice", "stray kids");  // arreglo que solo recibe String

    println(grupos_kpop)

    var empresas_kpop = listOf ("jyp", "sm", "big hit", "cube", "yg") // arreglo que recibe cualquier tipo de dato

    println(empresas_kpop)

    var tipos_de_pop = mutableListOf ("pop", "kpop", "c-pop", "j-pop", "t-pop") // lista mutable

    tipos_de_pop [1] = "k-pop"

    println(grupos_kpop.first()) // mostrar primer elemento de la lista
    println(grupos_kpop.last()) // mostrar ultimo elemento de la lista

    grupos_kpop.addAll(listOf("red velvet", "g-friend", "ioi")) // agregar elementos a la lista




}