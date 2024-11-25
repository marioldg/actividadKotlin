    fun main() {
        val operacion1= "{a + b [c] * (2x2)}}}}"
        val operacion2="{ [ a * ( c + d ) ] - 5 }"
        val operacion3=" { a * ( c + d ) ] - 5 }"
        val operacion4="{a^4 + (((ax4)}"
        val operacion5="{ ] a * ( c + d ) + ( 2 - 3 )[ - 5 }"
        val operacion6="{{{{{{(}}}}}}"
        val operacion7="(a"
        estaBalanceado(operacion1)

    }

    fun estaBalanceado(Operacion:String):Boolean{
        var simbolos:MutableList<Char> = mutableListOf()
        var abriendo:Int=0
        var cerrando:Int=0

        for (i in Operacion){
            if(i=='{' || i=='[' || i=='('){
                simbolos.addFirst(i)
                abriendo++
            }else if (i=='}' || i==']' || i==')'){
                simbolos.addLast(i)
                cerrando++
            }else{
                simbolos.remove(i)
            }

        }
        return false


    }

