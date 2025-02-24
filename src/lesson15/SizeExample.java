package lesson15;

import java.util.ArrayList;
import java.util.List;

public class SizeExample {
    public static void main(String[] args) {
        List<String> symbols = new ArrayList<>();
        symbols.add("A");
        symbols.add("B");
        symbols.add("C");
        symbols.add("D");
        System.out.println(symbols.size());
        symbols.set(1, null);
        System.out.println(symbols.size());
    }
}
