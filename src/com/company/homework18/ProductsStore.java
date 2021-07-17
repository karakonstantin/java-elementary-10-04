package com.company.homework18;
//#3
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductsStore {
    private Products products;
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private String inputMethod;
    public static void main(String[] args) throws IOException {
        ProductsList productsList = new ProductsList();
        ProductsStore productsStore = new ProductsStore();

        while(true){
            productsStore.products = new Products();
            System.out.println("Enter with add, remove or exit ");
            productsStore.inputMethod = productsStore.bufferedReader.readLine();
            if (productsStore.inputMethod.equals("exit")){
                break;
            }
            switch (productsStore.inputMethod) {
                case("add"):
                    System.out.println("Enter a name of product");
                    productsStore.inputMethod = productsStore.bufferedReader.readLine();
                    productsStore.products.setName(productsStore.inputMethod);
                    System.out.println("Enter an amount of products");
                    productsStore.inputMethod = productsStore.bufferedReader.readLine();
                    productsStore.products.setNumber(Integer.parseInt(productsStore.inputMethod));
                    System.out.println("Enter a price of products");
                    productsStore.inputMethod = productsStore.bufferedReader.readLine();
                    productsStore.products.setPrice(Integer.parseInt(productsStore.inputMethod));
                    System.out.println("Enter a weight of product");
                    productsStore.inputMethod = productsStore.bufferedReader.readLine();
                    productsStore.products.setWeight(Integer.parseInt(productsStore.inputMethod));
                    productsList.add(productsStore.products);
                    break;
                case("remove"):
                    System.out.println("Enter a name of product");
                    productsStore.inputMethod = productsStore.bufferedReader.readLine();
                    productsList.removeProduct(productsStore.inputMethod);
                    break;
                default:
                    break;
            }
        }
    }
}
