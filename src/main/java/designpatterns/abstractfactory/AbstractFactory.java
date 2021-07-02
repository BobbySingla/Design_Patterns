package designpatterns.abstractfactory;

public abstract class AbstractFactory {
    public abstract Bank getBankDetails(String bankName);

    public abstract Account getAccountType(String accountType);
}
