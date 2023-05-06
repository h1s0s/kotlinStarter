package example

/**
 * packageName  : example
 * fileName     : ex06
 * author       : sshan
 * date         : 2023-05-06
 * description  :
 * ========================================================
 *  DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-06          sshan            최초생성
 */
fun foreach(){
    val numbers = listOf(1L, 2L, 3L) //컬렉션을 만드는 방법
    for (number in numbers){
        println(number)
    }
}

fun tranditionalFor(){
    for (i in 1..3){ //for(int i = 1; i<=3; i++)
        println(i)
    }
    //내려가는 경우
    for (i in 3 downTo 1){ //for(int i = 3; i>=1; i--)
        println(i)
    }
    //2칸씩 올라가는 경우
    for (i in 1..5 step 2){ //for(int i = 1; i<=5; i+=2)
        println(i)
    }
}

fun testWhile(){
    var i = 1
    while (i <=3){
        println(i)
        i++
    }
}
fun main() {
    //1.for-each문(=향상된 포문)
    foreach()

    //2.전통적 for문
    tranditionalFor()

    //3.Progression과 Range
    //..연산자는 등차수열을 만들어 냄

    //4.While문(자바와 완전히 동일)
    testWhile()
}