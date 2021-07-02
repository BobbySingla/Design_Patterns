package designpatterns.abstractfactory;

public class FactoryCreator {
    public static AbstractFactory get(String name) {
        if (name == null)
            return null;
        if (name.equalsIgnoreCase("bank"))
            return new BankFactory();
        if (name.equalsIgnoreCase("account"))
            return new AccountFactory();
        return null;
    }
}
