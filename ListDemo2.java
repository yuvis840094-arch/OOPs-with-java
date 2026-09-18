// Online shopping cart using List
import java.util.*;
public class ListDemo2 {
    
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();

        addItem(cart, "Laptop");
        addItem(cart, "Smartphone");
        addItem(cart, "Headphones");
        addItem(cart, "Keyboard");
        addItem(cart, "Mouse");
        addItem(cart, "Mouse");

        System.out.println("Shopping Cart:");  
        displayCart(cart);

        System.out.println("Mouse count: " + countItems(cart, "Mouse"));

        removeItem(cart, "Mouse");

        System.out.println("Shopping Cart after removing a mouse:");  
        displayCart(cart);

    }

    public static void addItem(List<String> cart, String item){
        cart.add(item);
    }

    public static void removeItem(List<String> cart, String item){
        cart.remove(item);
    }

    public static int countItems(List<String> cart, String item){
        int count = 0;
        for(String i : cart){
            if(i.equals(item)){
                count++;
            }
        }
        return count;
    }

    public static void displayCart(List<String> cart){
        for(String item : cart){
            System.out.println(item);
        }
    }
    
}
