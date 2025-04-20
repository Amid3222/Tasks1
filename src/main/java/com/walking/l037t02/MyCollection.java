package com.walking.l037t02;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection<T> implements Collection<T> {
    private Class<T> type;
    private Object[] storage;
    @Override
    public int size() {
        return storage.length;
    }

    public MyCollection() {
        this.storage = new Object[10];
    }

    @Override
    public boolean isEmpty() {
        for (Object t : storage) if (t != null) return false;
        return true;
    }

    @Override
    public boolean contains(Object o) {
        if (type.isInstance(o)) {
            T tb = type.cast(o);
            for (Object t : storage) if (t.equals(tb)) return true;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return storage;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return a = (T1[]) Arrays.copyOf(storage, storage.length + 1);
    }

    @Override
    public boolean add(T t) {
        storage[storage.length - 1] = t;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
