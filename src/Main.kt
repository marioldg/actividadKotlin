    fun main() {
        val acciones = arrayOf("correr", "correr", "saltar", "saltar", "correr")
        val pista = "_|_|_"
        val resultado = Carrera(acciones, pista)
        println("Carrera superada?: $resultado")

        /**["correr", "saltar", "correr", "saltar", "correr"] y "_|_|_"
        ["correr", "correr", "correr", "saltar", "correr"] y "_|_|_"
        ["correr", "correr", "saltar", "saltar", "correr"] y "_|_|_"
        ["correr", "correr", "saltar", "saltar", "correr"] y "_|_|_|_"
        ["correr", "saltar", "correr", "saltar"] y "_|_|_"
        ["correr", "saltar", "correr", "saltar", "correr", "saltar", "correr"] y "_|_|_"
        ["saltar", "saltar", "saltar", "saltar", "saltar"] y "|||||"
        ["saltar", "saltar", "saltar", "saltar", "saltar"] y "||_||"*/

    }

    fun Carrera(acciones: Array<String>, suelo: String): Boolean {
        if (acciones.size != suelo.length) {
            return false
        } else {
            var carreraSuperada = true
            val sueloModificado = StringBuilder(suelo)

            for (i in acciones.indices) {

                if (acciones[i] != "correr" && acciones[i] != "saltar") {
                    sueloModificado[i]='?'
                    carreraSuperada = false
                }

                when {
                    acciones[i] == "correr" && suelo[i] == '_' -> {}
                    acciones[i] == "saltar" && suelo[i] == '|' -> {}
                    acciones[i] == "saltar" && suelo[i] == '_' -> {
                        sueloModificado[i] = 'x'
                        carreraSuperada = false
                    }
                    acciones[i] == "correr" && suelo[i] == '|' -> {
                        sueloModificado[i] = '/'
                        carreraSuperada = false
                    }

                    else -> {
                        sueloModificado[i] = '?'
                        carreraSuperada = false
                    }
                }
            }

            println("Resultado de la pista: ${sueloModificado.toString()}")
            return carreraSuperada
        }

            }