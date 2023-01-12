package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkOut(String status){
        System.out.println("Check Out Method from ShoppingCart");
    }

    public int quantity(int noOfPack){
        return 12*noOfPack;
    }
}
