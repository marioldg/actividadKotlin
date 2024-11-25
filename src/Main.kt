    fun main() {
        println("Introduce la primera palabra ")
        val palabra1 = readln()?: " "
        println("Introduce la segunda palabra")
        val palabra2 = readln()

        if (sonAnagramas(palabra1,palabra2)){
            println(" \"$palabra1\" y \"$palabra2\" son anagramas.")
        }else {
            println(" \"$palabra1\" y \"$palabra2\" no son anagramas.")
        }
    }

        fun sonAnagramas(palabra1: String, palabra2:String):Boolean{
            if(palabra1==palabra2){
                return false
            }
            return palabra1.toCharArray().sorted() == palabra2.toCharArray().sorted()
        }

