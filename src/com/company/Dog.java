package com.company;

public class Dog extends Animal{
    public Dog(int num) {
        super(num);
    }

    @Override
    public String toString() {
        return "Dog{"+getNum()+"}";
    }
}
