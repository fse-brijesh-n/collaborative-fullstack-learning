package com.quiz.service;
import java.util.Scanner;
import com.quiz.model.*;

 public class Playground {
  private Question question[]=new Question[5];
  private String userAnswer[]=new String[5];
  
  	  
      public void setQuestion(){
    
     question[0]=new Question( 1, "byte size ", "1","2","4","8" ,"1");
     question[1]=new Question(2, "short size ", "1","2","4","8" ,"2");
     question[2]=new Question(3, "int size ", "1","2","4","8" ,"4");
     question[3]=new Question(4, "float size ", "1","2","4","8" ,"4");
     question[4]=new Question(5, "double size ", "1","2","4","8" ,"8");
           
  }
  
    public void quizPlayer(){
     setQuestion();
     int i=0;
      for(Question ques:question){
         String q=ques.showQuestion();
         System.out.println(q);
         Scanner sc=new Scanner(System.in);
         System.out.println("----------------------------------------");
         System.out.println("your answer: ");
         userAnswer[i++]=sc.nextLine();  

      }  
     
  }
  
   public int getScore(){
   
   int score=0;
   int i=0;
   for(Question q:question){
     String userAns=userAnswer[i++];
     String actualAns=q.getAns();
     if(userAns.equals(actualAns)){
       score++;
     }
   }
    return score;
  }
  
  public  String playQuiz(){
    
    quizPlayer();
    int s=getScore();
    float pers=(s*100/question.length);
      if(pers>=60){
    	
     return "Congratulation! you have win the quiz. Your score is "+pers+"% out of 100"; 
    }else{
      return "Sorry! you have lose the quiz. Your score is "+pers+"% out of 100";
    }
  }

public void viewAnswer() {
	
	for(Question q:question) {
		System.out.println("----------------------------------------");
		System.out.println(q.displayAnswer());
	}
}


}
