package com.company;

public class Cat extends Animal{
    public Cat(int num) {
        super(num);
    }

    @Override
    public String toString() {
        return "Cat{"+getNum()+"}";
    }
}
