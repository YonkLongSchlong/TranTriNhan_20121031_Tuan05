package dev.yonk.trantrinhan_20121031_tuan05.models;

public class CartItem {
    private String strPartNumber;
    private String strModelDescription;
    private double iQuantity;
    private double dblTotalCost;

    public CartItem() {
    }

    public CartItem(String strPartNumber, String strModelDescription, double iQuantity, double dblTotalCost) {
        this.strPartNumber = strPartNumber;
        this.strModelDescription = strModelDescription;
        this.iQuantity = iQuantity;
        this.dblTotalCost = dblTotalCost;
    }

    public String getStrPartNumber() {
        return strPartNumber;
    }

    public void setStrPartNumber(String strPartNumber) {
        this.strPartNumber = strPartNumber;
    }

    public String getStrModelDescription() {
        return strModelDescription;
    }

    public void setStrModelDescription(String strModelDescription) {
        this.strModelDescription = strModelDescription;
    }

    public double getiQuantity() {
        return iQuantity;
    }

    public void setiQuantity(double iQuantity) {
        this.iQuantity = iQuantity;
    }

    public double getDblTotalCost() {
        return dblTotalCost;
    }

    public void setDblTotalCost(double dblTotalCost) {
        this.dblTotalCost = dblTotalCost;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "strPartNumber='" + strPartNumber + '\'' +
                ", strModelDescription='" + strModelDescription + '\'' +
                ", iQuantity=" + iQuantity +
                ", dblTotalCost=" + dblTotalCost +
                '}';
    }
}
