package org.techHub.hackerRank.thirtyDaysOfCode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-inheritance
 */
public class Day12_Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
class Person{
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
            "Name: " + lastName + ", " + firstName
            + 	"\nID: " + idNumber);
    }
}
class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int id, int[] scores){
        super(firstName,lastName, id);
        this.testScores = scores;
    }
    public char calculate(){
        int sum=0,total;
        char ch='O';
        for(int i=0; i<testScores.length; i++){
            sum = sum + testScores[i];
        }
        total=sum/testScores.length;
        return(total> 89 ?'O': total>79 ? 'E' : total > 69 ? 'A' : total > 54 ? 'P' :total > 39 ? 'D' : 'T' );

    }
    public char calculate_old(){
        char grade=' ';
        int avg = getAverage();
        if(90<=avg && avg<=100){
            grade = 'O';
        }else if(80<=avg && avg<90){
            grade = 'A';
        }else if(70<=avg && avg<80){
            grade = 'E';
        }else if(55<=avg && avg<700){
            grade = 'P';
        }else if(40<=avg && avg<55){
            grade = 'D';
        }else if(avg < 40){
            grade = 'T';
        }
        return grade;
    }
    public int getAverage(){
        int sum = Arrays.stream(testScores).sum();
        return sum/testScores.length;
    }
}
