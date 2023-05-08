package oop

/**
 * packageName  : oop
 * fileName     : Person
 * author       : sshan
 * date         : 2023-05-08
 * description  :
 * ========================================================
 *  DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-08          sshan            최초생성
 */
class Person (
    name: String,
    var age: Int
) {
    val name: String = name
        get() = field.uppercase()
    //필드를 사용하는 이유. getter를 호출하면, 네임을 호출하는 무한 루프가 발생하기 때문에
    //자기 자신을 가르키는 field라는 예약어를 사용한다

    //init블럭, 객체가 초기화 되는 시점에 실행되는
    init{
        if (age < 0){
            throw IllegalStateException("나이는 ${age}일 수 없습니다.");
        }
        println("초기화블럭")
    }
    //추가 생성자
    constructor(name: String) : this(name, 1){//주생성자를 호출함
        println("부생성자1")
    }
    constructor() : this("홍길동"){//부생성자1을 호출함
        println("부생성자2")
    }

    //추가 생성자 보다는 디폴트 파라미터를 권장합니다.
    //Converting과 같은 경우 부생성자를 사용할 수 있지만, 정적 팩토리 메서드를 추천 함.

    //클래스 메소드
    //1)함수
    fun isAdult1(): Boolean{
        return this.age >=20
    }

    //2)커스텀 getter 방식
    val isAdult2: Boolean
        get() = this.age >= 20

    val isAdult3: Boolean get() { return this.age >= 20 }
}

fun main(){
    val person = Person("최태현", 100)
    println(person.name)
    person.age = 10
    //자바 객체의 경우에도 getter/setter이 없음
    val person2 = JavaPerson("최태현", 100)
    println(person.name)

    val person3 = Person("최태현")
}