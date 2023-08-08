package MyFitness;

public class ProductCatalog {

    Product[] products;
    final int maxNumberOfProducts = 100;

    int numberOfProducts;

    public ProductCatalog() {
        this.products = new Product[maxNumberOfProducts];
        this.numberOfProducts = 0;
    }

    public void printProducts() {
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println(products[i].toString());
        }
    }

    public boolean addProduct(Product product) {
        //adaug produsul primit ca parametru in lista la pozitia numberOfProduct+1
        //daca produsul se afla deja in lista sau am atins nr maxim, returnez fals
        //altfel adaugam produsul in lista si crestem contorul

        if (isProductAdded(product) || maxNumberOfProducts == numberOfProducts) {
            System.out.println("Produsul" + product.name + "nu poate fi adaugat in lista");
            return false;

        } else {
            products[numberOfProducts] = product;
            numberOfProducts++;
            System.out.println("Produsul" + product.name + "a fost adaugat in lista");
            return true;
        }
    }

    public boolean isProductAdded(Product product) {
        //parcurg lista de produse
        //pentru fiecare produs verificam daca este egal cu produsul primit ca parametru
        //daca da, returnam true
        //return false
        if (numberOfProducts == 0) {
            return false;
        }
        for (int i = 0; i < products.length; i++) {
            if (product.name.equals(products[i].name)) {
                return true;
            }
        }
        return false;
    }

    public Product getProductByName(String name) {
        //parcurg lista si verific daca numele se afla in lista
        //daca se afla in lista returnez produsul din lista care are numele acelasi cu cel citit de la tastatura
        //daca nu, afisez ca nu este in lista
        for (int i = 0; i < numberOfProducts; i++) {
            if (products[i].name.equals(name)) {
                return products[i];
            }
            if (name.equals(products[i].name)) {
            } else {
                System.out.println("Produsul nu a fost gasit");
                return null;
            }
        }
         return null;
    }
}


// public boolean deleteProduct(String name) {
//cautam produsul in lista dupa nume
//daca nu il gasim returnam false
//altfel returnam true
//   for(int i=0;i<numberOfProducts;i++){
//   if()
//    }else{
//return true;


