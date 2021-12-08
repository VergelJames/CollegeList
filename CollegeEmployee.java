public class CollegeEmployee extends Person {
    protected int SSS;
    protected double Salary;
    protected String DeptName;
    public CollegeEmployee(String fname, String lname, String address, int zip, int pnumber,
                           int sss, double salary, String deptname){
        super(fname,lname,address,zip,pnumber);
        SSS=sss;
        Salary=salary;
        DeptName=deptname;
    }
    @Override
    public void display(){
        System.out.println(Fname + " " + Lname + " " + Address + " " + Zip + " " + Pnumber
                           + "\n SSN : " + SSS + " Annual Salary: " + Salary + 
                           " Deptartment Name:  " + DeptName );
    }
   
    
}
