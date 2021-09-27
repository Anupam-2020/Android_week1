package cart1;


import java.util.LinkedList;

public class CartItems {
    
    private LinkedList<Item> database;

    public CartItems() {
        database = new LinkedList<>();
    }

    
    public double addItem(Long id, Double price, String name, Integer quantity) { 


        int pos = findItemPositionById(id);
        if (pos != -1) { 
            Item it = database.get(pos); 
            it.setId(id);
            it.setQuantity(quantity+it.getQuantity());
            it.setTotal(it.getTotal() + price*quantity); 
            database.set(pos, it); 
            return it.getPrice();
        }

        Item it = new Item();
        it.setPrice(price);
        it.setId(id);
        it.setName(name);
        it.setQuantity(quantity);
        it.setTotal(price*quantity);
        database.add(it); 

        return it.getPrice();
    }

    private Integer findItemPositionById(Long id) {
        for(int i = 0; i < database.size(); i++) {
            Item it = database.get(i);
            if (it.getId().equals(id)) 
                return i;
        }
        return -1; 
    }

    public void cartItems() {
        for(int i = 0; i< database.size(); i++) {
            Item it = database.get(i);
            System.out.println("Id "+it.getId()+ " Name "+it.getName()+" Price :  " + it.getPrice() +  " Quantity : " + it.getQuantity()+ " Total : " + it.getTotal());
        }
    }

    public void removeItem(Long id, Integer quantity) {
        Integer flag = 0;
        if(database.size()==0) {
            System.out.println("\n Cart is empty");
        }
        else{
            for(int i=0; i<database.size(); i++) {
                Item it = database.get(i);
                if(it.getId().equals(id)) {
                    flag = 1;
                    if(it.getQuantity() > quantity) {
                        it.setQuantity(it.getQuantity() - quantity);
                        it.setTotal(it.getTotal() - it.getPrice()*quantity);
                    }
                    else {
                    
                    database.remove(it);
                    System.out.println("\n Item has been removed");}
                    break;
                }
            }
                if(flag == 0) {
                    System.out.println("\n Item does not exist");
                    //System.exit(0);
                }

            
        }

    }

    public void totalInCart() {
        Item tl;
        Double total = 0.0;
        for(int i = 0; i < database.size(); i ++) {
            tl = database.get(i);
            total = tl.getTotal() + total;
        }
        System.out.println("\n Total is :  " + total);
    }

}
