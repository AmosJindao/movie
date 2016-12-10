package org.movie.commons.utils;

import com.google.common.base.Strings;

import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * 字符串工具類
 *
 * @author amos
 * @since 1.0, Aug 31, 2014 10:56:46 AM
 */
public final class StringUtils{

    private StringUtils() {
    }

    public static final String ALL_CHAR = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ~!@#$%^&*()_+";

    /**
     * 檢測指定的字符串是否爲空
     * <ul>
     * <li>StringUtils.isEmpty(null) = true</li>
     * <li>StringUtils.isEmpty("") = true</li>
     * <li>StringUtils.isEmpty("   ") = true</li>
     * <li>StringUtils.isEmpty("abc") = false</li>
     * </ul>
     *
     * @param value 待檢測的字符串
     * @return true/false
     */
    public static boolean isEmpty(String value) {
        int strLen;
        if (value == null || (strLen = value.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(value.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 檢查指定的對象轉換爲字符串後，是否是數字型字符串
     *
     * @param obj 待檢查的對象
     * @return
     */
    public static boolean isNumeric(Object obj) {
        if (obj == null) {
            return false;
        }
        return isNumeric(obj.toString());
    }

    /**
     * 檢查指定的字符串是否是數字型字符串
     *
     * @param str 待檢查的字符串
     * @return
     */
    public static boolean isNumericString(String str) {
        if (str == null) {
            return false;
        }
        char[] chars = str.trim().toCharArray();
        int length = chars.length;
        if (length < 1)
            return false;

        int i = 0;
        if (length > 1 && chars[0] == '-')
            i = 1;

        for (; i < length; i++) {
            if (!Character.isDigit(chars[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * 檢查字符串列表是否爲不空
     *
     * @param values 字符串列表
     * @return
     */
    public static boolean areNotEmpty(String... values) {
        boolean result = true;
        if (values == null || values.length == 0) {
            result = false;
        } else {
            for (String value : values) {
                result &= !isEmpty(value);
            }
        }
        return result;
    }

    /**
     * 把通用字符編碼的字符串轉化爲漢字編碼
     * <ul>
     * <li>StringUtils.unicodeToChinese("\u656c\u754f\u751f\u547d") = "敬畏生命"</li>
     * <li>StringUtils.unicodeToChinese(null) = ""</li>
     * </ul>
     *
     * @param unicodeStr 通用字符編碼的字符串
     * @return
     */
    public static String unicodeToChinese(String unicodeStr) {
        StringBuilder out = new StringBuilder();
        if (!isEmpty(unicodeStr)) {
            for (int i = 0; i < unicodeStr.length(); i++) {
                out.append(unicodeStr.charAt(i));
            }
        }
        return out.toString();
    }

    /**
     * 把駝峯式的變量名轉換爲下劃線式的變量名
     * <ul>
     * <li>StringUtils.toUnderlineStyle("orderCodeSn") = "order_code_sn"</li>
     * <li>StringUtils.toUnderlineStyle(null) = ""</li>
     * </ul>
     *
     * @param name 駝峯式的變量名
     * @return
     */
    public static String toUnderlineStyle(String name) {
        StringBuilder newName = new StringBuilder();
        if (areNotEmpty(name)) {
            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                if (Character.isUpperCase(c)) {
                    if (i > 0) {
                        newName.append("_");
                    }
                    newName.append(Character.toLowerCase(c));
                } else {
                    newName.append(c);
                }
            }
        }
        return newName.toString();
    }

    /**
     * 根據UnicodeBlock方法判斷中文標點符號
     * <p>
     * <ul>
     * <li>StringUtils.isChinesePunctuation('，') = true</li>
     * <li>StringUtils.isChinesePunctuation('從') = false</li>
     * </ul>
     * </p>
     *
     * @param ch 待判斷的中文標點符號
     * @return
     */
    public static boolean isChinesePunctuation(char ch) {
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(ch);
        if (ub == Character.UnicodeBlock.GENERAL_PUNCTUATION || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS || ub == Character.UnicodeBlock.VERTICAL_FORMS) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 使用UnicodeBlock方法判斷中文漢字
     * <p>
     * <ul>
     * <li>StringUtils.isChinesePunctuation('，') = false</li>
     * <li>StringUtils.isChinesePunctuation('從') = true</li>
     * </ul>
     * </p>
     *
     * @param ch 待判斷的漢字
     * @return
     * @throws UnsupportedEncodingException
     */
    public static final boolean isChineseCharacter(char ch) {
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(ch);
        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 使用UnicodeScript方法判斷(jdk7以上支持此方法)
     *
     * @param c
     * @return
     */
    public static boolean isChineseByScript(char c) {
        Character.UnicodeScript sc = Character.UnicodeScript.of(c);
        if (sc == Character.UnicodeScript.HAN) {
            return true;
        }
        return false;
    }

    /**
     * 判斷是否爲中文字符串
     *
     * @param chineseString
     * @return
     */
    public static boolean isChinese(String chineseString) {
        if (chineseString == null) {
            return false;
        }
        char[] chars = chineseString.trim().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!isChineseCharacter(chars[i]) && !isChinesePunctuation(chars[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * generate a random string with the specific length
     * @param length the specific length
     * @return string
     */
    public static String randomString(int length) {
        if(length < 0){
            throw new IllegalArgumentException("length can't be negative! length="+length);
        }
        StringBuilder sb = new StringBuilder();

        new Random().ints(length, 0, ALL_CHAR.length()).forEach(i -> {
            sb.append(ALL_CHAR.charAt(i));
        });

        return sb.toString();
    }
}
