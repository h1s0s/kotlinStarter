package example3

/**
 * packageName  : example3
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

}

class House(
    private val address: String,
    private val livingRoom: LivingRoom
){
    inner class LivingRoom(//바깥 클래스를 참조하려면 inner를 명시해야함
        private val area: Double,
    ) {
        val address: String
            get() = this@House.address // 바깥 클래스 참조를 위해 this@바깥클래스 사용용
   }
}