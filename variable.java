 public class variable{
     static int b=10;//static variable
     int a=4;//instance variable
     public static void main(String[] args){
         int d=3;//local variable
         variable ref=new variable();//object created show the instance variable
         //output//
         System.out.println(d);//local variable
         System.out.println(variable.b);//static variable
         System.out.println(ref.a);//instance variable
     }
 }