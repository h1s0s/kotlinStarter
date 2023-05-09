package oop;

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

    private final String name;
    private int age;

    public JavaPerson(String name, int age) {
        if (this.age <= 0){
            throw new IllegalStateException("나이는 %s일 수 없습니다.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

