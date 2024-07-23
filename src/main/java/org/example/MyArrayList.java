package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
   private Object[] nList = {};
   private int lastElementIndex = -1;

    public void add(Object value){
if(lastElementIndex == nList.length -1){
    nList = Arrays.copyOf(nList, nList.length + 1);
    nList[lastElementIndex + 1] = value;
    lastElementIndex++;
}
else if(lastElementIndex < nList.length - 1){
    nList[lastElementIndex + 1] = value;
    lastElementIndex++;
}
        System.out.println("Додано один елемент з індексом " + lastElementIndex + ", загалом в колекції елементів " + nList.length + ".");
        System.out.println("Колекція містить такі елементи: " + Arrays.toString(nList));
        System.out.println("\n");
    }

    public void remove(int index){
        Object[] tmp = Arrays.copyOf(nList, nList.length - 1);
        System.arraycopy(nList,index + 1,tmp,index,nList.length - index - 1);
        nList = tmp;
//        tmp = {};
        lastElementIndex--;
        System.out.println("Видалено елемент з індексом " + index + ", залишилось " + nList.length + " елементів.");
        System.out.println("Колекція містить такі елементи: " + Arrays.toString(nList));
        System.out.println("\n");
    }

    public void clear(){
        for (int i = lastElementIndex; i >= 0; i--) {
            nList[lastElementIndex] = null;
            lastElementIndex--;
        }
        System.out.println("Колекцію очищено");
        System.out.println("Колекція містить такі елементи: " + Arrays.toString(nList));
        System.out.println("\n");
    }
    public int size(){
        int countElement = 0;
        for(Object x : nList){
            if(x != null) countElement++;
        }
        return countElement;
    }
    public Object get(int index){
        return nList[index];

    }
}
