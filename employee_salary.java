import java.util.*;
/*public class object {
    int roll_no;
    String name;
    object()
    {
        roll_no=0;
        name=" ";
        System.out.println("default name and roll_no"+roll_no+"\n"+name);
    }
    object(int roll_no,String name){
        this.roll_no=roll_no;
        this.name=name;
        System.out.println("parameterized name and roll_no"+roll_no+"\n"+name);
    }
    void display()
    {
        System.out.println("roll_no="+roll_no+"\nname="+name);
    }

    public static void main(String[] args) {
        object obj1=new object();
        obj1.display();
        object obj2=new object(101,"Alice");
        obj2.display();
        
    }
    
}
public class bank_account{
String account_number;
double balance;
bank_account(){
account_number="1234567890";
balance=0.0;
System.out.println("Default Account Number: "+account_number);
System.out.println("Default Balance: "+balance);
}
bank_account(String account_number, double balance)
{
this.account_number=account_number;
this.balance=balance;
System.out.println("Parameterized Account Number: "+account_number);
System.out.println("Parameterized Balance: "+balance);  
}
void display()
{
System.out.println("Account Number: "+account_number);
System.out.println("Balance: "+balance);
}
public static void main(String[] args) {
bank_account acc1=new bank_account();
bank_account acc2=new bank_account("9876543210", 5000.0);
acc1.display();
acc2.display();
}
}
public class rectengle_area {
    int length;
    int breadth;
    rectengle_area(){
        length=1;
        breadth=1;
        System.out.println("Default Length: "+length);
        System.out.println("Default Breadth: "+breadth);
    }
    rectengle_area(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        System.out.println("Parameterized Length: "+length);
        System.out.println("Parameterized Breadth: "+breadth);
    }
    void area()
    {
        int area=length*breadth;
        System.out.println("Area of Rectangle: "+area);
    }
    public static void main(String[] args) {
        rectengle_area rect1=new rectengle_area();
        rect1.area();
        rectengle_area rect2=new rectengle_area(5,10);
        rect2.area();
    }
}
*/
public class employee_salary {
    int emp_id;
    String emp_name;
    double salary;
    employee_salary(){
        emp_id=0;
        emp_name=" ";
        salary=0.0;
        System.out.println("Default Employee ID: "+emp_id);
        System.out.println("Default Employee Name: "+emp_name);
        System.out.println("Default Salary: "+salary);
    }
    employee_salary(int emp_id,String emp_name,double salary){
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        this.salary=salary;
        System.out.println("Parameterized Employee ID: "+emp_id);
        System.out.println("Parameterized Employee Name: "+emp_name);
        System.out.println("Parameterized Salary: "+salary);
    }
    void display()
    {
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Employee Name: "+emp_name);
        System.out.println("Salary: "+salary);
    }
    public static void main(String[] args) {
        employee_salary emp1=new employee_salary();
        emp1.display();
        employee_salary emp2=new employee_salary(101,"Astitva Srivastava",75000.0);
        emp2.display();
    }
}