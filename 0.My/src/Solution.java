
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/*
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Class s = Double.class;
        Field[] fields= s.getFields();
        for (Field f :
                fields) {
          //  System.out.println(f);
        }

       Solution cl =Solution.class.newInstance();
        Method m = Solution.class.getMethod("print",String.class);
        m.invoke(cl,"1234");


        int i =10;
        cl.test(i);
        System.out.println(i);


    }

    public void test(int i){
       i++;
        System.out.println(i);
    }

    public  void print(String s){
        System.out.println("lol "+s);
    }

}
