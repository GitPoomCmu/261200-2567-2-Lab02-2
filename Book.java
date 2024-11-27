class Book{
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    } 
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("[*] " + "\"" + title + "\" by " + author + ". Price " + price);
    }

    public void updatePrice(double newPrice) {
        if(newPrice < 0) this.price = 0.0; 
        else this.price = newPrice;
    }

    public void makeDiscount(double discountRate){
        double preDiscount = this.price;
        if(discountRate > 100) discountRate = 100;
        else if(discountRate < 0) discountRate = 0;
        this.price -= (discountRate / 100) * this.price;
        System.out.println("[!] " + "\"" + title + "\" " + "has been discounted by " + discountRate + "% to " + this.price + 
        " from the previous " + preDiscount);
    }
}