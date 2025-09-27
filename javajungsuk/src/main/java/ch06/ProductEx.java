package ch06;

public class ProductEx {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        System.out.println("product1의 제품번호(serial no)는 " + product1.serialNo);
        System.out.println("product2의 제품번호(serial no)는 " + product2.serialNo);
        System.out.println("product3의 제품번호(serial no)는 " + product3.serialNo);
        System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다.");
    }
}

class Product {
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }

    public Product() {
    }
}
