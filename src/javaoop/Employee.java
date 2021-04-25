package javaoop;

abstract class Employee {
    // Create Class
    // Attribute

    private String id;
    private String name;
    private Double salary;

    // Default Construtor
   /* public Employee() {
        System.out.println("I'm Employee");
    }*/

    public Employee(String name) {
        // จองตำแหน่งพนักงานไว้ก่อน
    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
        displayEmployee();
    }

    public void displayEmployee() {
        System.out.println("Name = " + this.name);
        System.out.println("Salary = " + this.salary);
    }

    /* Overriding Method
    public void bonus(){
        System.out.println("โบนัส = 10%");
    }*/
    
    /*
        abstract เป็นคีย์เวิร์ดในภาษาจาวา สามารถกำหนดคีย์เวิร์ด abstract นี้ให้กับ คลาส หรือ เมธอดก็ได้
 
        abstract method คือ เมธอดว่างเปล่าที่ยังไม่ได้มีการกำหนดรายละเอียดหรือการทำงานลงไป
        จะถูกกำหนดรายละเอียดลงไปภายหลังจากคลาสลูกที่ได้รับการสืบทอดจาก abstract คลาสแม่ไปเท่านั้น
    */
    abstract public void bonus();
    
    // Setter, Getter
    public void setID(String id) { // สำหรับกำหนดค่าใน Attritube ที่เป็นแบบ Private
        this.id = id; // เพื่อกำหนดให้รู้ว่ากำลังใช้ Attribute ตัวไหน? *** ศึกษาเพิ่มเติม ***
    }

    public void setName(String name) { // สำหรับกำหนดค่าใน Attritube ที่เป็นแบบ Private
        this.name = name;
    }

    public void setSalary(Double salary) { // สำหรับกำหนดค่าใน Attritube ที่เป็นแบบ Private
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public Double getSalary() {
        return this.salary;
    }
}
