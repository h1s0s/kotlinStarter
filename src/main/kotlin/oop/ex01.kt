package oop

/**
 * packageName  : oop
 * fileName     : ex01
 * author       : sshan
 * date         : 2023-05-08
 * description  :
 * ========================================================
 *  DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-08          sshan            최초생성
 */

val NUM = 3

//생성자에 접근제어자 쓰는 방법
class Cat2 protected constructor(){

}

class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    //setter에만 접근제어자를 부여하고 싶을때.
    var price = _price
        private set
}