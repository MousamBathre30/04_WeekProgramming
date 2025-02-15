package juint;




public class DatabaseConnection {

     public static String connect(){
         return "connection Stablished";
     }

     public static String disconnect(){
         return "Connection closed";
     }

    public static void main(String[] args) {
        System.out.println(connect());
        System.out.println(disconnect());
    }
}
