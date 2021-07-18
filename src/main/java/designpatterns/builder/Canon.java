package designpatterns.builder;

public class Canon extends Company {
    @Override
    public String getName() {
        return "CANON";
    }

    @Override
    public int getPrice() {
        return 20000;
    }
}
