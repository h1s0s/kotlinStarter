package example6

import example2.Person

/**
 * packageName  : example6
 * fileName     : ex01
 * author       : sshan
 * date         : 2023-05-10
 * description  :
 * ========================================================
 *  DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-10          sshan            최초생성
 */
fun main(){
    //1. 확장함수
    val str = "ABC"
    println(str.lastChar())

    //2.infix함수(=중위함수)
    3 add 4
}

//1.확장함수
//자바와의 100% 호환을 위해 코틀린에서 생성된 개념, 객체에 함수를 바깥에서 정의하는 방법
fun String.lastChar(): Char {
    return this[this.length-1]
}
//확장함수는 클래스에 있는 private또는 protected 멤버를 가져올 수 없음!(캡슐화 때문)
//확장함수와 멤버함수의 시그니쳐가 동일하면, 멤버함수가 우선적으로 호출됨


//2.infix함수(=중위함수)
//변수 함수이름 argument 방식으로 구현 가능
infix fun Int.add(other: Int): Int{
    return this + other
}

//3. inline함수
//함수가 호출되는 대신 함수를 호출한 지점에 함수 본문을 그대로 복붙하고 싶은 경우
//함수를 호출하는게 아니라, 함수의 로직을 가지고 오는 방법이라고 보면 됨.
//함수를 파라미터로 전달할 때에 오버헤드를 줄일 수 있음.
inline fun Int.add2(other: Int): Int{
    return this + other
}

//4.지역함수
//함수안에 함수를 선언하는 방법
fun createPerson(firstName: String, lastName: String) {
    fun validateName(name: String, fieldName:String){
        if (name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다! 현재 값 : $name")
        }
    }
    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

//    return Person(firstName, lastName, 1)
}