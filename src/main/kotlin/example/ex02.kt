package example

fun main(str: String?){//널이 들어오려면 자료형 뒤에 ?를 명시
    //2. 코틀린에서 null을 다루는 방법
    //자바 클래스에서 null체크를 하는 방법은 3가지가 있다.
    //1)값이 null인지 if문으로 체크하고 예외처리
    //2)null이면 null을 반환
    //3)null은 false를 반환


    //2.2. Safe Call과 Elvis 연산자
    //SAFE CALL 세이프콜
    var str: String? = "ABC"
//    str.length //null값이 가능한 자료형의 경우 해당 메소드는 불가능.
    str?.length //가능, 이게 세이프 콜(자료형?.메소드)인데, null이 아니면 실행하고, null이면 실행하지 않음(null이면 그냥 null임)

    //Elvis 연산자, 앞의 연산자가 null이면 뒤의 값을 대입함
    str?.length ?: 0

    val person = Person("공부하는 개발자")
    startsWithA(person.name!!)//nullable이 붙어있는 어노테이션(JAVA의 문법인데)이 있어도 에러가 남
}

fun startsWithA1(str: String?): Boolean {
    /*
    JAVA의 문법
    if (str == null){
        throw IllegalArgumentException("null이 들어왔습니다")
    }
    return str.startsWith("A")
     */
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다")
}

fun startsWithA2(str: String?): Boolean? {
    /*
    자바 문법
    if (str == null){
        return null
    }
    return str.startsWith("A")
     */
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    /*
    자바문법
    if (str == null){
        return false
    } //이 if문으로 null 체크를 하는 방식이 존재하면, 컴파일 단계에서 변수가 null이 아니겠거니 해서 오류가 안남
    //없으면 null일 수 있어서 에러남
    return str.startsWith("A")
     */
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean{
    //str!!를 쓰면 이 문법은 절대 null일 수 없음을 나타내는 문법, 그래서 null이면 쓸 수 없는 메소드도 사용 가능함
    //null이 들어오면 런타임 에러가 뜸, 확실한 경우에만 쓸 것
    return str!!.startsWith("A")
}

fun startsWithA(str: String): Boolean{
    return str.startsWith("A")
}


