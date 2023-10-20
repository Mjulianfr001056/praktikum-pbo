package meet2.Tugas.Book;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){
        return name;
    }

    public Author[] getAuthor(){
        return authors;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
    
    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String getAuthorNames(){
        String result = "";

        for (Author i : this.authors) {
            if(result.equalsIgnoreCase("")){
                result = i.getName();
            }else{
                result = result + ", " + i.getName();
            }
        }
       
        return result;
    }
    
    @Override
    public String toString(){
        String result = "";

        for (Author i : this.authors) {
            if(result.equalsIgnoreCase("")){
                result = i.toString();
            }else{
                result = result + ", " + i.toString();
            }
        }
        
        result = "authors={"+ result + "}";
        
        return "Book[name=" + name + ", " + result + ",price="+price+",qty="+qty+"]";
    }
}

