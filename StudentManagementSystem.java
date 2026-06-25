import java.util.Scanner;
class StudentManagementSystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String names[]=new String[20];
        int rolls[]=new int[20];
        int count=0;
        int choice;
        do{
            System.out.println("1.Add Student");
            System.out.println("2.Search Students");
            System.out.println("3.Display Students");
            System.out.println("4.Remove Students");
            System.out.println("5.Exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    sc.nextLine();
                    System.out.println("Enter Student Name: ");
                    names[count]=sc.nextLine();
                    System.out.println("Enter roll number: ");
                    rolls[count]=sc.nextInt();
                    count++;
                    System.out.println("Student Added Successfully");
                    break;
                case 2:
                    System.out.println("Enter roll number to search: ");
                    int searchRoll=sc.nextInt();
                    boolean found=false;
                    for(int i=0;i<count;i++){
                        if(rolls[i] == searchRoll){
                            System.out.println("Name: "+names[i]);
                            System.out.println("Roll number"+rolls[i]);
                            found=true;
                        }
                    }
                    if(!found){
                        System.out.println("Student not found");
                    }
                    break;
                case 3:
                    System.out.println("\n Student list: ");
                    for(int i=0;i<count;i++){
                        System.out.println("Name: "+names[i]+"|Roll No: "+rolls[i]);

                    }
                    break;
                case 4:
                    System.out.println("Enter roll number to remove: ");
                    int removeRoll=sc.nextInt();
                    for(int i=0;i<count;i++){
                        if(rolls[i] == removeRoll){
                            for(int j=i;j<count-i;j++){
                                names[j]=names[j+1];
                                rolls[j]=rolls[j+1];
                            }
                            count--;
                            System.out.println("Student Removed");
                            break;
                        }
                    }
                    
                    break;
                    case 5:
                        System.out.println("Thank you");
                        break;
                default:
                    System.out.println("Invalis choice");

            }
        }while(choice !=5);
    }
}