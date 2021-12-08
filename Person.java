public class Person {
    protected String Fname;
    protected String Lname;
    protected String Address;
    protected int Zip;
    protected int Pnumber;
    
    public Person(String fname, String lname, String address, int zip, int pnumber){
        Fname=fname;
        Lname=lname;
        Address=address;
        Zip=zip;
        Pnumber=pnumber;
    }
    public void display(){
        System.out.println(Fname + " " + Lname + " " + Address + " " + Zip + " " + Pnumber);
    }
            
    
    
}
