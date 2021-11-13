/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP.BaiTapTK.Bai02;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Person implements Cloneable, Comparable<Person>, Serializable{
    private String name;
    private char gender;
    private int birth_year;

    public Person() {
    }

    public Person(String name, char gender, int birth_year) {
        this.name = name;
        this.gender = gender;
        this.birth_year = birth_year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }
    public void Input() {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("Nhap ten: ");
        input = sc.nextLine();
        setName(input);
        System.out.println("Nhap gioi tinh: ");
        input = sc.nextLine();
        setGender(input.charAt(0));
        System.out.println("Nhap nam sinh: ");
        input = sc.nextLine();
        setBirth_year(Integer.parseInt(input));
 
        
    }

    @Override
    public String toString() {
        String ketqua = "\nTen: " + name +
                        "\nGioi tinh: " + gender +
                        "\nNam sinh: " + birth_year;
                        
        return ketqua;
    }
    @Override
    public int compareTo(Person o) {
        if(this.getName().equals(o.name)) {
            return 0;
        }
        return 1;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

	
    
    
    
}
