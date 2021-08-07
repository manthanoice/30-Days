package hackerRank;

import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    public void printPerson(){
        System.out.println("Name: " + lastName + ", " + firstName+"\nID: " + idNumber);
    }
}

class person{
    protected String firstName;
    protected String lastName;
    protected int id;
    person(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    public void print(){
        System.out.println("Name: "+lastName+", "+firstName+"\nID: "+id);
    }
}
class Student extends Person{
    private int[] testScores;
    Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }
    char calculate(){
        int sum = 0;
        for(int testScore:testScores)
            sum += testScore;
        int n = testScores.length;
        int avg = sum/n;
        if(avg >=90 && avg <= 100)
            return 'O';
        if(avg >=80 && avg <= 90)
            return 'O';
        if(avg >=70 && avg <= 80)
            return 'O';
        if(avg >=55 && avg <= 70)
            return 'O';
        if(avg >=40 && avg <= 55)
            return 'O';
        return 'T';
    }
}
class day12 {
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