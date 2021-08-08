package Facade.implement;

import java.util.List;

public class RandomListFacade {
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade(RandomList randomList, ListPrinter listPrinter, ListFilter listFilter) {
        this.listPrinter = listPrinter;
        this.listFilter = listFilter;
        this.randomList = randomList;
    }

    public void printRandomEvenList(int size, int max, int min) {
        List<Integer> list = randomList.generateList(size, min, max);
        listPrinter.printList(list);
        list = listFilter.filterOdd(list);
        listPrinter.printList(list);
    }
}
