package example4;

import java.util.Objects;

/**
 * packageName  : example4
 * fileName     : JavaPersonDto
 * author       : sshan
 * date         : 2023-05-09
 * description  :
 * ========================================================
 * DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-09          sshan            최초생성
 */
public class JavaPersonDto {

    private final String name;
    private final int age;

    public JavaPersonDto(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaPersonDto that = (JavaPersonDto) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "JavaPersonDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
