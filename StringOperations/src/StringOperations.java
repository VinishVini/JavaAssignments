import java.util.Locale;

public class StringOperations {

    public static void main(String []args)
    {
        StringOperations op = new StringOperations();
        String text = "Hi welcome";
        op.stringOperation(text);

    }

    public void stringOperation(String text)
    {
        int length = text.length();
        int halfLength = text.length()/2;

        String lowerCase = text.toLowerCase();
        String upperCase = text.toUpperCase();
        StringBuffer bf = new StringBuffer(text);
        String reverse = bf.reverse().toString();

        String firstWord = text.substring(0,halfLength);
        String lastWord = text.substring(halfLength,length);

        System.out.println("Length of the String is  :: "+length);
        System.out.println("LowerCase of the String is  :: "+lowerCase);
        System.out.println("UpperCase of the String is  :: "+upperCase);
        System.out.println("Reverse of the String is  :: "+reverse);
        System.out.println("First half of the String is  :: "+firstWord);
        System.out.println("Second half of the String is  :: "+lastWord);


    }



}
