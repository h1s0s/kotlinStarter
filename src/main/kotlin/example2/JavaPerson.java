package example2;

/**
 * packageName  : oop
 * fileName     : JavaPerson
 * author       : sshan
 * date         : 2023-05-08
 * description  :
 * ========================================================
 * DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-08          sshan            최초생성
 */
public class JavaPerson {

    private static final int MIN_AGE = 1;

    public static JavaPerson newBaby(String name){
        return new JavaPerson(name, MIN_AGE);
    }

    private final String name;
    private int age;

    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

