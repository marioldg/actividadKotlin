fun main() {
    val agenda = Agenda()

    while (true) {
        println(
            """
            Menú:
            1. Añadir contacto
            2. Listar contactos
            3. Buscar contacto
            4. Comprobar existencia de un contacto
            5. Eliminar un contacto
            6. Indicar huecos libres
            7. Comprobar si la agenda esta llena
            8. Salir
            Seleccione una opcion:
            """
        )

        val opcion = readln().trim().toIntOrNull()

        if (opcion == null) {
            println("Entrada invalida. Introduce un numero valido.")
            continue
        }

        when (opcion) {
            1 -> agenda.añadirContacto()
            2 -> agenda.listarContactos()
            3 -> agenda.buscarContacto()
            4 -> agenda.existeContacto()
            5 -> agenda.eliminarContacto()
            6 -> agenda.numeroLibres()
            7 -> {
                if (agenda.agendaLlena()) {
                    println("La agenda esta llena")
                } else {
                    println("La agenda aun tiene espacio")
                }
            }
            8 -> {
                println("Saliendo del programa...")
                break
            }
            else -> println("Opción invalida.Selecciona una opción válida.")
        }
        println()
    }
}