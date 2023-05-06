package example

/**
 * packageName  : example
 * fileName     : Money
 * author       : sshan
 * date         : 2023-05-06
 * description  :
 * ========================================================
 *  DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-06          sshan            최초생성
 */
class Money(
    val amount: Long
) {

    operator fun plus(other: Money): Money {
        return Money(this.amount + other.amount)
    }
}