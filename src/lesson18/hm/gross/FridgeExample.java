package lesson18.hm.gross;

public class FridgeExample {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.addProduct("Банан", 200);
        fridge.addProduct("Масло", 500);
        fridge.addProduct("Банан", 400);
        fridge.addProduct("Йогурт", 150);
        fridge.addProduct("Колбаса", 1000);

        System.out.println("\nВыведем все продукты и веса от Я до А");
        fridge.printAllProductsFromZToA();

        System.out.println("\nРеализация функции взять продукт из холодильника. Т.е. удалить из холодильника.");
        fridge.takeProduct("Йогурт", 150);

        System.out.println("\nПроверим наличие оставшихся элементов");
        fridge.printAllProductsFromZToA();

        System.out.println("\nВыводим вес всех продуктов в холодильнике(сумма)");
        fridge.showTotalWeight();

        System.out.println("\nВыводим вес конкретного продукта в холодильнике");
        fridge.findProductWeight("Банан");

        System.out.println("\nВывести наименование продукта, который закончится первым");
        fridge.showWhatWillFinishFirst();

        System.out.println("\nВывести наименование продукта, которого больше всего");
        fridge.findTheProductThatHasMore();
    }
}