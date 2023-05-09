package example2;

/**
 * packageName  : example2
 * fileName     : JavaSingleton
 * author       : sshan
 * date         : 2023-05-09
 * description  :
 * ========================================================
 * DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-09          sshan            최초생성
 */
public class JavaSingleton {
    private static final JavaSingleton INSTANCE = new JavaSingleton();

    private JavaSingleton(){}

    public static JavaSingleton getInstance(){
        return INSTANCE;
    }
}
