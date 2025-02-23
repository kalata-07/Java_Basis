package Encapsulation;

import java.util.LinkedList;


public class Person {
    private String name;
    private int money;
    private LinkedList<Product> bagOfProducts = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.trim().isEmpty())
        {
        this.name = name;
        }else
            System.out.println("Invalid person name entry!");

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if(money>=0) {
            this.money = money;
        }else
            System.out.println("Invalid entry for money!");
    }

    public LinkedList<Product> getBagOfProducts() {
        return bagOfProducts;
    }

    public Person(String name, int money){
        setName(name);
        setMoney(money);
    }

        public void BuyProduct(Product product){
            if(this.getMoney()>= product.getCost()){
                this.bagOfProducts.add(product);
                this.setMoney(this.getMoney()-product.getCost());
                System.out.printf("\"[%s] bought [%s]\"\n",  this.getName(), product.getName());
        }else
                System.out.printf("\"[%s] can't afford [%s]\"\n", this.getName(), product.getName());
    }

    public void PrintItemsForUser(){
        if (bagOfProducts.isEmpty()){
            System.out.printf("\"[%s] - nothing bought\"\n",this.getName());
            return;
        }

        String itemNames="";
        for (Product product : bagOfProducts){
if(bagOfProducts.size()>1){
    itemNames+=product.getName() + ", ";
}else{
    itemNames+= product.getName();
}
        }
itemNames=itemNames.trim();
        if(itemNames.lastIndexOf(",")== itemNames.length()-1){
            itemNames=itemNames.substring(0, itemNames.length()-1);
        }
        System.out.println(this.getName() + "-"+ " " + itemNames);
    }
}
