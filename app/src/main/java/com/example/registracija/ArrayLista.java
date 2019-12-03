package com.example.registracija;

import java.util.ArrayList;
import java.util.List;

public  class ArrayLista {
    private static List<Item> items;

    static {
        items = new ArrayList<>();
    }

    public static void addItem(Item i){
        items.add(i);
    }

    public static List getitems(){
        return items;
    }


}
