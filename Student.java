public class Student extends Person {
    protected String Major;
    protected double Average;
    
    public Student(String fname, String lname, String address, int zip, int pnumber ,String major ,double average){
        super(fname,lname,address,zip,pnumber);
        Major=major;
        Average=average;
    }
    @Override
     public void display(){
        System.out.println(Fname + " " + Lname + " " + Address + " " + Zip + " " + Pnumber
                           + "\nMajor : " + Major + "Average:  " + Average);
    }
    
}
