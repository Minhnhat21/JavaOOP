/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP.BaiTapTK.Bai02;

import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Student extends Person {
    private String studentID;
    private int academic_year;
    private float gpa;
    private float social_activity;

    public Student() {
    }

    public Student(String studentID, int academic_year,float gpa, float social_activity, String name, char gender, int birth_year) {
        super(name, gender, birth_year);
        this.studentID = studentID;
        this.academic_year = academic_year;
        this.gpa = gpa;
        this.social_activity = social_activity;
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

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getSocial_activity() {
        return social_activity;
    }

    public void setSocial_activity(float social_activity) {
        this.social_activity = social_activity;
    }
    
    @Override
    public void Input() {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        String input;
        super.Input(); 
        System.out.println("Nhap ma sinh vien: ");
        input = sc.nextLine();
        setStudentID(input);
        System.out.println("Nhap nam hoc: ");
        input = sc.nextLine();
        setAcademic_year(Integer.parseInt(input));
        System.out.println("Nhap GPA: ");
        setGpa(sc.nextFloat());
        System.out.println("Nhap diem social_activity: ");
        setSocial_activity(sc.nextFloat());
    }

    
    @Override
    public String toString() {
        String ketqua = super.toString();
        ketqua += "\nMa sinh vien: " + studentID +
                  "\nacademic_year:  " + academic_year +
                  "\nGPA: " + gpa +
                  "\nSocial_activity: " + social_activity;
        return ketqua;
    }

   
    
    
  
    @Override
	public int compareTo(Person o) {
    	if (o instanceof Student) {
    		Student otherStudent = (Student) o; 
    		if(this.gpa == otherStudent.gpa && this.social_activity == otherStudent.social_activity) 
    			return 0;
    		else if(this.gpa > otherStudent.gpa && this.social_activity > otherStudent.social_activity)
    			return 1;
    		else return -1;
        } else {  
            return 0;
        }
	}

	@Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    
    
    
    
    
}
