

public class StringChecker1 implements StringChecker
{
    String check;
    StringChecker1(String input)
    {
        check = input;
    }

    public boolean checkString(String s)
    {
        if (s.contains(check)) return true;
        return false;
    }
}