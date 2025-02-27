package es.jaimefere.weeklychallenge2022

/*
 * Reto #31
 * AÑOS BISIESTOS
 * Fecha publicación enunciado: 01/08/22
 * Fecha publicación resolución: 08/08/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que imprima los 30 próximos años bisiestos siguientes a uno dado.
 * - Utiliza el menor número de líneas para resolver el ejercicio.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun getNextThirtyLeapYears(year: Int) {
    (year + 1 .. year + 120).forEach {
        if((it % 4 == 0) && ((it % 100 != 0) || (it % 400 != 0))) {
            println(it)
        }
    }
}

fun main() {
    getNextThirtyLeapYears(2022)
    getNextThirtyLeapYears(-2022)
}
