package org.techHub.hackerRank;

public class BinaryString {

    BinaryString(String string) {
        for (byte b : string.getBytes()) {
            System.out.print(Integer.toBinaryString(b) + " ");
        }
        System.out.println();
    }

    BinaryString(Integer integer) {
        System.out.println(integer+":"+Integer.toBinaryString(integer));
    }

    public static void main(String[] args) {
        new BinaryString("ABC");
        int i = 8;
        int j = 9;
        new BinaryString(i);
        new BinaryString(j);
        System.out.println("("+i+"&"+j+"):"+(i&j)+":"+Integer.toBinaryString(i&j));
        System.out.println("("+i+"|"+j+"):"+(i|j)+":"+Integer.toBinaryString(i|j));
        System.out.println("("+i+"^"+j+"):"+(i^j)+":"+Integer.toBinaryString(i^j));
    }
}
