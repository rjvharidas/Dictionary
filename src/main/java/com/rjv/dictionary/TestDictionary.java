package com.rjv.dictionary;

class TestDictionary{
    public static void main(String[] args){
        Dictionary d = new Dictionary();
        d.insert("walk");
        System.out.println(d.search("walk"));
    }
}
