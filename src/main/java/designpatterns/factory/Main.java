package designpatterns.factory;

public class Main {
    public static void main(String[] args) {
        MyServiceFactory factory = new MyServiceFactory();
        MyService servicOneObj1 = factory.getMyServiceObject("one");
        System.out.println(servicOneObj1.getClass() + "  " + servicOneObj1.hashCode());
        MyService servicTwoObj1 = factory.getMyServiceObject("two");
        MyService servicThreeObj1 = factory.getMyServiceObject("three");
        System.out.println(servicTwoObj1.getClass() + "  " + servicTwoObj1.hashCode());
        System.out.println(servicThreeObj1.getClass() + "  " + servicThreeObj1.hashCode());

    }
}
