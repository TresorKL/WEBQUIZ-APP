 
package za.ac.tut.processorinterface;

import za.ac.tut.question.Question;
import za.ac.tut.student.Student;

 
public interface ProcessorInterface {
    
    public boolean loginStudent(int studentNum, int password);
    public boolean loginAdmin(int userId, int password);
    public Student getCurrentStudent(int studentNum);
    public int determineFinalMark(Question[] question, int[] answer);
    //public int determineCurrentMark(Question question, int answer);
    
    
    
}
