package designpatterns.abstractfactory;

public class AccountFactory extends AbstractFactory {

    @Override
    public Bank getBankDetails(String bankName) {
        return null;
    }

    @Override
    public Account getAccountType(String accountType) {
        if (accountType == null)
            return null;
        if (accountType.equalsIgnoreCase("saving"))
            return new SavingAccount();
        if (accountType.equalsIgnoreCase("current"))
            return new CurrentAccount();
        return null;
    }
}
