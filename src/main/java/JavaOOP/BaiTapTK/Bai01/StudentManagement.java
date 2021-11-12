/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP.BaiTapTK.Bai01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentlist = new ArrayList<>();
        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu: " + (i + 1));
            Student s = new Student();
            s.Input();
            studentlist.add(s);       
        }
        System.out.println("Nhap nam sinh can tim kiem: ");
        int b_year = sc.nextInt();
        studentlist.stream().filter(student -> (student.getBirth_year() == b_year)).forEachOrdered(student -> {
            System.out.println(student);
        });
        System.out.println("Nhap ten sinh vien can tim kiem: ");
        String i_name = sc.next();
        studentlist.stream().filter(student -> (student.getName().equals(i_name))).forEachOrdered(student -> {
            System.out.println(student);
        });

    }
}
