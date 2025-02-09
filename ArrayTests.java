import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input2 = { 1,3,2 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 2,3,1}, input2);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2()
  {
    int[] input2 = {1,2,3};
    assertArrayEquals(new int[] {3,2,1}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverage()
  {
    double [] input = {};
    double expected = 0.0;
    assertEquals(expected, ArrayExamples.averageWithoutLowest(input), 0.01);
  }

  @Test
  public void testAverage2()
  {
    double [] input = {1,2,3};
    double expected = 2.5;
    assertEquals(expected, ArrayExamples.averageWithoutLowest(input), 0.01);
  }

  @Test
  public void testAverage3()
  {
    double [] input = {1,1,2,3};
    double expected = 2.5;
    assertEquals(expected, ArrayExamples.averageWithoutLowest(input), 0.01);
  }
}
