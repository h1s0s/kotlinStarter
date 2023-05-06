package example

class ex03 {
    //1. 기본타입
    //2. 타입캐스팅
    //3. 코틀린의 특이한 타입
    //4. String Interpolation, String indexcing
    fun main(){
        //1 기본타입
        //코틀린에서는 선언된 기본값을 보고 타입을 추론한다.
        val number1 = 3 //Int
        val number2 = 3L //Long
        val number3 = 3.0f //Float
        val number4 = 3.0 //Double
        val number5: Int? = 3

        //JAVA에서 기본 타입간의 변환은 암시적으로 이루어질 수 있고, Kotlin에서는 명시적으로 이루어져야 한다.
        //자바에서는 다른 자료형 간의 연산의 경우에는 한쪽으로 바뀜
        //코틀린은 아예 컴파일단에서 에러가 남.
        //코틀린은 to변환타입() 을 사용해야함.
        var number6: Long = number1.toLong()
        var number7: Long = number5?.toLong() ?: 0L //변수가 nullable 변수라면 적절한 처리를 해주자

        //3.코틀린의 타입 3가지 Any, Unit, Nothing
        //1) Any
        // 자바의 Object 역할
        //2) Unit
        // 자바의 void와 동일한 역할
        //3) Nothing
        //함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할(무조건 예외를 반환하는 함수)

        //4. String interpolation / String indexing
        val person = Person("최태현", 100)
        println("이름: ${person.name}")
        //변수라면 $변수명도 가능

        val str = """
            여러줄의
            문자열 작성 가능함
        """.trimIndent()

        //특정 문자열 가져오기
        val str2 = "ABC"
        println(str2[0])
        println(str2[1])
        println(str2[2])
    }

    fun printAgeIfPerson(obj: Any){
        if (obj is Person){ //is = (JAVA) instanceof와 같음
            val person = obj as Person //as 문법은 obj를 person으로 간주한다는 의미, JAVA의 (Person) obj와 같음, 생략될 수 있음, as?도 가능(변수가 Null이면 null)
            println(obj.name) //obj가 이미 타입체크가 됐기 때문에 Any타입의 변수가 파라미터여도, 컴파일 에러가 없이 Person의 메소드를 사용 가능, (스마트캐스트)
        }
    }


}