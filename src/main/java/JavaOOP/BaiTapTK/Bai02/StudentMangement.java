/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP.BaiTapTK.Bai02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class StudentMangement {
    public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:\\Code\\Java\\JavaOOP\\JavaOOP\\src\\main\\java\\JavaOOP\\BaiTapTK\\Bai02\\student.txt")));
        ArrayList<Student> studentlist = new ArrayList<>();
        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu: " + (i + 1));
            Student s = new Student();
            s.Input();
            studentlist.add(s);       
        }
        sort_Student(studentlist);
        
        for (Student student : studentlist) {
            System.out.println(student);
            oos.writeObject(student);
            
        }
        oos.close();
    }
    public static void swap_Student(Student s1, Student s2) throws CloneNotSupportedException {
        Student temp = (Student) s1.clone();
        s1 = (Student) s2.clone();
        s2 = (Student) temp.clone();
    }
    public static void sort_Student(ArrayList<Student> list) throws CloneNotSupportedException {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) == 1 ) {
                    swap_Student(list.get(i), list.get(j));
                }            
            }
            
        }
    }
}
