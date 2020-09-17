package StringDemo;

public class ObjectTest {
    private int i,j;

    private void TestOne(ObjectTest a) {
        ObjectTest b = new ObjectTest();
        b.i = 1;
        b.j = 2;
        System.out.println("a.hashcode:"+a.hashCode());
        a = b;
        System.out.println("a.i:"+a.i+"  a.j:"+a.j);
        System.out.println("a.hashcode:"+a.hashCode());
    }

    private void TestTwo(ObjectTest a) {
        a.i = 1;
        a.j = 2;
    }

    public static void main(String[] args) {
        ObjectTest Test = new ObjectTest();
        Test.i = 5;
        Test.j = 6;
        System.out.println("i:"+Test.i+"  j:"+Test.j);
        Test.TestOne(Test);
        System.out.println("Test.hashcode:"+Test.hashCode());
        System.out.println("i:"+Test.i+"  j:"+Test.j);
        Test.TestTwo(Test);
        System.out.println("i:"+Test.i+"  j:"+Test.j);
    }
}
