fun main(){
    println("hello, world")
    //1. 변수선언 키워드 - var, val
    var number1 = 10L //variable의 약자로 발, 값이 바뀔 수 있음
    val number2 = 10L //value의 약자로 밸, 값이 바뀔 수 없음
    //코틀린은 모든 변수에, 수정 가능 여부를 명시해주어야 함.

    var number3: Int = 10
    //타입은 명시하지 않아도, "컴파일러"가 타입을 자동추론 해줌

    //코틀린은 자바와 다르게 널이 들어갈수 있는을 다르게 표시함.
    //기본적으로 모든 변수를 널이 들어갈 수 없게 만듬
    //null이 들어갈 수 있는 변수를 만드려면 자료형 뒤에 ?를 붙이면 됨(ex. 타입?)

    //객체를 인스턴스화 할때 new를 사용하지 않아도 됨
//    var person = Person("최태현")
}