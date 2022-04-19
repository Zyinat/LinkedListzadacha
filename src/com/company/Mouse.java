package com.company;

import com.company.Animal;

public class Mouse extends Animal {
    public Mouse(int num) {
        super(num);
    }

    @Override
    public String toString() {
        return "Mouse{"+getNum()+"}";
    }
}
