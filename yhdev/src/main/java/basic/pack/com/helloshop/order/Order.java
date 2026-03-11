package basic.pack.com.helloshop.order;

import basic.pack.com.helloshop.product.Product;
import basic.pack.com.helloshop.user.User;

public class Order {

    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
