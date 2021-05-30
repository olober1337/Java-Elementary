package lesson2;

//import java.util.Objects;

public class Test {

    public static void main(String[] args) {

//        A a = new A();
//        A b = new A();

//        //read about Integer and String pull
//        Integer a = 128;
//        Integer b = 128;
//        Integer c = 200;
//        Integer d = 200;
//        System.out.println(a.equals(b));
//        System.out.println(c == d);
//
//        byte a = 127;
//        a++;
//        System.out.println(a);

        String a1 = "1111111";
        System.out.println(Integer.bitCount(1111111));

    }
}
//
//class A{
//
//    private int field = 200;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        A a = (A) o;
//        return field == a.field;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(field);
//    }
//}
