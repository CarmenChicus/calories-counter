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

        if (getProductByName(product.name) != null || maxNumberOfProducts == numberOfProducts) {
            return false;

        } else {
            products[numberOfProducts] = product;
            numberOfProducts++;
            return true;
        }
    }

    public Product getProductByName(String name) {
        //parcurg lista si verific daca numele se afla in lista
        //daca se afla in lista returnez produsul din lista care are numele acelasi cu cel citit de la tastatura
        //daca nu, afisez ca nu este in lista
        if (numberOfProducts == 0) {
            return null;
        }
        for (int i = 0; i < numberOfProducts; i++) {
            if (name.equals(products[i].name)) {
                return products[i];
            }
        }
        return null;
    }

    public int getProductIndexByName(String name) {
        //parcurg lista si verific daca numele se afla in lista
        //daca se afla in lista returnez produsul din lista care are numele acelasi cu cel citit de la tastatura
        //daca nu, afisez ca nu este in lista
        if (numberOfProducts == 0) {
            return -1;
        }
        for (int i = 0; i < numberOfProducts; i++) {
            if (name.equals(products[i].name)) {
                return i;
            }
        }
        return -1;
    }

     public boolean deleteProduct(String name) {
         //cautam produsul dupa nume si aflu pozitia lui
         int index = getProductIndexByName(name);

         if (index == -1) {
             return false;
         }
         //stergerea
         //parcurg incepand de la pozitia aflaata pana la numarul de produse
         //la pozitia curenta bag elementul de la pozitia urmatoare
         for (int i = index; i < numberOfProducts - 1; i++) {
             products[i] = products[i + 1];
         }
         numberOfProducts--;
         products[numberOfProducts] = null;
         return true;

     }

}





