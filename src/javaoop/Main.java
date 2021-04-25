package javaoop;

public class Main {

    public static void main(String[] args) {
        /*// Run | Debug
        Programmer p1 = new Programmer();
        // เรียกใช้เมธอดจากคลาสแม่ Employee ได้เลย
        p1.setName("Hiro");
        p1.setSalary(35000.0);
        p1.displayEmployee();
        System.out.println("#########################");
        Accounting a1 = new Accounting();
        a1.setName("Miuki");
        a1.setSalary(25000.0);
        a1.displayEmployee();
        */
        // Final คือการ Lock ค่าเพื่อห้ามเปลี่ยนแปลงหรือสืบทอดคลาส
       /* Programmer p1 = new Programmer("Hiro",35000.0);
        System.out.println("#########################");
        Accounting a1 = new Accounting("Miuki",25000.0);
        */
       // การเรียกใช้แบบ Overloading Method
       Programmer p1 = new Programmer("Hiro",35000.00);
       p1.skill("Java");
       p1.bonus();
       System.out.println("#########################");
       Accounting a1 = new Accounting("Miuki",25000.00);
       a1.skill("Word","Excell");
       a1.bonus();
    }

}
