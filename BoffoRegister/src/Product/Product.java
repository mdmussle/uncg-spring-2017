import java.util.List;
import java.util.ArrayList;

public class Product{

        protected Product prod;
        protected String name;
        protected int quantity;
        protected double price;
        protected int UPC;
        protected String SKU;
        protected enum rating {E, T, M}
        
    public Product(){
        this.prod = null;
        this.name = "";
        this.quantity = 0;
        this.price = 0.00;
        this.UPC = 0;
        this.SKU = "";
        this.rating = null;
    }
    public Product(Product prod, String name, int quant, double price, int UPC, String s, enum e){
       this.prod = prod;
       this.name = name;
       this.quantity = quant;
       this.price = price;
       this.UPC = UPC;
       this.SKU = s;
       this.rating = e;
    }
    public Product getProduct(){
        return this.prod;
    }
    public void setName(String n){
        this.prod.name = n;
    }
    public void setPrice(double p){
        this.prod.price = p;
    }
    public void setQuantity(int q){
        this.prod.quantity = q;
    }
    public void setUPC(int u){
        this.prod.UPC = u;
    }W
    public void setSKU(String s){
        this.prod.SKU = s;
    }
    public void setEnum(enum en){
        switch (en){
            case E:
                this.prod.rating = E;
                break;
            case T:
                this.prod.rating = T;
                break;
            case M:
                this.prod.rating = M;
                break;
        }
    }
    public Product findBySKU(String s){
        //Keep narrowest scope possible for parameter s.
        return null;
    }
    public Product findByUPC(int u){
        //Keep narrowest scope possible for parameter i.
        return null;
    }
    public Product findByName(String n){
        //Keep narrowest scope possible for parameter n.
        return null;
    }
    public List findbyQuantity(int n){
        /*Find the products that have quantity n and return
        a list of those products.*/
        return null;
    }
    public Product findByPrice(double p){
        /*Depending on the variety of products will this method 
        be able to find a specific product. Otherwise, return a list of 
        products that have parameter p.
        */
        return null;
    }
} 