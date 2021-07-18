package designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        CDBuilder builder=new CDBuilder();
        CDType canonCDDetails = builder.getCanonCDDetails();
        canonCDDetails.showProductDetails();
        CDType sonyCDDetails = builder.getSonyCDDetails();
        sonyCDDetails.showProductDetails();

    }
}
