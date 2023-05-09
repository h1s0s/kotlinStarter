package example2

/**
 * packageName  : oop
 * fileName     : ex02
 * author       : sshan
 * date         : 2023-05-09
 * description  :
 * ========================================================
 *  DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-09          sshan            최초생성
 */

fun main(){

    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    //익명클래스
    moveSomthing(object : Movable{
        override fun move() {
            println("무브 무브")
        }

        override fun fly() {
            println("날다 날다")
        }
    })
}

class Person private constructor(
    var name: String,
    var age: Int
) {
    //코틀린에는 static이 없음, 동반객체(companion object)를 사용
    //하나의 객체로 간주됨, 때문에 이름을 붙일 수도 있고, 인터페이스를 구현할 수도 있음
    companion object Factory : Log{
        private const val MIN_AGE = 1
        //val만쓰면 런타임시 0이 할당됨. const를 쓰면 컴파일시 변수가 할당됨.
        //상수에 붙이기 위한 용도.
        fun newBaby(name: String): Person{
            return Person(name, MIN_AGE)
        }

        @JvmStatic
        fun newBaby2(name: String): Person{
            return Person(name, MIN_AGE)
        }
        override fun log() {
            println("나는 Person 클래스의 동행객체에요")
        }
    }

    //static: 클래스가 인스턴스화 될 때 새로운 값이 복제되는게 아니라 정적으로 인스턴스끼리의 값을 공유
    //companion object : 클래스와 동행하는 유일한 오브젝트트
}

//object라는 자료형만 붙이면 싱글톤이 됨
//인스턴스가 하나이기 때문에 인스턴스화를 하는게 아니라 코드에서 바로 접근
object Singleton{
    var a: Int = 0
}

private fun moveSomthing(movable: Movable){
    movable.move()
    movable.fly()
}
