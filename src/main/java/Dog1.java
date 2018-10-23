class Animal1{  
 void eat(){System.out.println("animal is eating...");}  
}  
  
class Dog1 extends Animal1{  
 void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Animal1 a=new Dog1(); 
  Dog1 dogg = (Dog1)a;
  dogg.eat();  
 }  
}  