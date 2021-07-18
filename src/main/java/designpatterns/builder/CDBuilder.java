package designpatterns.builder;

public class CDBuilder {
    public CDType getSonyCDDetails(){
        CDType cdType=new CDType();
        cdType.addItems(new Sony());
        return cdType;
    }
    public CDType getCanonCDDetails(){
        CDType cdType=new CDType();
        cdType.addItems(new Canon());
        return cdType;
    }
}
