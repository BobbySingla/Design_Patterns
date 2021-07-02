package designpatterns.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("Singleton contructor called");
    }

    public static Singleton getInstance() {
        synchronized (Singleton.class) {     //class level lock so that one instance is created when multiple thread access the instance
            if (singleton == null) {
                singleton = new Singleton();
                return singleton;
            }
        }
        return singleton;
    }

    //Resolution of Bottleneck-2: only single instance is created while Serilization
    protected Object readResolve() {
        return singleton;
    }

    //Resolution of Bottleneck-3: only single instance will be created if we use clone() method for cloning of objects
    @Override
    protected Object clone() {
        return singleton;
    }

}
