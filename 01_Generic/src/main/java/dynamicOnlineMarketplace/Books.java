package dynamicOnlineMarketplace;

 class Books {
    String author;
    String name;
    int price;
    Books(String author , String name , int price){
        this.author = author;
        this.name = name;
        this.price = price;
    }
    public void displayInfo(){
        System.out.println("Name the author" + author);
        System.out.println("Name of the book " + name);
        System.out.println("The price of book is "+ price);
    }



}
