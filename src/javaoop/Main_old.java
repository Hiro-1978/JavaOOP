/*package javaoop;

public class Main_old {

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
            System.out.println("#####################");
            // การทดลองใช้ Default Constructor สร้าง Object
            Employee e2 = new Employee();
            Employee e3=new Employee("5","Paisan",19352.50);
            Employee e4=new Employee("5","Paisan");
            
            e2.displayEmployee();
            System.out.println("#####################");
            e3.displayEmployee();
            System.out.println("#####################");
            e4.displayEmployee();
            System.out.println("#####################");
            
            // การห่อหุ้ม Encapsulation
            // เรียกใช้คลาสที่กำหนดแบบ Static ได้เลยโดยไม่ต้องสร้าง Object
                System.out.println(Company.name); // ชื่อคลาส ตามด้วย Attribute นั้นๆ
                Company.service();
           
        Programmer p1=new Programmer();
            p1.setID("1");
            p1.setName("Hiro");
            p1.setSalary(35000.0);
            p1.displayEmployee();
    } 
    
}
*/