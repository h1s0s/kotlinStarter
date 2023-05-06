package example

/**
 * packageName  : example
 * fileName     : ex05
 * author       : sshan
 * date         : 2023-05-06
 * description  :
 * ========================================================
 *  DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-06          sshan            최초생성
 */
class ex05 {
    //조건문

    //2. Expression과 statement
    //3. switch와 when
}

//1. if
fun validateScoreIsNotNegative(score: Int){
    if (score !in 0..100) {
        throw IllegalArgumentException("score의 범위는 0부터 100까지입니다")
    }
}

fun getPassOrFail(score: Int):String {
    if (score >= 50){
        return "P"
    } else {
        return "F"
    }
}

fun getPassOrFail2(score: Int):String {
    //자바에서 if문은 Statement지만, 코틀린에서는 Expresison이기 때문에, 아래와 같이 return할 수 있음
    return if (score >= 50){
        "P"
    } else {
        "F"
    }
    //코틀린에서는 삼항연산자가 없음
}

fun getGradeWithSwitch(score:Int):String {
    //코틀린에서는 switch case문이 사라지고 when이 생김, 바로 return 가능
    return when (score / 10){
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}
fun getGradeWithSwitch2(score:Int):String {
    //in을 활용하여 아래처럼 가능
    return when (score){
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    //when의 조건부에는 어떠한 expression이라도 들어갈 수 있음
    return when (obj){
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    //,를 사용하여 어러개의 조건을 동시에 검사 가능
    return when (number){
        1, 0, -1 -> println("어디서 많이 본 숫자입니다")
        else -> println("1, 0, -1이 아닙니다")
    }
}

fun judgeNumber2(number: Int) {
    //when의 조건이 없을 수도 있음
    when{
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어진 숫자는 홀수입니다")
    }
}