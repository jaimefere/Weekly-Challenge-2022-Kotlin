package es.jaimefere.weeklychallenge2022

/*
 * Reto #26
 * CUADRADO Y TRIÁNGULO 2D
 * Fecha publicación enunciado: 27/06/22
 * Fecha publicación resolución: 07/07/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que dibuje un cuadrado o un triángulo con asteriscos "*".
 * - Indicaremos el tamaño del lado y si la figura a dibujar es una u otra.
 * - EXTRA: ¿Eres capaz de dibujar más figuras?
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

private enum class Figure {
    SQUARE, TRIANGLE
}

private fun drawPolygon(side: Int, figure: Figure) {
    if(side < 2) {
        println("La figura debe tener al menos 2 de lado\n")
    } else {
        (1..side).forEach { row ->
            (1..side).forEach { column ->
                if(figure == Figure.SQUARE || column <= row) {
                    print("* ")
                }
            }
            println()
        }
        println()
    }
}

fun main() {
    drawPolygon(1, Figure.SQUARE)
    drawPolygon(2, Figure.SQUARE)
    drawPolygon(2, Figure.TRIANGLE)
    drawPolygon(5, Figure.SQUARE)
    drawPolygon(5, Figure.TRIANGLE)
}