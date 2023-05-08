package oop

/**
 * packageName  : oop
 * fileName     : Penguin
 * author       : sshan
 * date         : 2023-05-08
 * description  :
 * ========================================================
 *  DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-08          sshan            최초생성
 */
class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable{
    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다~ 꿱꿱")
    }

    //커스텀게터
    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Flyable>.act()
        super<Swimable>.act()
    }

    //인터페이스 프로퍼티 커스텀 getter
    override val swimAbility: Int
        get() = 3
}