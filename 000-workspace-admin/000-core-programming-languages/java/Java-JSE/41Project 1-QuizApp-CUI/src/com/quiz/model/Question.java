package com.quiz.model;
public class Question{
  private int id;
  private String question;
  private String option1;
  private String option2;
  private String option3;
  private String option4;
  private String  ans;
  
   
    public Question(int id, String question, String option1, 
    String option2 ,String option3 ,
    String option4 , String  ans){
      
        this.id=id;
        this .question=question;
        this.option1=option1;
        this.option2=option2;
        this.option3=option3;
        this.option4=option4;
        this.ans=ans;
    
  }


  public String showQuestion(){
  String data ="----------------------------------------\n"+
  "Id: "+this.id +" \n"+
  "Ques"+this.id+": "+this .question +" \n"+
  "a:: "+this.option1+" \n"+
  "b:: "+this.option2+" \n"+
  "c:: "+this.option3+" \n"+
  "d:: "+this.option4+" \n"    
    ;
     
     return data;
    
  }
  
    public String displayAnswer(){
  String data =""+
  "Id: "+this.id +" \n "+
  "Currect Answer: : "+this.ans+" \n "
    
    ;
     
     return data;
    
  }
        public void setId(int id){
          this.id =id;
          }
          public void setId(String question){
          this.question =question;
          }
          public void setOption1(String option1){
          this.option1 =option1;
          }
          public void setOption(String option2){
          this. option2 = option2;
          }
          public void setOption3(String option3){
          this. option3 = option3;
          }
          public void setOption4(String option4){
          this. option4 = option4;
          }
          public void setAns(String ans){
          this.ans =ans;
          }
          
          public int getId(){
            return this.id;
          }
          public String getQuestion(){
            return this.question;
          }
          public String getOption1(){
            return this.option1;
          }
           public String getOption2(){
            return this.option2;
          }
           public String getOption3(){
            return this.option3;
          } public String getOption4(){
            return this.option4;
          }
           public String getAns(){
            return this.ans;
          }
    
}  
