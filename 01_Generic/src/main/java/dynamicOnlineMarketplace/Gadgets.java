package dynamicOnlineMarketplace;

 public class Gadgets {

    String name;
    String type;
    int price;

    Gadgets(String name , String type , int price){
        this.name = name ;
        this.type = type;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Name of Gadges" + name);
        System.out.println("Name of the type" + type);
        System.out.println("Price-: " + price);
    }
     public void discount( int discount){
         System.out.println("Price after discount " + (price - discount * 100));
     }
}
