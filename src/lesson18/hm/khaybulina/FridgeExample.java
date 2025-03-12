package lesson18.hm.khaybulina;

public class FridgeExample {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.addProduct("Банан", 600);
        fridge.addProduct("Масло", 200);
        fridge.addProduct("Банан", 400);
        fridge.addProduct("Йогурт", 220);
        fridge.addProduct("Колбаса", 1000);

        System.out.println("\nВес бананов составляет: " + fridge.getProductWeight("Банан") + " гр.");
        System.out.println("\nПервым закончится : " + fridge.getFirstToFinishProducts());
        System.out.println("\nБольше всего в холодильнике: " + fridge.getMostProduct());

        fridge.takeProduct("Колбаса", 300);
        System.out.println("\nПосле того, как я отрезала кусок колбасы, его осталось: " + fridge.getProductWeight("Колбаса") + " гр.");
        System.out.println("\nОбщий вес всех продуктов: " + fridge.getAllWeight() + " гр.");
        System.out.println("\nВыведем все продукты и веса от Я до А");
        fridge.printAllProductsFromZToA();

        System.out.println("\nВывести все продукты (название + вес) по весу от большего к меньшему");
        fridge.printAllProductsByWeight();
    }
}
