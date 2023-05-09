package oop

/**
 * packageName  : oop
 * fileName     : StringUtils
 * author       : sshan
 * date         : 2023-05-08
 * description  :
 * ========================================================
 *  DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-08          sshan            최초생성
 */

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}