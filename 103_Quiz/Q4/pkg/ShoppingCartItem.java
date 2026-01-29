package pkg;
import java.util.*;

public class ShoppingCartItem {
    private String itemName;
    private double itemCost;
    private int quantity;

public ShoppingCartItem(){
    itemName = "Nothing";
    itemCost = 0;
    quantity = 0;
}
public ShoppingCartItem(String x, double y, int z){
    itemName = x;
    itemCost = y;
    quantity = z;
}

public void cartToString(){
System.out.println("You have " + quantity + " of " + itemName + " and the total cost is " + itemCost*quantity);
}

public String getItemName(){
    return itemName;
}

public int getQuantity(){
    return quantity;
}

public double getTotalCost(){
    return quantity*itemCost;
}

public double getTotalWithTax(){
    return (quantity*itemCost*0.12)+TotalCost;
}

public double quantityToCostCalculator(int num);
    return itemName;
    return TotalCost;
}
