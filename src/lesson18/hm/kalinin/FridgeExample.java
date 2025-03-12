package lesson18.hm.kalinin;

public class FridgeExample {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.addProduct("Банан", 200);
        fridge.addProduct("Масло", 500);
        fridge.addProduct("Банан", 400);
        fridge.addProduct("Йогурт", 150);
        fridge.addProduct("Колбаса", 1000);

        System.out.println("\nНаши продукты в холодильнике:");
        fridge.printAllProducts();


        System.out.println("\nВзяли продукт из холодильника:");
        fridge.removeProduct("Колбаса");

        System.out.println("\nВес всех продуктов в холодильнике (сумма)");
        fridge.allWeightProducts();

        System.out.println("\nВес конкретного продукта в холодильнике");
        fridge.weightProduct("Банан");

        System.out.println("\nКакой продукт закончится первым:");
        fridge.smallerWeightProducts();

        System.out.println("\nПродукт, которого больше всего:");
        fridge.muchWeightProducts();

        System.out.println("\nСписок всех продуктов от Я до А");
        fridge.printAllProductsFromZToA();

        System.out.println("\nСписок продуктов (название + вес) по весу от большего к меньшему");
        fridge.printProductsByWeightReverse();
    }
}
