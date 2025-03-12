package lesson18.hm.khaybulina;

import java.util.*;
import java.util.stream.Collectors;

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
     * Взять продукт из холодильника
     *
     * @param product название продукта
     * @param weight  вес продукта
     */
    public void takeProduct(String product, int weight) {
        if (products.containsKey(product)) {
            int currentWeight = products.get(product);
            if (weight <= currentWeight) {
                products.put(product, currentWeight - weight);
                if (products.get(product) <= 0) {
                    products.remove(product);
                }
            } else {
                System.out.println("В холодильнике нет требуемого количества продукта.");
            }
        } else {
            System.out.println("Такого продукта больше нет в холодильнике.");
        }
    }

    /**
     * Вывести вес всех продуктов в холодильнике(сумма)
     *
     * @return сумма веса всех продуктов
     */
    public int getAllWeight() {
        int allWeight = 0;
        for (int weight : products.values()) {
            allWeight += weight;
        }
        return allWeight;
    }

    /**
     * Вывести вес конкретного продукта в холодильнике
     *
     * @param product название продукта
     * @return сумма веса продукта
     */
    public int getProductWeight(String product) {
        if (products.containsKey(product)) {
            return products.get(product);
        } else {
            System.out.println("Такого продукта в холодильнике нет");
            return -1;
        }
    }

    /**
     * Вывести наименование продукта, который закончится первым
     *
     * @return название продукта или сообщение, если продуктов нет
     */
    public String getFirstToFinishProducts() {
        if (products.isEmpty()) {
            return "В холодильнике ничего нет";
        }

//        int minWeight = Integer.MAX_VALUE;
//        for (Integer value : products.values()) {
//            if (value < minWeight) {
//                minWeight = value;
//            }
//        }
//
//        System.out.println("Продукты, которые кончатся первыми: ");
//        for (Map.Entry<String, Integer> entry : products.entrySet()) {
//            if (entry.getValue() == minWeight) {
//                System.out.println(entry.getKey());
//            }
//        }

        int minWeight = products.values().stream().min(Integer::compare).orElse(0);
        return products.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == minWeight)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", "));
    }

    /**
     * Вывести наименование продукта, которого больше всего
     *
     * @return название продукта или сообщение, если продуктов нет
     */
    public String getMostProduct() {
        if (products.isEmpty()) {
            return "Продуктов нет в холодильнике.";
        }
        int maxWeight = products.values().stream().max(Integer::compare).orElse(0);
        return products.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == maxWeight)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", "));
    }

    /**
     * Вывести все продукты (название + вес) по алфавиту от Я до А
     */
    public void printAllProductsFromZToA() {
        //По умолчанию отсортированы от а до я, поэтому устанавливаем компаратор reverseOrder(), который развернет порядок наборот
        Set<String> productNames = new TreeSet<>(Comparator.reverseOrder());
        productNames.addAll(products.keySet());

        for (String productName : productNames) {
            System.out.println(productName + " - " + products.get(productName));
        }
    }

    /**
     * Вывести все продукты (название + вес) по весу от большего к меньшему
     */
    public void printAllProductsByWeight() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(products.entrySet());

        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

//        Collections.sort(list, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));
//
//        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
//
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o2.getValue().compareTo(o1.getValue());
//            }
//        });

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}