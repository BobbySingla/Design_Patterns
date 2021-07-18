package designpatterns.builder;

public class Sony extends Company{
    @Override
    public String getName() {
        return "SONY";
    }

    @Override
    public int getPrice() {
        return 10000;
    }
}
