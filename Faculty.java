public class Faculty extends CollegeEmployee {
    protected String Type;
    public Faculty(String fname, String lname, String address, int zip, int pnumber,
                           int sss, double salary, String deptname,String type){
        super(fname,lname,address,zip,pnumber,sss,salary,deptname);
        Type=type;
        if(Type.equals("Tenured")){
            Type="Yes";
        }
        else{
            Type="No";
        }
    }
    @Override
     public void display(){
        System.out.println(Fname + " " + Lname + " " + Address + " " + Zip + " " + Pnumber
                           + "\n SSN : " + SSS + " Annual Salary: " + Salary + 
                           " Deptartment Name:  " + DeptName + " Tenured: " + Type );
    }
    
    
}
