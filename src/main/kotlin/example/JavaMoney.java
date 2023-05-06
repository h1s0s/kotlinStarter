package example;

import org.jetbrains.annotations.NotNull;

/**
 * packageName  : example
 * fileName     : JavaMoney
 * author       : sshan
 * date         : 2023-05-06
 * description  :
 * ========================================================
 * DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-06          sshan            최초생성
 */
public class JavaMoney implements Comparable<JavaMoney>{

    private final long amount;

    public JavaMoney(Long amount) {
        this.amount = amount;
    }

    public JavaMoney plus(JavaMoney other){
        return new JavaMoney(this.amount + other.amount);
    }

    @Override
    public int compareTo(@NotNull JavaMoney o) {
        return Long.compare(this.amount, o.amount);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
