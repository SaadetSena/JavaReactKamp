package oopIntro;

public class Main {

    public static void main(String[] args) {


        Product product1 = new Product();  // Referans Olu�turma, Intance
        // Product i�inde olu�turdu�umuz constructor blo�u default olarak her zaman mevcut. Ancak biz i�erisine �al�smas�n� istedi�imiz kodu da elle yazabiliyoruz.
        
        product1.name = "Lenovo V14";
        product1.unitPrice = 15000;
        product1.detail = "16 GB Ram"; 

        Product product2 = new Product(); 
        product2.id = 2;
        product2.name = "Lenovo V15";
        product2.unitPrice = 16000;
        product2.detail = "32 GB Ram";

        Product product3 = new Product(); 
        product3.id = 3;
        product3.name = "HP 5";
        product3.unitPrice = 10000;
        product3.detail = "8 GB Ram";

        // T�m �r�nlerin tutuldu�u Array
        Product[] products = {product1, product2, product3}; 


        for (Product product : products) {      // "product", "products" dizisi i�indeki t�m Product objelerini geziyor.

            System.out.println(product.name);

        }

        System.out.println(products.length);    // Dizinin uzunlu�unu yazar.


        // CATEGORY
        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Bilgisayar";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Ev/Bah�e";


        // PRODUCT MANAGER
        
        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);




         }

}
