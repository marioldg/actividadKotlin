fun main() {
    val operacion1= "{a + b [c] * (2x2)}}}}"
    val operacion2="{ [ a * ( c + d ) ] - 5 }"
    val operacion3=" { a * ( c + d ) ] - 5 }"
    val operacion4="{a^4 + (((ax4)}"
    val operacion5="{ ] a * ( c + d ) + ( 2 - 3 )[ - 5 }"
    val operacion6="{{{{{{(}}}}}}"
    val operacion7="(a"

    System.out.println(estaBalanceado(operacion1))
    System.out.println(estaBalanceado(operacion2))
    System.out.println(estaBalanceado(operacion3))
    System.out.println(estaBalanceado(operacion4))
    System.out.println(estaBalanceado(operacion5))
    System.out.println(estaBalanceado(operacion6))
    System.out.println(estaBalanceado(operacion7))




}


fun estaBalanceado(Operacion: String): Boolean {


    val simbolos: MutableList<Char> = mutableListOf()
    var abriendo = 0
    var cerrando = 0

    for (i in Operacion) {
        if (i == '{' || i == '[' || i == '(') {
            simbolos.add(i)
            abriendo++
        } else if (i == '}' || i == ']' || i == ')') {
            cerrando++
            if (simbolos.isEmpty()) {
                return false
            }


            val ultimo = simbolos.last()

            if ((i == '}' && ultimo == '{') ||
                (i == ']' && ultimo == '[') ||
                (i == ')' && ultimo == '(')
            ) {
                simbolos.removeAt(simbolos.size - 1)
            } else {
                return false
            }
        }
    }


     if(simbolos.isEmpty() && abriendo == cerrando) {
        return true
    }else{
        return false
     }
}
