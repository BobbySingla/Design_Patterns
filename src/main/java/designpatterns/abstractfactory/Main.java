package designpatterns.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryCreator.get("bank");
        Bank bank = factory.getBankDetails("icici");
        AbstractFactory factory1 = FactoryCreator.get("account");
        Account account = factory1.getAccountType("saving");
        System.out.println(bank.getBank() + "  " + account.getAccountType());
    }
}
