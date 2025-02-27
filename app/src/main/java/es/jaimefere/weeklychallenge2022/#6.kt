package es.jaimefere.weeklychallenge2022

import android.util.Patterns

/*
 * Reto #6
 * INVIRTIENDO CADENAS
 * Fecha publicación enunciado: 07/02/22
 * Fecha publicación resolución: 14/02/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun String.reverse(): String {
    var result = ""
    for(i in 0 .. this.length - 1) {
        result = "${this[i]}$result"
    }
    return result
}

fun recursiveReverseText(text: String, index: Int = 0, reversedText: String = ""): String {
    return if(index < text.length) {
        recursiveReverseText(text, index+1, "${text[index]}${reversedText}")
    } else {
        reversedText
    }
}

fun main() {
    println("Hola mundo".reverse())
    println(recursiveReverseText("Hola mundo"))
}