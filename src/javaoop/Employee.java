package javaoop;

class Employee { 
        // Create Class
        // Attribute
        private String id;
        private String name;
        private Double salary;
        
        public void setID(String id){ // สำหรับกำหนดค่าใน Attritube ที่เป็นแบบ Private
            this.id=id; // เพื่อกำหนดให้รู้ว่ากำลังใช้ Attribute ตัวไหน? *** ศึกษาเพิ่มเติม ***
        }
        
        public void setName(String name){ // สำหรับกำหนดค่าใน Attritube ที่เป็นแบบ Private
            this.name=name;
        }
        
        public void setSalary(Double salary){ // สำหรับกำหนดค่าใน Attritube ที่เป็นแบบ Private
            this.salary=salary;
        }
        
        public void displayEmployee(){
            System.out.println("ID = "+this.id);
            System.out.println("Name = "+this.name);
            System.out.println("Salary = "+this.salary);
        }
        
        public String getName(){
            return this.name;
        }
        
        public Double getSalary(){
            return this.salary;
        }
}
