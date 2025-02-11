package smartWarehouseManagement;

import java.util.ArrayList;

abstract class WarehouseItem {


   String name;
   String id;
   private double price;
   WarehouseItem(String name , String id , double price){
      this.name = name;
      this.id = id ;
      this.price = price;
   }
  public String  getId(String id){
      return id;
   }
   public String getName(String name){
      return name;
   }

   abstract  public void displayItemInfo();
   public String toString() {
      return getClass().getSimpleName() + " - " + name + ", Price: $" + price;
   }
}
