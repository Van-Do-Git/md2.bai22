package Adapter.implement;


import java.util.List;
import java.util.Set;

public class CollectionSetAdapter implements CollectionOperations {
    private FindMaxInList findMaxInList;

    @Override
    public int findMax(Set<Integer> numbers) {
        List<Integer> list = (List<Integer>) numbers;
        return findMaxInList.FindMax(list);
    }
}
