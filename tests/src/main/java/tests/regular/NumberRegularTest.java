package tests.regular;

import java.util.regex.Pattern;

/**
 * Created on 2017/1/12.
 */
public class NumberRegularTest {
    public static void main(String[] args) {
        String str = null;
//        System.out.println(str+":"+isNumber(str));
//
//        str="1";
//        System.out.println(str+":"+isNumber1(str));
//
//        str="0";
//        System.out.println(str+":"+isNumber1(str));
//
//        str="a123";
//        System.out.println(str+":"+isNumber(str));
//
//        str="123b";
//        System.out.println(str+":"+isNumber(str));
//
//        str="c123d";
//        System.out.println(str+":"+isNumber(str));
//
//        str=" 123 ";
//        System.out.println(str+":"+isNumber(str));
//        str = "13686709826";
//        System.out.println(str + ":" + isMatch(RegularConstants.MOBILE_PHONE_PETTERN, str));
//
//        str = "371122198805046";
//        System.out.println(str + ":" + isMatch(RegularConstants.ID_CARD_PETTERN, str));
        
        str = "1@163.com";
        System.out.println(str + ":" + isMatch(RegularConstants.EMAIL_PETTERN, str));
    }

    static boolean isNumber(String needCHeckedStr) {
        if (needCHeckedStr == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(RegularConstants.SOLE_NUM_PETTERN);
        return pattern.matcher(needCHeckedStr).matches();
    }


    static boolean isNumber1(String needCHeckedStr) {
        if (needCHeckedStr == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(RegularConstants.SPECIFIC_NUM_PETTERN);
        return pattern.matcher(needCHeckedStr).matches();
    }

    static boolean isMatch(String pettern, String toCheckEd) {
        Pattern pattern = Pattern.compile(pettern);
        return pattern.matcher(toCheckEd).matches();
    }

}
