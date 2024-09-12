import com.polban.jtk.sales.*;

public class App {

    public static void main(String[] args) {
        Product produk1 = new Product("Laptop", 10000000, 10);
        Sales sales1 = new Sales(produk1);

        sales1.sellProduct(5);
        sales1.restockProduct(10);
        sales1.updateProductPrice(11000000);
        sales1.updateProductPrice(-11000000);
    }
}



