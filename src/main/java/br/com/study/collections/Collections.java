package br.com.study.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Collections

public class Collections {
    public static void main(String[] args) {
        List<Integer> listInt = new LinkedList<>();
        ((LinkedList<Integer>) listInt).addFirst(9);
        ((LinkedList<Integer>) listInt).removeLast();
        System.out.println(listInt);

        List<Integer> arrayInt = new ArrayList<>();
        while(arrayInt.size()<100){
            int addNumber = (int) Math.floor(Math.random()*100);
            arrayInt.add(addNumber);
        }
        System.out.println(arrayInt.size());

        arrayInt.sort(null);
        int searchNumber = 50;
        int position = -1;
        int floor = 0;
        int top = arrayInt.size()-1;
        int mid = 0;
        while(floor<=top){
            mid = (floor + top) / 2;
            if (arrayInt.get(mid) == searchNumber){
                position = mid;
                break;
            }
            if (arrayInt.get(mid)>searchNumber){
                top = mid -1;
                        
            }
            if (arrayInt.get(mid)<searchNumber){
                floor = mid + 1;
            }
        }
        System.out.println(position);
    }
}
