package dev.yonk.trantrinhan_20121031_tuan05.models;

public class CartItem {
    private String strPartNumber;
    private String strModelDescription;

    private double dbUnitCost;
    private int iQuantity;
    private double dblTotalCost;

    public CartItem() {
    }

    public CartItem(String strPartNumber, String strModelDescription, double dbUnitCost, int iQuantity, double dblTotalCost) {
        this.strPartNumber = strPartNumber;
        this.strModelDescription = strModelDescription;
        this.dbUnitCost = dbUnitCost;
        this.iQuantity = iQuantity;
        this.dblTotalCost = dblTotalCost;
    }

    public String getPartNumber() {
        return strPartNumber;
    }

    public void setPartNumber(String strPartNumber) {
        this.strPartNumber = strPartNumber;
    }

    public String getModelDescription() {
        return strModelDescription;
    }

    public void setModelDescription(String strModelDescription) {
        this.strModelDescription = strModelDescription;
    }

    public double getUnitCost() {
        return dbUnitCost;
    }

    public void setUnitCost(double dbUnitCost) {
        this.dbUnitCost = dbUnitCost;
    }

    public int getQuantity() {
        return iQuantity;
    }

    public void setQuantity(int iQuantity) {
        this.iQuantity = iQuantity;
    }

    public double getTotalCost() {
        return dblTotalCost;
    }

    public void setTotalCost(double dblTotalCost) {
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
