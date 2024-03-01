package less14;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private String customerName;
    private int totalPrice;
    private List<Caffe> totalList = new ArrayList<>();

    public Order(int id, String customerName, int totalPrice, List<Caffe> totalList) {
        this.id = id;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
        this.totalList = totalList;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Caffe> getTotalList() {
        return totalList;
    }
    public void createOrder(Caffe caffe ){
        totalList.add(new Caffe(caffe.getName(),caffe.getPrice(),caffe.getSizes()));
    }
    public void setTotalList(List<Caffe> totalList) {
        this.totalList = totalList;
    }
    private int calculateTotalPrice() {
        for (Caffe c : totalList) {
            totalPrice += c.getPrice();
        }
        return totalPrice;
    }
}
