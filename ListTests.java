import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests{
    //Test filter()
    @Test
    public void testFilter()
    {
        List<String> input = new ArrayList<String>();
        input.add("apple");
        input.add("pineapple");
        input.add("orange");
        StringChecker check = new StringChecker1("app");
        List<String> expected = new ArrayList<String>();
        expected.add("apple");
        expected.add("pineapple");
        assertEquals(expected, ListExamples.filter(input, check));
    }

    @Test
    public void testFilter2()
    {
        List<String> input = new ArrayList<String>();
        input.add("apple");
        input.add("orange");
        StringChecker check = new StringChecker1("app");
        List<String> expected = new ArrayList<String>();
        expected.add("apple");
        assertEquals(expected, ListExamples.filter(input, check));
    }


    @Test
    public void testMerge()
    {
        List<String> input = new ArrayList<String>();
        input.add("a");
        input.add("d");

        List<String> input2 = new ArrayList<String>();
        input2.add("b");
        input2.add("c");
        input2.add("e");

        List<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b");
        expected.add("c");
        expected.add("d");
        expected.add("e");
        assertEquals(expected, ListExamples.merge(input, input2));
    }


}