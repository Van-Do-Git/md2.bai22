package Facade.implement;

public class Main {

    public static void main(String[] args) {
        RandomListFacade randomListFacade = new RandomListFacade(new RandomList(), new ListPrinter(), new ListFilter());
        randomListFacade.printRandomEvenList(10,99,50);
    }
}
