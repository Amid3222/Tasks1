package com.walking.l028t03;

import com.walking.l028t02.TestObj;

/* Реализовать класс для работы с массивом.
Разработать метод, производящий поиск значения в массиве.
 Если значение не найдено — выбрасывать исключение.
 Если найдено — возвращать его.*/
public class Main {
    public static void main(String[] args) throws Exception {
        String[] array = {"baba", "asjfkalsk", "490"};
        FindNumAtList<String> findNumAtList = new FindNumAtList<>(array);
        System.out.println(findNumAtList.findAtList("490"));

        TestObj testObj = new TestObj();
        TestObj[] testObjs = {testObj, new TestObj(), new TestObj()};
        FindNumAtList<TestObj> findNumAtList2 = new FindNumAtList<>(testObjs);
        System.out.println(findNumAtList2.findAtList(testObj));
    }
}
