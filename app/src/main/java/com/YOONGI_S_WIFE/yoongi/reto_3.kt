package com.YOONGI_S_WIFE.yoongi

class reto_3 {

}

class auto_1 (val marca: String, val modelo: String, val año: Int)

fun main() {

    val autos = mutableListOf<auto_1>()

    do {
        println("tenemos las sifuientes opciones, digite el numero que acompaña a cada una para activar la opcion")
        println("1. Insertar nuevo auto")
        println("2. Mostrar todos los autos")
        println("3. Buscar un auto por marca")
        println("4. Modificar un auto existente")
        println("5. Eliminar un auto existente")

        val eleccion = readLine()?.toInt()

        when (eleccion) {

            1 -> {

                val auto = crear_auto()
                autos.add(auto)
                println("Auto agregado exitosamente")

            }

            2 -> {

                mostrar_autos(autos)

            }

            3 -> {

                print("Ingrese la marca del auto a buscar")
                val marcaBuscada = readLine()?.trim()

                buscar_por_marca(autos, marcaBuscada)

            }

            4 -> {

                print("Ingrese la posición del auto a modificar (1-${autos.size}): ")
                val indice_auto_para_actualizar = readLine()?.toIntOrNull()?.let { it - 1 }

                if (indice_auto_para_actualizar in 0 until autos.size) {

                    val auto_modificado = crear_auto()
                    autos[indice_auto_para_actualizar!!] = auto_modificado

                    println("El auto en la posición ${indice_auto_para_actualizar + 1} ha sido modificado")

                } else {

                    println("Posición inválida. No existe un auto en la posición ${indice_auto_para_actualizar?.let { it + 1 }}.")

                }

            }

            5 -> {

                print("Ingrese la posición del auto a eliminar (1-${autos.size}): ")

                val indice_auto_para_eliminacion = readLine()?.toIntOrNull()?.let { it - 1 }

                if (indice_auto_para_eliminacion in 0 until autos.size) {

                    autos.removeAt(indice_auto_para_eliminacion!!)

                    println("El auto en la posición ${indice_auto_para_eliminacion + 1} ha sido eliminado")

                } else {

                    println("Posición inválida. No existe un auto en la posición ${indice_auto_para_eliminacion?.let { it + 1 }}.");

                }

                break

            }


            else -> println("Opción inválida. Por favor, seleccione una opción válida.")

        }

    } while (true)

}

fun crear_auto(): auto_1 {

    print("Ingrese la marca del auto: ")
    val marca = readLine()?.trim()

    print("Ingrese el modelo del auto: ")
    val modelo = readLine()?.trim()

    print("Ingrese el año del auto: ")
    val año = readLine()?.toIntOrNull() ?: 0

    return auto_1 (marca ?: "", modelo ?: "", año)

}

fun mostrar_autos(listaCarros: List<auto_1>) {

    if (listaCarros.isNotEmpty()) {

        println("Lista de autos:")

        listaCarros.forEachIndexed { index, carro ->

            println("Auto ${index + 1}: Marca: ${carro.marca}, Modelo: ${carro.modelo}, Año: ${carro.año}")

        }

    } else {

        println("La lista de autos está vacía.")

    }

}

fun buscar_por_marca (autos: List<auto_1>, marca_buscada: String?) {

    if (marca_buscada != null && marca_buscada.isNotBlank()) {

        val carrosEncontrados = autos.filter { it.marca == marca_buscada }

        if (carrosEncontrados.isNotEmpty()) {

            println("Autos encontrados con la marca '$marca_buscada':")

            carrosEncontrados.forEachIndexed { index, carro ->

                println("Auto ${index + 1}: Modelo: ${carro.modelo}, Año: ${carro.año}")

            }

        } else {

            println("No se encontraron autos con la marca '$marca_buscada'.")

        }

    } else {

        println("Marca inválida. Por favor, ingrese una marca válida.")

    }
}
