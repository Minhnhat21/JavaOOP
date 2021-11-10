/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP.BaiTapTK.Bai02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class StudentManagement {
    protected ArrayList<Student> students;
    
    public void writeFile(ArrayList<Student> studentlist) { 
		
        try {   
            FileOutputStream f = new FileOutputStream("D:\\Code\\Java\\JavaOOP\\JavaOOP\\src\\main\\java\\JavaOOP\\BaiTapTK\\Bai02\\Sinhvien.txt");   // tao file f tro den sinhvien.txt
            ObjectOutputStream oStream = new ObjectOutputStream(f); // dung de ghi theo Object vao file f
            oStream.writeObject(studentlist);   // ghi student theo kieu Object vao file
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error Write file");
        }
    
    }
    public ArrayList<Student> readFile() {
        ArrayList<Student> student = null;
        try {   
            FileInputStream f = new FileInputStream("D:\\Code\\Java\\JavaOOP\\JavaOOP\\src\\main\\java\\JavaOOP\\BaiTapTK\\Bai02\\Sinhvien.txt"); // tao file f tro den sinhvien.txt
            ObjectInputStream inStream = new ObjectInputStream(f);  // dung de doc theo Object vao file f
            // dung inStream doc theo Object, ep kieu tra ve la Student
            student = (ArrayList<Student>) inStream.readObject();
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error Read file");
        }
        return student; 
    }
    
    public static void  Nhap(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu: " + (i + 1));
            Student s = new Student();
            s.Input();
            list.add(s);       
        } 
    }
    public static void HienThi(ArrayList<Student> list) {
        for(Student student : list) {
            System.out.println(student);
        }
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
    
    public static void main(String[] args) throws CloneNotSupportedException {
        StudentManagement studentlist = new StudentManagement();
        studentlist.students = new ArrayList<>();
        
        //Nhap danh sach cac sinh vien
        Nhap(studentlist.students);
        //Xuat danh sach cac sinh vien
        //HienThi(studentlist.students);
        
        //Săp xếp sinh vien theo thanh tich
        sort_Student(studentlist.students);
        
        //Write
        
        studentlist.writeFile(studentlist.students);
        
        //Doc file
        
        
        ArrayList<Student> resultFile = studentlist.readFile();
        
        //Hien thi danh sach da doc
        HienThi(resultFile);
        
        
        
    }
}
