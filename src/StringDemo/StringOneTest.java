package StringDemo;


import java.lang.reflect.Field;
import java.sql.SQLOutput;

public class StringOneTest {
    private String str;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "ABCabc";
        String s = str;
        System.out.println(str.hashCode());
        str.replaceAll("A","a");
        System.out.println(str.hashCode());
        Class<?> classString = String.class;
        Field value = classString.getDeclaredField("value");
        value.setAccessible(true);
        char[] arr = (char[]) value.get(str);
        arr[0]=  's';
        System.out.println(str +" :: "+str.hashCode());
        System.out.println(str == s);
        System.out.println("---------------------");

        String s1 = "AB" + "C";
        String s2 = "A" + "BC";
        String s3 = new String("ABC");
        char[] aa = {'A','B','C'};
        String s4 = new String(aa);
        System.out.println("s1的hashcode:"+s1.hashCode());
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s1 == s4);
        System.out.println(s3==s4);
        System.out.println("s4的hashcode："+s4.hashCode());
        System.out.println("s3的hashcode:"+s3.hashCode());
        String s5 = s1;
        s1 = s1+"Hello";
        System.out.println("s5的hashcode:"+s5.hashCode());
        System.out.println("s1的hashcode:"+s1.hashCode());
        System.out.println(s1 == "ABC");
        System.out.println(s5 == "ABC");
    }
}
