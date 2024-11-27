fun main() {
    val tablero = arrayOf(
        arrayOf("X", "O", "X"),
        arrayOf("X", "X", "O"),
        arrayOf("X", "X", "X")
    )

    println(tresEnRaya(tablero))

    /** Otros tableros para probar:
     * [["X", "O", "X"], ["O", "X", "O"], ["O", "O", "X"]] -> "X gana"
     * [["", "O", "X"], ["", "X", "O"], ["", "O", "X"]] -> "Empate"
     * [["O", "O", "O"], ["O", "X", "X"], ["O", "X", "X"]] -> "O gana"
     * [["X", "O", "X"], ["X", "X", "O"], ["X", "X", "X"]] -> "X gana"
     */
}

fun tresEnRaya(tablero: Array<Array<String>>): String {
    var xGanan = false
    var oGanan = false
    var resultado: String

    // Filas
    for (i in 0..2) {
        if (tablero[i][0] == "X" && tablero[i][1] == "X" && tablero[i][2] == "X") {
            xGanan = true
        } else if (tablero[i][0] == "O" && tablero[i][1] == "O" && tablero[i][2] == "O") {
            oGanan = true
        }
    }

    // Columnas
    for (j in 0..2) {
        if (tablero[0][j] == "X" && tablero[1][j] == "X" && tablero[2][j] == "X") {
            xGanan = true
        } else if (tablero[0][j] == "O" && tablero[1][j] == "O" && tablero[2][j] == "O") {
            oGanan = true
        }
    }

    // Diagonales
    if (tablero[0][0] == "X" && tablero[1][1] == "X" && tablero[2][2] == "X") {
        xGanan = true
    } else if (tablero[0][0] == "O" && tablero[1][1] == "O" && tablero[2][2] == "O") {
        oGanan = true
    }

    if (tablero[0][2] == "X" && tablero[1][1] == "X" && tablero[2][0] == "X") {
        xGanan = true
    } else if (tablero[0][2] == "O" && tablero[1][1] == "O" && tablero[2][0] == "O") {
        oGanan = true
    }


    resultado =
        when {
        xGanan -> "X gana"
        oGanan -> "O gana"
        xGanan && oGanan -> "Fallo en la partida..Ambos jugadores ganan, partida nula"

        else -> "Empate"
    }

    return resultado
}
