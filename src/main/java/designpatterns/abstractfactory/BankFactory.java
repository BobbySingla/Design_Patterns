package designpatterns.abstractfactory;

public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBankDetails(String bankName) {
        if (bankName == null)
            return null;
        if (bankName.equalsIgnoreCase("HDFC"))
            return new HDFC_Bank();
        if (bankName.equalsIgnoreCase("ICICI"))
            return new ICICI_Bank();
        return null;
    }

    @Override
    public Account getAccountType(String accountType) {
        return null;
    }
}
