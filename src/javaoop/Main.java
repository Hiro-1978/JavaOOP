package javaoop;

public class Main {

    public static void main(String[] args) {
        // Run | Debug
            Employee e1 = new Employee(); // Create Object
            e1.setID("1");
            e1.setName("Paisan");
            e1.setSalary(1999.00);
            e1.displayEmployee();
            
            // ใช้เมธอดเรียกออกมาแค่บางค่า โดยใช้ getter แทน
            System.out.println("#####################");
            System.out.println("Name = "+e1.getName());
            System.out.println("Salary = "+e1.getSalary());
            
    } 
    
}
