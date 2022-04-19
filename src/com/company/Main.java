package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Animal>linkedList=new LinkedList<>();
        int catNum=1;
        int dogNum=1;
        int mouseNum=1;
        for (int i = 0; i < 50; i++) {
            linkedList.add(new Cat(catNum++));
            linkedList.add(new Dog(dogNum++));
        }
        int counter=0;
        int counter1=0;
        for (int i = 0; i < linkedList.size();i++) {
            if (linkedList.get(i) instanceof Cat){
                counter++;
            }
            if (counter==5){
                linkedList.remove(linkedList.get(i));
                counter=0;
            }


        }
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) instanceof Dog){
                counter1++;
            }
            if (counter1==3){
                linkedList.add(i+1, new Mouse(mouseNum++));
                counter1=0;
            }

        }
        System.out.println(linkedList);






            {

        }



        }
    }

