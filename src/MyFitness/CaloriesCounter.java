package MyFitness;

import java.util.Scanner;

public class CaloriesCounter {
    public static void main(String[] args) {

        ProductCatalog productCatalog = new ProductCatalog();
        Product product = new Product("pere", 20, 10, 15);
        productCatalog.addProduct(product);
        productCatalog.printProducts();

        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            printMeniu();
            option = scanner.nextInt();
            performSelectedOption(option, productCatalog, scanner);
        } while (option != 6);

    }
    public static void printMeniu() {
        System.out.println("MENIU: ");
        System.out.println("1. Adauga produs in calculator si calculeaza-i caloriile");
        System.out.println("2. Calculeaza caloriile pentru un produs fara a fi adaugat in catalog");
        System.out.println("3. Afiseaza toate produsele din catalog si caloriile pentru fiecare");
        System.out.println("4. Sterge un produs din catalog");
        System.out.println("5. Gaseste produs dupa nume");
        System.out.println("6. EXIT ");
        System.out.println("-----------------------------------");
        System.out.println("Alege actiunea cu numarul:");

    }

    public static void performSelectedOption(int option, ProductCatalog productCatalog, Scanner scanner) {
        switch (option) {
            case 1:
                //citim de la tastatura detaliile produsului
                // ne instantiem un produs cu aceste detalii
                //pasam obiectul creat la  metoda addProduct
                String name = scanner.next();
                double fats = scanner.nextDouble();
                double carbs = scanner.nextDouble();
                double proteins = scanner.nextDouble();
                Product newProduct = new Product(name, fats, carbs, proteins);
              boolean result = productCatalog.addProduct(newProduct);
                //      Product product = new Product("pere", 20, 10, 15);
                productCatalog.addProduct(newProduct);
                productCatalog.printProducts();
                break;
            case 2:
                System.out.println("Nume produs:   ");
                name = scanner.next();
                System.out.println("Grasimi:");
                fats = scanner.nextDouble();
                System.out.println("Carbohidrati:");
                carbs = scanner.nextDouble();
                System.out.println("Proteine:");
                proteins = scanner.nextDouble();
                Product Product = new Product(name, fats, carbs, proteins);
                System.out.println(Product);
                break;
            case 3:
                productCatalog.printProducts();
                break;
            // case 4:
            //    System.out.println("Nume: ");
            //    name = scanner.nextLine();
            //   productCatalog.deleteProduct(name);
            //  break;
            case 5:
                System.out.println("Ce produs cauti?");
                name = scanner.next();
                Product product1 = productCatalog.getProductByName(name);
                System.out.println(product1);
                break;
            case 6:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Optiunea este invalida, reintroduceti optiunea");
        }
    }

}