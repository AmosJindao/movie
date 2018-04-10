package tests.str;

/**
 * @author amos
 * @date 2018-03-21
 */
public class StrTest2{
    public static void main(String[] args) {
        String[] strs = new String[2];

        for(String str:strs){
            System.out.println(str);
        }

        for(int i=0; i<strs.length; i++){
            System.out.println("a".concat(strs[i]));
        }
    }
}
