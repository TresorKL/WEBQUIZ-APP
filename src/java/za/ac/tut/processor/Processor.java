 
package za.ac.tut.processor;
 
 
import java.util.ArrayList;
import java.util.List;
import za.ac.tut.admin.Admin;
import za.ac.tut.processorinterface.ProcessorInterface;
import za.ac.tut.question.Question;
import za.ac.tut.student.Student;

public class Processor implements ProcessorInterface {
    
    
    public Processor(){}
    // temporary data
    
   
    Admin admin= new Admin(0000,6666);
    
    public List classList(){
         // create 3 student objects
     List <Student> students = new ArrayList<>();
     
     Student studentOne =new Student("TRESOR", 1111,4444,0);
      Student studentTwo =new Student("ENOCK", 2222,1234,0);
      Student studentThree =new Student("DAVID", 3333,5555,0);
     
      students.add(studentOne);
      students.add(studentTwo);
      students.add(studentThree);
      
      return students;
    }
    
  
      
    @Override
    public boolean loginStudent(int studentNum, int password) {
        boolean isValid = true;
        List <Student> classList =classList();
        int x=0;
          int isFound =-1;
        
        // search student by student number
        while(x<classList.size() && studentNum != classList.get(x).getStudentNumber()){
            x++;
        }
        if(x==classList.size()){
            isValid = false;
        }else{
            if(classList.get(x).getPassword()== password){
                 isValid = true;
            }else{
               isValid = false; 
            }
        }
           
        return isValid;
    }

    @Override
    public boolean loginAdmin(int userId, int password) {
         boolean isValid = true;
          if(userId == admin.getUseId() && password == admin.getPassword()){
              isValid = true;
          }else{
              isValid = false;
          }
          
     
          
           return isValid;   
    }

    @Override
    public Student getCurrentStudent(int studentNum) {
        List classList = classList();
        Student currentStudent= new Student();
         for(int i=0; i<classList.size();i++){ 
             Student student = (Student)classList.get(i);
             
             
             if(student.getStudentNumber() == studentNum){
                 currentStudent = student;
             }
             
         }
         return currentStudent;
    }

    @Override
    public int determineFinalMark(Question[] questions, int[] answers) {
           int finalMarks=0;
           int mark1=0, mark2=0,mark3=0,mark4=0;
           //
           int correctMarkOne = questions[0].getNumOne() + questions[0].getNumTwo();
           int correctMarkTwo = questions[1].getNumOne() - questions[1].getNumTwo();
           int correctMarkThree = questions[2].getNumOne() * questions[2].getNumTwo();
           int correctMarkFour = questions[3].getNumOne() /questions[3].getNumTwo();
           
           //System.out.println(correctMarkOne+""+correctMarkTwo+" "+correctMarkThree+" "+correctMarkFour);
           
         for(int i=0; i<answers.length;i++){
             
             if(answers[i]==correctMarkOne){
                 mark1=10;
                 //finalMarks +=finalMarks +mark1 ;
           }else if(answers[i]==correctMarkTwo){
                
                   mark2=10;
                   //finalMarks +=finalMarks +mark2 ;
           }else if(answers[i]==correctMarkThree){
                mark3 =10;
                //finalMarks +=finalMarks +mark3 ;
           }else if(answers[i]==correctMarkFour){
              mark4=10;
              //finalMarks +=finalMarks +mark4;
           }
         
         }  
           
            //finalMarks =answers[3];
          finalMarks =mark1+ mark2+mark3+mark4;
           
           
              
             
       return finalMarks;
    }

   
    
}
