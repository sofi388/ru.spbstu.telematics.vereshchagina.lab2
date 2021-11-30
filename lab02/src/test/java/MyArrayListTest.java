import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class MyArrayListTest {
    ArrayList<String> expected = new ArrayList<>();
    MyArrayList<String> actual = new MyArrayList<>();
    @Test
   public void add() throws Exception
    {
        actual.add("aaa");
        expected.add("aaa");
        assertEquals(expected.get(0), actual.get(0));
    }

    @Test
    void get() throws Exception
    {
        actual.add("aaa");
        expected.add("aaa");
        String str_expexted = expected.get(0);
        String str_actual = actual.get(0);
        assertEquals(str_expexted, str_actual);
    }

    @Test
    void size() throws Exception
    {
        actual.add("aaa");
        actual.add("bbb");
        expected.add("aaa");
        expected.add("bbb");
        int size_expexted = expected.size();
        int size_actual = actual.size();
        assertEquals(size_expexted, size_actual);
    }

    @Test
    void removeByIndex() throws Exception
    {
        
    }

    @Test
    void out()
    {

    }
}
