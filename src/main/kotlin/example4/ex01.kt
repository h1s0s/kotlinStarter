package example4

/**
 * packageName  : example4
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
    //Data Class
    val dto1 = PersonDto("최태현", 100)
    val dto2 = PersonDto("최태현", 200)
    println(dto1 == dto2)
    println(dto1)

    //Enum Class

    //Sealed Class, Sealed Interface
    handleCar(Avante())
}

//Data Class
data class PersonDto(//data라는 예약어를 명시하면, equals, hashcode, tostring을 자동으로 만들어줍니다
    val name: String,
    val age: Int
)

//Enum Class
enum class Country(
    private val code: String
){
    KOREA("KO"),
    AMERICA("US");
}

//enum에 대한 분기처리를 할때 when을 사용하면 좋음, enum의 변화도 체크해주고
//컴파일러가 country의 모든 타입을 알고있어 다른 타입에 대한 로직(else)를 작성하지 않아도 된다
fun handleCountry(country: Country){
    return when(country){
        Country.KOREA -> println("KOREA")
        Country.AMERICA -> println("AMERICA")
    }
}

//Sealed Class, Sealed Interface
//Sealed 봉인을 한
//상속이 가능하도록 추상클래스를 만들려고 하는데, 외부에서는 이 클래스를 상속받지 않았으면 할때 하위 클래스를 봉인하고자 나옴
//컴파일 타임 때 하위 클래스의 타입을 모두 기억함, 하위 클래스는 같은 패키지에 있어야한다.
//이넘과 다른점은 클래스를 상속받을 수 있다, 하위 클래스는 멀티 인스턴스가 가능함
sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("소나타", 2_000L)
class Grandeur : HyundaiCar("그렌저", 3_000L)

private fun handleCar(car: HyundaiCar){
    when(car){
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}