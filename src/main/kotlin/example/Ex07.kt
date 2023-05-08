import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/**
 * packageName  :
 * fileName     : Ex07
 * author       : sshan
 * date         : 2023-05-08
 * description  :
 * ========================================================
 *  DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-08          sshan            최초생성
 */
fun main(){

}

//1. try catch finally 구문. java와 문법적으로 동일함
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 문자가 아닙니다.")
    }
}

//null, return try catch도 가능
fun parseIntOrThrowV2(str: String): Int?{
    return try{
        str.toInt()
    } catch(e: NumberFormatException){
        null
    }
}

//2. Checked Exception Unchecked Exception
//코틀린은 이 둘을 구분하지 않음, unchecked Exception.
fun readFile(){
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

//3. try with resources
//자바의 try with resources 구문은 사라지고, 코틀린의 문법으로 아래처럼 사용 가능(use라는 inline 함수 사용)
fun readFile(path: String){
    val reader = BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}