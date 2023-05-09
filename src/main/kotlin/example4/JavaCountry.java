package example4;

/**
 * packageName  : example4
 * fileName     : JavaCountry
 * author       : sshan
 * date         : 2023-05-09
 * description  :
 * ========================================================
 * DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-09          sshan            최초생성
 */
public enum JavaCountry {

    KOREA("KO"),
    AMERICA("US");

    private final String code;

    JavaCountry(String code){this.code = code;}
    public String getCode(){return code;}
}
