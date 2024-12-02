class Agenda {
    var listaContactos = ArrayList<Contacto>(3)
    var capacidad = 3

    init {
        this.listaContactos = ArrayList()
    }

    fun añadirContacto() {
        print("Introduce el nombre: ")
        val nom = readln()
        print("Introduce el teléfono: ")
        val tel = readln()


        if (agendaLlena()) {
            println("No se puede añadir contacto; agenda llena")
            return
        }


        for (i in listaContactos) {
            if (i.nombre.lowercase() == nom.lowercase()) {
                println("Contacto repetido; no se ha podido añadir")
                return
            }
        }


        listaContactos.add(Contacto(nom, tel))
        println("El contacto se ha añadido correctamente")
    }

    fun listarContactos() {
        if (listaContactos.isEmpty()) {
            println("No hay contactos en la agenda.")
        } else {
            for (i in listaContactos) {
                println("Nombre: ${i.nombre}, Teléfono: ${i.telefono}")
            }
        }
    }

    fun buscarContacto() {
        print("Introduce el nombre a buscar: ")
        val nom = readln()

        for (i in listaContactos) {
            if (i.nombre.lowercase() == nom.lowercase()) {
                println("Teléfono: ${i.telefono}")
                return
            }
        }
        println("No se ha podido encontrar el contacto")
    }

    fun existeContacto() {
        print("Introduce el nombre: ")
        val nom = readln()

        for (i in listaContactos) {
            if (i.nombre.lowercase() == nom.lowercase()) {
                println("El contacto sí existe")
                return
            }
        }
        println("No existe dicho contacto")
    }

    fun eliminarContacto() {
        print("Introduce el nombre del contacto a eliminar: ")
        val nom = readln().lowercase()

        for (i in listaContactos) {
            if (i.nombre == nom) {
                listaContactos.remove(i)
                println("El contacto ha sido eliminado de la agenda")
                return
            }
        }
        println("No se ha podido eliminar el contacto indicado")
    }

    fun numeroLibres() {
        val libres = capacidad - listaContactos.size
        if (libres > 0) {
            println("Huecos libres: $libres")
        } else {
            println("Capacidad llena")
        }
    }

    fun agendaLlena(): Boolean {
        return listaContactos.size >= capacidad
    }
}