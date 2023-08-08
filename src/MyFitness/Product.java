package MyFitness;

public class Product {

    String name;
    double fats;
    double carbs;
    double proteins;
    double calories;

    public Product(String name, double fats, double carbs, double proteins) {
        this.name = name;
        this.fats = fats;
        this.carbs = carbs;
        this.proteins = proteins;
        this.calories = computeCalories(fats, carbs, proteins);
    }

    public static double computeCalories(double fats, double carbs, double proteins) {
        return (9 * fats) + (4 * carbs) + (4 * proteins);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", fats=" + fats +
                ", carbs=" + carbs +
                ", proteins=" + proteins +
                ", calories=" + calories +
                '}';
    }
}
