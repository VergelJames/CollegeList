import java.util.*;
public class CollegeList_Viray {
    public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    String choice;
    int Cn=0,Fn=0,Sn=0,loop=0;
    CollegeEmployee [] C = new CollegeEmployee[4];
    Faculty [] F = new Faculty[3];
    Student [] S = new Student[7];
    while(true){
    if(loop==0){
    System.out.println("Menu\n"
            + "[C] College Employee\n"
            + "[F] Faculty\n"
            + "[S] Student\n"
            + "[Q] Quit\n");
    choice=k.nextLine();
    choice=choice.toUpperCase();
    }
    else{
        choice=k.nextLine();
        choice=choice.toUpperCase();
    }
    
    if (choice.equals("C")){
        if(Cn>=4){
            System.out.println("Only 4 College Employee!");
            continue;
        }
        System.out.print("First Name : ");
        String FName=k.nextLine();
        System.out.print("Last Name : ");
        String LName=k.nextLine();
        System.out.print("Address : ");
        String Address=k.nextLine();
        System.out.print("Zip Code : ");
        int ZipC=k.nextInt();
        System.out.print("Phone Number : ");
        int PNumber=k.nextInt();
        System.out.print("SSS Number : ");
        int SSSN=k.nextInt();
        k.nextLine();
        System.out.print("Employees Department : ");
        String EDept=k.nextLine();
        System.out.print("Annual Salary : ");
        double ASalary=k.nextDouble();
         C[Cn] = new CollegeEmployee(FName,LName,Address,ZipC,PNumber,SSSN,ASalary,EDept);
        Cn+=1;
    }
    else if (choice.equals("F")){
        if(Fn>=3){
            System.out.println("Only 3 Faculty!");
            continue;
        }
        System.out.print("First Name : ");
        String FName=k.nextLine();
        System.out.print("Last Name : ");
        String LName=k.nextLine();
        System.out.print("Address : ");
        String Address=k.nextLine();
        System.out.print("Zip Code : ");
        int ZipC=k.nextInt();
        System.out.print("Phone Number : ");
        int PNumber=k.nextInt();
        System.out.print("SSS Number : ");
        int SSSN=k.nextInt();
        k.nextLine();
        System.out.print("Employees Department : ");
        String EDept=k.nextLine();
        System.out.print("Annual Salary : ");
        double ASalary=k.nextDouble();
        k.nextLine();
        System.out.print("Tentured Y/N: ");
        String choice2=k.nextLine();
        choice2=choice2.toUpperCase();
        if(choice2.equals("Y")){
            choice2="Tentured";
        }
        else if(choice2.equals("N")){
            choice2="";
        }
        else{
            System.out.println("Not on the choices.");
        }
        F[Fn] = new Faculty(FName,LName,Address,ZipC,PNumber,SSSN,ASalary,EDept,choice2);
        Fn+=1;
        
    }
    
    else if(choice.equals("S")){
        if(Sn>=7){
            System.out.println("Only 7 Students!");
            continue;
        }
        System.out.print("First Name : ");
        String FName=k.nextLine();
        System.out.print("Last Name : ");
        String LName=k.nextLine();
        System.out.print("Address : ");
        String Address=k.nextLine();
        System.out.print("Zip Code : ");
        int ZipC=k.nextInt();
        System.out.print("Phone Number : ");
        int PNumber=k.nextInt();
        k.nextLine();
        System.out.print("Major : ");
        String Mjor=k.nextLine();
        System.out.print("Average : ");
        double Ave=k.nextDouble();
        S[Sn] = new Student(FName,LName,Address,ZipC,PNumber,Mjor,Ave);
        Sn+=1;
     }
    else if(choice.equals("Q")){
        break;
    }
    else{
        System.out.println("Not on the choices...");
        loop=1;
        continue;
    }
    loop=0;
    }
    
    System.out.println("College Employee ");
    if(Cn==0){
        System.out.println("No College Employee");
    }
    else{
        for (int i = 0; i < Cn; i++) {
            C[i].display();
        }
    }
    
    System.out.println("\nFaculty ");
    if(Fn==0){
        System.out.println("No Faculty");
    }
    else{
        for (int i = 0; i < Fn; i++) {
            F[i].display();
        }
    }
    
    System.out.println("\nStudent ");
    if(Sn==0){
        System.out.println("No Student");
    }
    else{
        for (int i = 0; i < Sn; i++) {
            S[i].display();
        }
    }
        
    
}
    
}
