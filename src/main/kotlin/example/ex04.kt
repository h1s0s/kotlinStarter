package example

/**
 * packageName  : example
 * fileName     : ex04
 * author       : sshan
 * date         : 2023-05-06
 * description  :
 * ========================================================
 *  DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-06          sshan            최초생성
 */
class ex04 {
    //코틀린에서 연산자를 다루는 방법
    //단항연산자(++, --), 산술연산자(+, -, *, /, %), 산술대입연산자(+=, -=등)은 자바와 같음

    //코틀린에서는 객체를 비교할때 자동으로 compareTo를 사용함
}

fun main(){
    //2. 비교연산자와 동등성 동일성
    //JAVA에서는 동일성(주소가 같은가)에 ==를 사용, 동등성(값이 같은가)에 equals를 직접 호출
    //코틀린은 동일성에 ===를 사용, 동등성에 ==를 호출, ==를 사용하면 간접적으로 equals를 호출해준다
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    println(money1 === money2)

    //3. 논리연산자와 코틀린에 있는 특이한 연산자
    //Lazy연산 or 연산의 경우 앞부분이 true면 뒤에 조건을 확인하지 않음, and는 앞부분이 false면 뒤에 조건을 확인하지 않음
    if (fun1() || fun2()){
        println("본문")
    }

    //코틀린 in / !in : 컬렉션이나 범위에 포함되어 있다, 포함되어 있지 않다

    // a..b a부터 b까지의 범위 객체를 생성한다

    // a[i]

    // a[i] = b : 특정 인덱스에 값을 넣는다

    //4. 연산자 오버로딩
    //코틀린에서는 객체마다 연산자를 직접 정의할 수 있다
    val money4 = Money(1_000L)
    val money5 = Money(1_000L)
    println(money4 + money5)//객체에 plus라는 메소드를 정의하여 사용함
}

fun fun1(): Boolean {
    println("fun1")
    return true
}

fun fun2(): Boolean {
    println("fun1")
    return false
}