package oop

/**
 * packageName  : oop
 * fileName     : Animal
 * author       : sshan
 * date         : 2023-05-08
 * description  :
 * ========================================================
 *  DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-08          sshan            최초생성
 */
abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
) {

    abstract fun move()
}