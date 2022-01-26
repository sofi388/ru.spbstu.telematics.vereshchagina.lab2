import org.junit.*;
import java.util.ArrayList;
import java.util.Iterator;



public class MyArrayListTest {
    ArrayList<String> expected = new ArrayList<>();
    MyArrayList<String> actual = new MyArrayList<>();
    @Test
   public void add() throws Exception
    {
        actual.add("aaa");
        expected.add("aaa");
        Assert.assertEquals(expected.get(0), actual.get(0));
    }

    @Test
    public void get() throws Exception
    {
        actual.add("aaa");
        expected.add("aaa");
        String str_expexted = expected.get(0);
        String str_actual = actual.get(0);
        Assert.assertEquals(str_expexted, str_actual);
    }

    @Test
   public void size() throws Exception
    {
        actual.add("aaa");
        actual.add("bbb");
        expected.add("aaa");
        expected.add("bbb");
        int size_expexted = expected.size();
        int size_actual = actual.size();
        Assert.assertEquals(size_expexted, size_actual);
    }

    @Test
   public void removeByIndex() throws Exception
    {
       actual.add("aaa");
       actual.add("bbb");
       expected.add("aaa");
       expected.add("bbb");
        actual.removeByIndex(1);
        expected.remove(1);
        int size_expexted = expected.size();
        int size_actual = actual.size();
        Assert.assertEquals(size_expexted, size_actual);
    }

    @Test
    public void TestIterator() throws Exception
    {
        Iterator<String> expectedIterator = expected.iterator();
        Iterator<String> actualIterator = actual.iterator();

        Assert.assertEquals( actualIterator.hasNext(), expectedIterator.hasNext());

        while (actualIterator.hasNext() && expectedIterator.hasNext())
            Assert.assertEquals(actualIterator.next(), expectedIterator.next());
    }

    @Test
    public void out()
    {

    }
}
