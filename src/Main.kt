    fun main() {

        for (i:Int in 1..100){
            if(i%3==0){
                println("tri")

            }else if(i%5==0){
                println("qui")

            }else if(i%3==0 && i%5==0){
            println("triqui")

            }else{
                println(i)
            }
        }
    }