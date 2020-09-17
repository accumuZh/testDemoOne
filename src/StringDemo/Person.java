package StringDemo;

public class Person {
    private String name;

    private int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1;
        p1 = new Person("liLei",17);
        Person p2;
        p2 = p1;
        System.out.println(p1 == p2);
        p2 = new Person("wanGer",19);
        System.out.println(p1 == p2);
    }

}
