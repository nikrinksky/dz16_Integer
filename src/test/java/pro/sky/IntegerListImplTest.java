package pro.sky;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListImplTest {
    IntegerListImpl integerList;

    @BeforeEach
    public void setUp() {
        integerList = new IntegerListImpl(10);;
    }

    @Test
    void add() {
//        Integer expected = integerList.add(1);
//
//        Integer actual = 1;

        integerList.add(1);
        integerList.add(2);

        IntegerListImpl actual = new IntegerListImpl(10);
        actual.add(1);
        actual.add(2);

        assertEquals(integerList, actual);
        System.out.println("integerList" + integerList);
        System.out.println("actual" + actual);

    }


    @Test
    void testAdd() {
        Integer expected = integerList.add(0, 1);
        Integer actual = 1;
        assertEquals(expected, actual);
    }

    @Test
    void set() {
        Integer expected = integerList.set(0, 1);
        Integer actual = 1;

        assertEquals(expected, actual);
    }

    @Test
    void remove() {
        integerList.add(1);
        Integer expected = integerList.remove(0);

        Integer actual = 1;
        assertEquals(expected, actual);
    }

    @Test
    void testRemove() {
        integerList.add(1);
        Integer expected = integerList.remove(0);

        Integer actual = 1;
        assertEquals(expected, actual);
    }

    @Test
    void contains() {
        integerList.add(1);
        boolean result = integerList.contains(1);
        assertTrue(result);
    }

    @Test
    void indexOf() {
        integerList.add(1);
        boolean result = integerList.indexOf(1) >= 0;
        assertTrue(result);
    }

    @Test
    void lastIndexOf() {
        integerList.add(1);
        boolean result = integerList.lastIndexOf(1) >= 0;
        assertTrue(result);
    }

    @Test
    void get() {
        integerList.add(1);
        Integer result = integerList.get(0);
        assertNotNull(result);
    }

    @Test
    void testEquals() {
        integerList.add(1);
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.add(1);
        boolean result = integerList.equals(integerList);

        assertTrue(result);
    }

    @Test
    void size() {
        int expected = integerList.size();
        int actual = 0;

        assertEquals(expected, actual);
    }

    @Test
    void isEmpty() {
        boolean result = integerList.isEmpty();

        assertTrue(result);
    }

    @Test
    void clear() {
        integerList.add(1);
        integerList.clear();
        boolean result = integerList.isEmpty();

        assertTrue(result);
    }

    @Test
    void toArray() {
        Integer[] result = integerList.toArray();

        assertNotNull(result);
    }
}