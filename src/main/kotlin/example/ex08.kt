package example

/**
 * packageName  : example
 * fileName     : ex08
 * author       : sshan
 * date         : 2023-05-08
 * description  :
 * ========================================================
 *  DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-08          sshan            최초생성
 */
fun main(){
    println(max(1,2))
    repeat("Hello World")
    //매개변수 명시 가능, named argument
    repeat("Hello World", useNewLine = false)

    printNameAndGender(gender="FEMAIL", name="최태현")
}
fun max(a:Int, b:Int): Int {
    return if (a > b){
        a
    } else {
        b
    }
}

//함수가 하나의 결과값이면 =을 사용 가능.
//한줄로 쓸 수 있고, =을 사용하는경우 중괄호, 반환타입 생략 가능
fun max2(a:Int, b:Int) = if (a > b) a else b

//2. 디폴트 파라미터
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true){
    for (i in 1..num){
        if (useNewLine){
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String){
    println(name)
    println(gender)
}

//4. 같은 타입의 여러 파라미터 받기(가변인자)
fun printAll(vararg strings: String){
    for (str in strings){
        println(str)
    }
}
