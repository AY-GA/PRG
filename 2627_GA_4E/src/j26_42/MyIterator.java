package j26_42;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class MyIterator implements Iterator<Integer> {
    private int currentIndex;
    private final List<Integer> list;

    public MyIterator(List<Integer> list) {
        this.list = list;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public Integer next() {
        if (!hasNext())
            throw new NoSuchElementException();
        return list.get(currentIndex++);
    }
}
