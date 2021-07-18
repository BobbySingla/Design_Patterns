package designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class CDType {
    private List<Packing> packingList=new ArrayList<>();
    public void addItems(Packing packs){
        packingList.add(packs);
    }
    public void showProductDetails(){
       for (Packing packing:packingList){
           System.out.println(packing.getName()+" "+packing.getPrice());
       }
    }}
