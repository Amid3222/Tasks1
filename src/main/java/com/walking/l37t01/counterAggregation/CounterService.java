package com.walking.l37t01.counterAggregation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CounterService {
    //-> я ток выполняю условие задачи, а не редачу весь старый код - есть ли смысл?

    private List<Counter> counters = new ArrayList<>();

    //методы(добавить к массиву)
    public void addCounterToList(Counter... counters) {
        this.counters.addAll(Arrays.asList(counters));
    }

    public void addCounterToList(Counter counter) {
        counters.add(counter);
    }

    public void removeFromList(String name) {
        counters.removeIf(c -> c.getName().equals(name));
    }

    //показать массив счетчиков
    public String getCountersList() {
        StringBuilder s = new StringBuilder();
        for (Counter c : counters) {
            s.append(c.getName()).append("; ");
        }
        return s.toString();
    }

    //получить доступ к счетчику по имени
    public Counter getAccessByName(String name) {
        for (Counter c : counters) {
            if (c.getName().equals(name)) return c;

        }
        return null;
    }

    public int showValue(Counter c) {
        return c.getValue();
    }

    //изменить значение счетчика
    public void setterViper(Counter c, int x) {
        c.setValue(x);
    }

    //++1 или ++ число
    public void incremerOn(Counter c, int y) {
        int x = c.getValue();
        if (y == 0) c.setValue(++x);
        else c.setValue(x + y);

    }


}
