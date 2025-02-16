package annotation.exercise;



 class Animal{

   void makeSound(){
       System.out.println("Sound of animal");
   }
}
class Dog  extends Animal{
     @Override
     void makeSound(){
         System.out.println("Sound of dog ");
     }
}
public class OverideCorrectly {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();

    }
}
