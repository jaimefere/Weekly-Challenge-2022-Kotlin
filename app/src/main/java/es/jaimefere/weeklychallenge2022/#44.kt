package es.jaimefere.weeklychallenge2022

import kotlinx.coroutines.NonCancellable.children

/*
 * Reto #44
 * BUMERANES
 * Fecha publicación enunciado: 02/10/22
 * Fecha publicación resolución: 07/11/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que retorne el número total de bumeranes de un array de números
 * enteros e imprima cada uno de ellos.
 * - Un bumerán (búmeran, boomerang) es una secuencia formada por 3 números seguidos, en el que el
 *   primero y el último son iguales, y el segundo es diferente. Por ejemplo [2, 1, 2].
 * - En el array [2, 1, 2, 3, 3, 4, 2, 4] hay 2 bumeranes ([2, 1, 2] y [4, 2, 4]).
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */

private fun getNumOfBoomerangs(numbers: Array<Int>): Int {
    var numOfBoomerangs = 0
    if(numbers.size >= 3) {
        (0..numbers.size-3).forEach { index ->
                if(numbers[index] == numbers[index+2] && numbers[index] != numbers[index+1]) {
                    numOfBoomerangs += 1
                    print("[${numbers[index]}, ${numbers[index+1]}, ${numbers[index+2]}] ")
                }
        }
    }
    return numOfBoomerangs
}

fun main() {
    println(getNumOfBoomerangs(arrayOf(2, 1)))
    println(getNumOfBoomerangs(arrayOf(2, 1, 2, 3, 3, 4, 2, 4)))
}