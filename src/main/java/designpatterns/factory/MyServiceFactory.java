package designpatterns.factory;

public class MyServiceFactory {
    public MyService getMyServiceObject(String serviceType) {
        if (serviceType == null)
            return null;
        if (serviceType.equalsIgnoreCase("one"))
            return new MyServiceOne();
        if (serviceType.equalsIgnoreCase("two"))
            return new MyServiceTwo();
        if (serviceType.equalsIgnoreCase("three"))
            return new MyServiceThree();
        return null;
    }
}
