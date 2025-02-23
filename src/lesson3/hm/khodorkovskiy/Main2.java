package lesson3.hm.khodorkovskiy;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Задача 2. Вывести предложение “Я Java разработчик\" наоборот (задом наперед)\" в одну строку.");
        String sentence = "Я Java разработчик";
        char[] reverseSentence = sentence.toCharArray();
        for (int index = reverseSentence.length - 1; index >= 0; index--) {
            System.out.print(reverseSentence[index] + " ");
        }
    }
}
