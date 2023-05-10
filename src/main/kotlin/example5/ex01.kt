package example5

/**
 * packageName  : example5
 * fileName     : ex01
 * author       : sshan
 * date         : 2023-05-09
 * description  :
 * ========================================================
 *  DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-09          sshan            최초생성
 */

fun main(){
    //배열
    val array = arrayOf(100, 200)
    for (i in array.indices){//indices = 0부터 lastindex range
        println("${i} ${array[i]}")
    }
    array.plus(300)//값을 추가
    for ((idx, value) in array.withIndex()){//withIndex() = idx와 value를 받는 함수
        println("$idx $value")
    }

    //코틀린에서의 컬렉션
    //가변인지 불변인지를 지정해 주어야 함
    //가변 컬렉션 : 컬렉션이 element를 추가, 삭제할 수 있다.
    //불변 컬렉션 : 컬렉션이 element를 추가, 삭제할 수 없다.
    //불변 컬렉션이어도 element의 객체에 접근하여 필드 값을 변경할 수는 있음.

    //리스트List
    val numbers = listOf(100, 200)//불변리스트 만들기
    val emptyList = emptyList<Int>()//빈 리스트 생성, 자료형을 꼭 적어줘야함

    println(numbers.get(0))
    println(numbers[0])
    for (number in numbers){
        println(number)
    }
    for ((idx, value) in numbers.withIndex()){
        println("$idx $value")
    }

    val numbers2 = mutableListOf(100,200)//가변리스트 만들기
    numbers2.add(300)
    numbers2.remove(200)

    //우선 불변리스트를 만들고 필요한경우 가변리스트로 바꾸자

    //Set(집합)
    val numbers3 = setOf(100, 200)
    val numbers4 = mutableSetOf(100,200)
    numbers4.add(300)

    //Map
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")//이 방법으로도 초기화 가능능

    for (key in oldMap.keys){
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries){
        println("$key $value")
    }

    //컬렉션의 null가능성
    //List<Int?> : 리스트에 null이 들어갈 수 있지만, 리스트는 절대 null이 아님
    //List<Int>? : 리스트에는 null이 들어갈 수 없지만, 리스트는 null일 수 있음
    //List<Int?>? : 리스트에 null이 들어갈 수도 있고, 리스트가 null일 수도 있음

    //자바와 함께 사용하기
    //자바가 코틀린의 불변 리스트를 가져와서 element를 추가할 수 있음.
    //자바는 nullable타입과 non-nullable타입을 구분하지 않음, null을 추가할 수 있음.
    //코틀린의 컬렉션이 JAVA에서 호출되면 컬렉션 내용이 변할수 있음을 감안해야함. 방어로직을 짤것
    //코틀린쪽에서 Collections.unmodifableXXX()을 활용하면 변경자체를 막을 수는 있따.(자바에서 변경 못하게)
}