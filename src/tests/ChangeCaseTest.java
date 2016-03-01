package tests;

/**
 * Created by user on 01.03.2016.
 */
public class ChangeCaseTest
{
    public static void main(String[] args)
    {
        ChangeCaseTest test = new ChangeCaseTest();
        String text = "This is some text here";

        long startTime = System.nanoTime();
        String textV1 = test.getUpperCaseWords(text);
        long endTime =  System.nanoTime() - startTime;

        startTime = System.nanoTime();
        String textV2 = test.getUpperCaseWordsV2(text);
        long endTimeV2 =  System.nanoTime() - startTime;

        System.out.println(textV1 + " - It took: " + endTime + " nano");
        System.out.println(textV2 + " - It took: " + endTimeV2 + " nano");
    }

    protected String getUpperCaseWords(String text)
    {
        StringBuilder builder = new StringBuilder();
        String[] words = text.split(" ");
        for (String word : words) {
            char[] characters = word.toCharArray();
            characters[0] = Character.toUpperCase(characters[0]);
            builder.append(new String(characters)).append(" ");
        }

        return builder.toString().trim();
    }

    protected String getUpperCaseWordsV2(String text)
    {
        StringBuilder builder = new StringBuilder();
        String[] words = text.split(" ");
        for (String word : words) {
            word = Character.toString(word.charAt(0)).toUpperCase() + word.substring(1);
            builder.append(word).append(" ");
        }

        return builder.toString().trim();
    }
}
