package dev.yonk.trantrinhan_20121031_tuan05.models;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> alCartItems = new ArrayList<>();
    private double orderTotal;

    public int getLineItemCount() {
        return alCartItems.size();
    }

    public void addCartItem(String model, String description, String strPrice, String strQuantity) {
        int quantity = Integer.parseInt(strQuantity);
        double unitCost = Double.parseDouble(strPrice);
        double total =  unitCost * quantity;
        CartItem cartItem = new CartItem(model, description, unitCost, quantity, total);
        alCartItems.add(cartItem);
        calculateOrderTotal();
    }

    public void deleteCartItem(String strItemIndex) {
        int index = Integer.parseInt(strItemIndex);
        alCartItems.remove(index - 1);
        calculateOrderTotal();
    }

    public void updateCartItem(String strQuantity, String strItemIndex) {
        int index = Integer.parseInt(strItemIndex);
        int quantity = Integer.parseInt(strQuantity);
        CartItem cartItem = alCartItems.get(index - 1);
        cartItem.setQuantity(quantity);
        cartItem.setTotalCost(cartItem.getUnitCost() * quantity);

        calculateOrderTotal();
    }

    public CartItem getCartItem(String strItemIndex) {
        CartItem cartItem = null;
        int index = Integer.parseInt(strItemIndex);
        if (alCartItems.size() > index) {
            cartItem = (CartItem) alCartItems.get(index);
        }
        return cartItem;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public List<CartItem> getCartItems() {
        return alCartItems;
    }

    public void setCartItems(List<CartItem> alCartItems) {
        this.alCartItems = alCartItems;
    }

    protected void calculateOrderTotal() {
        double total = 0;
        for (CartItem alCartItem : alCartItems) {
            total += alCartItem.getTotalCost();
        }
        setOrderTotal(total);
    }
}
