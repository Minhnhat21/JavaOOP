/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP.BaiTapTK.Bai01;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Student extends Person{
    private String studentID;
    private int academic_year;

    public Student() {
    }

    public Student(String studentID, int academic_year, String name, char gender, int birth_year) {
        super(name, gender, birth_year);
        this.studentID = studentID;
        this.academic_year = academic_year;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getAcademic_year() {
        return academic_year;
    }

    public void setAcademic_year(int academic_year) {
        this.academic_year = academic_year;
    }

    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        String input;
        super.Input(); 
        System.out.println("Nhap ma sinh vien: ");
        input = sc.nextLine();
        setStudentID(input);
        System.out.println("Nhap nam hoc: ");
        input = sc.nextLine();
        setAcademic_year(Integer.parseInt(input));
    }

    
    @Override
    public String toString() {
        String ketqua = super.toString();
        ketqua += "\nMa sinh vien: " + studentID +
                  "\nacademic_year:  " + academic_year;
        return ketqua;
    }
    
    
    
}
