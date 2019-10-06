package com.example.md6;

import java.util.ArrayList;
import java.util.List;

public class ListItems {

    List<String> list;

    public ListItems() {
        list = new ArrayList<>();
        list.add("sun");
        list.add("rain");
        list.add("snow");
        list.add("storm");

    }

    public List<String> getList(){
        return list;
    }
}
