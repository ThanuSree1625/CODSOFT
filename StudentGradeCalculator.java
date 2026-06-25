import java.util.Scanner;
class StudentGradeCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subjects : ");
        int subjects=sc.nextInt();
        int total=0;
        for(int i=1;i<=subjects;i++){
            System.out.println("Enter marks of subject"+i+":");
            int marks=sc.nextInt();
            total+=marks;
        }
        double average=total/subjects;
        char grade;
        if(average>=90)
            grade='A';
        else if(average>=75)
            grade='B';
        else if(average>=65)
            grade='C';
        else if(average>=45)
            grade='D';
        else
            grade='F';
        System.out.println("Total Marks="+total);
        System.out.println("Average = "+average);
        System.out.println("Grade = "+grade);

    }
}