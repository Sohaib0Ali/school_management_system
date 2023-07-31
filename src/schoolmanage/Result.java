/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanage;

/**
 *
 * @author SOHAIB ALI
 */
public class Result {
   private int total_marks;
    String grade;
    int s1_marks;
    int s2_marks;
    int s3_marks;
    int s4_marks;
    public void settotal_marks(int total_marks){
        this.total_marks=total_marks;
    }

    /**
     *
     * @return
     */
    public int gettotal_marks(){
        return total_marks;
    }
    Result(int s1_marks,int s2_marks,int s3_marks,int s4_marks){
        this.s1_marks=s1_marks;
        this.s2_marks=s2_marks;
        this.s3_marks=s3_marks;
        this.s4_marks=s4_marks;
    }
    public void marks(){
        System.out.println("enter all subject marks of student");
    }
    public void calculate_result(){
        System.out.println("Calculate result");
        System.out.println("obtained marks : "+(s1_marks+s2_marks+s3_marks+s4_marks)+(" out of ")+ total_marks);
    }
    public void edit(){
        System.out.println("edit result");
    }
}
