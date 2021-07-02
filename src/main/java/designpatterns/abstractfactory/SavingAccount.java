package designpatterns.abstractfactory;

public class SavingAccount implements Account {
    @Override
    public String getAccountType() {
        return "saving";
    }
}
