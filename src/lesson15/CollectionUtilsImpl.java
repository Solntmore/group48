package lesson15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        //Вариант 1 - передаем в конструктор 1 коллекцию, и отдельно добавляем другую
        Collection<Integer> result = new ArrayList<>(a);
        result.addAll(b);

        //Вариант 2 - создаем пустую коллекцию, и отдельно добавляем остальные две
//        Collection<Integer> result = new ArrayList<>();
//        result.addAll(a);
//        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return List.of();
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return Set.of();
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return Set.of();
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return List.of();
    }
}
