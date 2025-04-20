package com.walking.l37t01.counterAggregation;

public class Main {

    private static void viewAllbase(CounterService c) {
        // <Название счетчика>: <Значение счетчика>
        String str = c.getCountersList();
        String[] arr = str.split("; ");
        for (String b : arr) {
            System.out.printf("%s: %d\n", b, c.showValue(c.getAccessByName(b)));
        }
    }

    public static void main(String[] args) {
        CounterService service = new CounterService();

        Counter gazCounter = new Counter("Газ_Счетчик", 55 , "м. куб");
        Counter waterCounter = new Counter("Вода_Счетчик", 856, "литр.");
        Counter electroCounter = new Counter("Эл_Счетчик",5756 , "ватт");

        service.addCounterToList(gazCounter, waterCounter, electroCounter);
        service.getCountersList();
        System.out.println(gazCounter.getValue());
        System.out.println(service.getCountersList());
        service.removeFromList("Газ_Счетчик");
        System.out.println(service.getCountersList());

    }
}