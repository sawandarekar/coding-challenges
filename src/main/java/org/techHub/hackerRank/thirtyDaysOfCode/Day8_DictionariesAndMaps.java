package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8_DictionariesAndMaps {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Integer> phoneList = new HashMap<>();
        int totalPhoneNumList = scanner.nextInt();
        for(int i=0; i<totalPhoneNumList;i++){
            String name = scanner.next();
            int phone = scanner.nextInt();
            phoneList.put(name,phone);
        }
        while(scanner.hasNext()){
            String s = scanner.next();
            Integer number = phoneList.get(s);
            if(number == null){
                System.out.println("Not found");
            }else{
                System.out.println(s+"="+number);
            }
        }
        scanner.close();
    }

}
