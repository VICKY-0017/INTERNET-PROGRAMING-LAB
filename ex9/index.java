import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Order {
    private String orderId;
    private String customerName;
    private String orderDate;

    public Order(String orderId, String customerName, String orderDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOrderDate() {
        return orderDate;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("001", "John Doe", "2022-03-10"));
        orders.add(new Order("002", "Jane Smith", "2022-03-12"));
        orders.add(new Order("003", "Bob Johnson", "2022-03-15"));
        Collections.sort(orders, Comparator.comparing(Order::getOrderDate));
        System.out.println("OrderID\tCustomerName\tOrderDate");
        <c: forEach (Order order : orders) {
            System.out.printf("%s\t%s\t%s\n", order.getOrderId(), order.getCustomerName(), order.getOrderDate());
        }
       </c:forEach>
}
}
