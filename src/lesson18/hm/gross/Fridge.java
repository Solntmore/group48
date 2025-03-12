package lesson18.hm.gross;

import java.util.*;

public class Fridge {
    private Map<String, Integer> products = new HashMap<>();

    /**
     * Положить продукт в холодильник
     *
     * @param product название продукта
     * @param weight  вес продукта
     */
    public void addProduct(String product, int weight) {
        if (products.containsKey(product)) {
            int currentWeight = products.get(product);
            products.put(product, currentWeight + weight);
        } else {
            products.put(product, weight);
        }
    }

    /**
     * Взять продукт из холодильника. Понимаю как забрать, удалить.
     *
     * @param product название продукта
     * @param weight  вес продукта
     */
    public void takeProduct(String product, int weight) {
        products.remove(product, weight);
    }

    /**
     * Вывести вес всех продуктов в холодильнике(сумма)
     */
    public void showTotalWeight() {
        int sumWeight = 0;
        for (Integer value : products.values()) {
            sumWeight += value;
        }
        System.out.println(sumWeight);
    }

    /**
     * Вывести вес конкретного продукта в холодильнике
     */
    public void findProductWeight(String product) {
        Integer value = products.get(product);
        System.out.println("Всего " + product + " весит: " + value + " грамм");
    }

    /**
     * Вывести наименование продукта, который закончится первым
     */
    public void showWhatWillFinishFirst() {
        Integer minProductWeight = null;
        for (Integer value : products.values()) {
            if (minProductWeight == null || value < minProductWeight) {
                minProductWeight = value;
            }
        }
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getValue().equals(minProductWeight)) {
                System.out.println("Закончится первым, вероятнее всего: " + entry.getKey());
                break;
            }
        }
    }

    /**
     * Вывести наименование продукта, которого больше всего
     */
    public void findTheProductThatHasMore() {
        Integer maxProductWeight = null;
        for (Integer value : products.values()) {
            if (maxProductWeight == null || value > maxProductWeight) {
                maxProductWeight = value;
            }
        }
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getValue().equals(maxProductWeight)) {
                System.out.println("Больше всего в холодильнике: " + entry.getKey());
                break;
            }
        }
    }

    /**
     * Вывести все продукты (название + вес) по алфавиту от Я до А
     */
    public void printAllProductsFromZToA() {
        //По умолчанию от А до Я, поэтому устанавливаем компаратор reverseOrder(), который развернет порядок наоборот
        Set<String> productNames = new TreeSet<>(Comparator.reverseOrder());
        productNames.addAll(products.keySet());

        for (String productName : productNames) {
            System.out.println(productName + " - " + products.get(productName));
        }
    }
}