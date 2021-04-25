/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

class Company {
    // การหนด Class และ Attribute แบบ Static 
    // ทำให้ Class Main เรียกใช้งานได้เลยโดยที่ไม่ต้อง Object ขึ้นมาก่อน
    static String name="Hiro-Club";
    static String mdf="2020";
    
    static void service(){
        System.out.println("Sub Editor");
    }
}
