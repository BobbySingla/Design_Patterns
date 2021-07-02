package designpatterns.abstractfactory;

public class CurrentAccount implements Account {
    @Override
    public String getAccountType() {
        return "current";
    }
}
