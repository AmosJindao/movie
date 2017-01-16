package tests.regular;

/**
 * Created on 2017/1/13.
 */
public interface RegularConstants {
    /** 特定几个数字 */
    String SPECIFIC_NUM_PETTERN = "^[01]{1}$";

    /** 单个数字的正则表达式 */
    String SOLE_NUM_PETTERN = "^[\\d]{1}$";

    /** chinese phone number */
    String MOBILE_PHONE_PETTERN = "^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";

    /** identity card number */
    String ID_CARD_PETTERN = "(^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$)|(^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$)";
}
