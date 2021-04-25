package javaoop;

class Programmer extends Employee { // เรียกใช้งานคลาสแม่

    public Programmer(String name,Double salary){ // Constructor
         super(name,salary);
         System.out.println("I'm Programmer");     
    }

    // Overloading Method
    public void skill() {
        System.out.println("I have no Skill");
    }

    public void skill(String... language) { // รับค่าพารามิเตอร์แบบ Array ในกรณ๊มีทักษะหลายๆ Skill
        for (int i = 0; i < language.length; i++) {
            System.out.println("Skill = " + language[i]);
        }
    }
    
    // Overrinding Method กำหนดค่าโบนัสเอง สร้าง Method คลาสแม่ขึ้นมาใหม่เอง
    // abstract คลาสลูกจะต้องสร้างคลาสให้เหมือนแม่ เพราะถูกบังคับให้สืบทอดจาก abstract
    public void bonus(){
        System.out.println("โบนัส = 20%");
    }
}
