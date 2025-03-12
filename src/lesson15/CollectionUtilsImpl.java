package lesson15;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

//      Вариант 1 - передаем в конструктор 1 коллекцию и отдельно добавляем другую
        Collection<Integer> result = new ArrayList<>(a);
        result.addAll(b);

/*      Вариант 2 - создаем пустую коллекцию и отдельно добавляем 2 коллекции
      Collection<Integer> result = new ArrayList<>();
      result.addAll(a);
      result.addAll(b);
*/
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

//      вариант №1: через метод retainAll()
        Collection<Integer> result = new LinkedList<>(a);
        result.retainAll(b);

        return result;

//     вариант №2: через цикл for-each

//        Collection<Integer> result = new ArrayList<>();
//        for (Integer number : a) {
//            if (b.contains(number)) {
//                result.add(number);
//            }
//        }
//        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new LinkedHashSet<>();
        result.addAll(a);
        result.addAll(b);

        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new HashSet<>(a);
        result.retainAll(b);

        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

//      вариант №1: через метод removeAll()
        Collection<Integer> resultA = new ArrayList<>(a);
        Collection<Integer> resultB = new LinkedList<>(b);

        resultA.removeAll(b);
        resultB.removeAll(a);

        resultA.addAll(resultB);

        return resultA;

//      Вариант №2: через цикл for-each
//
//        Collection<Integer> result = new ArrayList<>();

//        for (Integer number : a) {
//            if (!b.contains(number)) {
//                result.add(number);
//            }
//        }
//
//        for (Integer number : b) {
//            if (!a.contains(number)) {
//                result.add(number);
//            }
//        }
//
//        return result;

    }
}


