package dev.yonk.trantrinhan_20121031_tuan05.models;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

    private static final List<Product> products = new ArrayList<Product>();

    static {
        initData();
    }

    public static List<Product> queryProducts () {
        return products;
    }

    private static void initData() {
        Product product = new Product();
        product.setId("01");
        product.setModel("Pixel 8a");
        product.setDescription("");
        product.setQuantity(10);
        product.setPrice(99000);
        product.setImgUrl("/images/dt1.jpg");
        products.add(product);

        product = new Product();
        product.setId("02");
        product.setModel("Iphone 11");
        product.setDescription("");
        product.setQuantity(10);
        product.setPrice(48000);
        product.setImgUrl("/images/dt2.jpg");
        products.add(product);

        product = new Product();
        product.setId("03");
        product.setModel("Sony Xperia 5");
        product.setDescription("");
        product.setQuantity(10);
        product.setPrice(52000);
        product.setImgUrl("/images/dt3.jpg");
        products.add(product);

        product = new Product();
        product.setId("04");
        product.setModel("Xiaomi 12T");
        product.setDescription("");
        product.setQuantity(10);
        product.setPrice(83000);
        product.setImgUrl("/images/dt4.jpg");
        products.add(product);

        product = new Product();
        product.setId("05");
        product.setModel("Samsung A55");
        product.setDescription("");
        product.setQuantity(10);
        product.setPrice(71000);
        product.setImgUrl("/images/dt5.jpg");
        products.add(product);


    }
}
