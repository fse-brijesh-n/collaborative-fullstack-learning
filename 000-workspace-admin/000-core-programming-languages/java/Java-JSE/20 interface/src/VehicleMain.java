 interface vehicle{
    void start();
    void noOfGGears(int a);
}
/*
abstract class key implements vehicle {
    public  void start(){
        println("This is your key");
    }
}

*/ 
 class bus implements vehicle{

        public void start(){
                System.out.println("Bus start with key");
         }
  public  void noOfGGears(int a){
             System.out.println(a+" gears in the bus ");
    }
}

 class car implements vehicle{

      public   void start(){
                System.out.println("car start with key");
         }
  public  void noOfGGears(int a){
             System.out.println(a+" gears in the car ");
    }
}

 class bike implements vehicle{

     public    void start(){
                System.out.println("bike start with kick");
         }
 public   void noOfGGears(int a){
             System.out.println(a+" gears in the bike ");
    }
}

public class VehicleMain {

    public static void main(String arr[]){

        vehicle vm;
        vm=new car();
        vm.start();
        vm.noOfGGears(6);
          vm=new bus();
        vm.start();
        vm.noOfGGears(8);
         vm=new bus();
        vm.start();
        vm.noOfGGears(2); 

        // bus bs=new bus();
        // car cr=new car();
        // bike bk=new bike();

        // bs.start();
        // bs.noOfGGears(5);

        //  cr.start();
        // cr.noOfGGears(4);

        //  bk.start();
        // bk.noOfGGears(6);
     
    }
}