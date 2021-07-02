package designpatterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        //Bottleneck-1: Using Reflection
        System.out.println("Bottleneck-1: Using Reflection");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = null;
        Constructor[] constructors = Singleton.getInstance().getClass().getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            try {
                instance2 = (Singleton) constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println();


        //Resolution-1: Use Enum
        System.out.println("Resolution of Bottleneck-1: Reflection");
        SingletonEnum instance3 = SingletonEnum.singleton;
        SingletonEnum instance4 = SingletonEnum.singleton;
        System.out.println(instance3.hashCode());
        System.out.println(instance4.hashCode());
        System.out.println();

        //Bottleneck-2: Using Serialization - A new object will be created while deserialization
        //Resolution is: implement readResolve() method in singleton class
        System.out.println("Bottleneck-2 : Using Serilization & it's Resolution: implementing readResolve() method in singleton class");
        Singleton instance5 = Singleton.getInstance();
        Singleton instance6 = null;
        try {
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
            out.writeObject(instance5);
            out.close();
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));
            instance6 = (Singleton) in.readObject();
            System.out.println(instance5.hashCode());
            System.out.println(instance6.hashCode());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();


        //Bottleneck-3: Using clone() method of Cloneable interface
        //Resolution: override clone() method in singleton class
        System.out.println("Bottleneck-3: Using clone() method of Cloneable interface " +
                "Resolution: override clone() method in singleton class");
        Singleton instance7 = Singleton.getInstance();
        Singleton instance8 = (Singleton) instance7.clone();
        System.out.println(instance7.hashCode());
        System.out.println(instance8.hashCode());
    }
}
