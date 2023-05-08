package oop

/**
 * packageName  : oop
 * fileName     : Dog
 * author       : sshan
 * date         : 2023-05-08
 * description  :
 * ========================================================
 *  DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-08          sshan            최초생성
 */
class Cat (
    species: String,
) : Animal(species, 4){//코틀린에서는 상속받을때 상위 클래스의 생성자를 바로 호출한다

    //상속받은 메소드는 ovveride를 표기한다
    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}