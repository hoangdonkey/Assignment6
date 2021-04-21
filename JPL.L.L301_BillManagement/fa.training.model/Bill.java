import java.io.Serializable;

public class Bill implements Serializable {
    private static final long serialVersionUID = 1L;

    private String billCode;
    private String customerName;
    private String createdDate;
    private float discount;
    private double totalPrice;

    public Bill() {
        super();
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Bill(String billCode, String customerName, String createdDate, float discount, double totalPrice) {
        super();
        this.billCode = billCode;
        this.customerName = customerName;
        this.createdDate = createdDate;
        this.discount = discount;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return billCode+"\n"+customerName+"\n"+createdDate+"\n"+discount+"\n"+totalPrice;
    }

}
