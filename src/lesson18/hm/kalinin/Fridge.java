package lesson18.hm.kalinin;

import java.util.*;

public class Fridge {
    private Map<String, Integer> products = new HashMap<>();

    public void addProduct(String product, int weight) {
        //если такой продукт уже есть в холодильнике, то добавляем его вес к существующему
        if (products.containsKey(product)) {
            int currentWeight = products.get(product);
            products.put(product, currentWeight + weight);
        } else {
            products.put(product, weight);
        }
    }

    public void printAllProducts() {
        for (String productName : products.keySet()) {
            System.out.println(productName + " - " + products.get(productName));
        }
    }

    public void removeProduct(String product) {
        products.remove(product);

        System.out.println(product);

        System.out.println("Остались продукты в холодильнике:");
        for (String productName : products.keySet()) {
            System.out.println(productName + " - " + products.get(productName));
        }
//        Вариант №2 получения остатка продуктов - через лямбда
//        products.forEach((productName, weight) -> System.out.println(productName + " - " + weight));
    }

    public void allWeightProducts() {
        int totalWeight = 0;
        for (Integer weight : products.values()) {
            totalWeight += weight;
        }
        System.out.println(totalWeight + " грамм");
    }

    public void weightProduct(String product) {
        System.out.println("Общий вес продукта: " + product + " - " + products.get(product));
    }

    public void smallerWeightProducts() {
//      Вариант №1 - с использованием метода Collections.min()
        Integer minWeight = Collections.min(products.values());
        for(Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getValue().equals(minWeight)) {
                System.out.println(entry.getKey() + " закончится первым");
            }
        }

//        Вариант №2 - через цикл for
//        int minWeight = 0;
//        for (Integer weight : products.values()) {
//            if (minWeight == 0) {
//                minWeight = weight;
//            } else if (weight < minWeight) {
//                minWeight = weight;
//            }
//        }
//        for (String productName : products.keySet()) {
//            if (products.get(productName) == minWeight) {
//                System.out.println(productName + " закончится первым");
//            }
//        }
    }

    public void muchWeightProducts() {
//      Вариант №1 - с использованием метода Collections.max()
        Integer muchWeight = Collections.max(products.values());
        for(Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getValue().equals(muchWeight)) {
                System.out.println(entry.getKey());
            }
        }
//        Вариант №2 - через цикл for
//        int muchWeight = 0;
//        for (Integer weight : products.values()) {
//            if (muchWeight == 0) {
//                muchWeight = weight;
//            } else if (weight > muchWeight) {
//                muchWeight = weight;
//            }
//        }
//        for (String productName : products.keySet()) {
//            if (products.get(productName) == muchWeight) {
//                System.out.println(productName);
//            }
//        }
    }

    public void printAllProductsFromZToA() {
        //получаем все ключи (название продуктов) через метод keySet() в виде Set<String> и передаем его в конструктор
        Set<String> productNames = new TreeSet<>(Comparator.reverseOrder()); //устанавливаем компаратор, который развернёт порядок
        productNames.addAll(products.keySet());
        //по умолчанию от А до Я
        for (String productName : productNames) {
            System.out.println(productName + " - " + products.get(productName));
        }
    }

    public void printProductsByWeightReverse() {
        Set<Integer> productWeight = new TreeSet<>(Comparator.reverseOrder());
        productWeight.addAll(products.values());
        for (Integer weight : productWeight) {
            for (String productName : products.keySet()) {
                if (Objects.equals(products.get(productName), weight)) {
                    System.out.println(productName + " - " + weight);
                }
            }
        }
    }
}
