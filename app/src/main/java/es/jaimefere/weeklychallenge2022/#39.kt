package es.jaimefere.weeklychallenge2022

import es.jaimefere.weeklychallenge2022.sortNumbers

/*
 * Reto #39
 * TOP ALGORITMOS: QUICK SORT
 * Fecha publicación enunciado: 27/09/22
 * Fecha publicación resolución: 03/10/22
 * Dificultad: MEDIA
 *
 * Enunciado: Implementa uno de los algoritmos de ordenación más famosos: el "Quick Sort",
 * creado por C.A.R. Hoare.
 * - Entender el funcionamiento de los algoritmos más utilizados de la historia nos ayuda a
 *   mejorar nuestro conocimiento sobre ingeniería de software. Dedícale tiempo a entenderlo,
 *   no únicamente a copiar su implementación.
 * - Esta es una nueva serie de retos llamada "TOP ALGORITMOS", donde trabajaremos y entenderemos
 *   los más famosos de la historia.
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */

fun main() {
    val numbers = arrayOf(3, 10, 1, 8, 15, 5, 12, 6, 5, 4)
    // Already implemented in challenge #29
    println("Quicksort ASC: ${es.jaimefere.weeklychallenge2022.quickSort(numbers, 0, numbers.size - 1).toList()}")
    println("Quicksort DESC: ${es.jaimefere.weeklychallenge2022.quickSort(numbers, 0, numbers.size - 1).toList().reversed()}")
}

