package example2;

/**
 * packageName  : example2
 * fileName     : ex01
 * author       : sshan
 * date         : 2023-05-09
 * description  :
 * ========================================================
 * DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-09          sshan            최초생성
 */
public class ex01 {
    public static void main(String[] args) {
        Person.Factory.newBaby("ABC");//자바에서 코틀린 동행객체 접근 방법
        Person.newBaby2("ABC");//JVMStatic 어노테이션으로 스태틱으로 구현함
    }
}
