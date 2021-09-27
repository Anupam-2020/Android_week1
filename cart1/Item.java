package cart1;

import java.util.LinkedList;

public class Item {
    
    private Long id;
    private Double price;
    private String name;
    private Integer quantity;
    private Double total;

    private LinkedList<Item> items;


    public void setTotal(Double t) {
        total = t;
    }

    public Double getTotal() {
        return total;
    }
   


    public void setQuantity(Integer q) {
        quantity = q;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public void setName(String n) {
        name = n;
    }


    public String getName() {
        return name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long a) {
        id = a;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double b) {
        price = b;
    }

    public LinkedList<Item> getitems() {
        return items;
    }

    public void setitems(LinkedList<Item> It) {
        items = It;
    } 
}
