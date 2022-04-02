 
package za.ac.tut.student;
 
public class Student {
   
    private String name;
    private int fanalMark;
    private int studentNumber;
    private int password;
    
    public Student(){}

    public Student(String name,int studentNumber, int password,  int fanalMark) {
        this.name = name;
        this.fanalMark = fanalMark;
        this.studentNumber = studentNumber;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFanalMark() {
        return fanalMark;
    }

    public void setFanalMark(int fanalMark) {
        this.fanalMark = fanalMark;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
     
}
