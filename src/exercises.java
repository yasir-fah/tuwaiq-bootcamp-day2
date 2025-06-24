import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        1-Develop a program that takes the weight (in kilograms) and height (in meters)
        as input and calculates the BMI, then prints it.
        */
        System.out.println("----------exercise 1 ----------");
        System.out.println("Please enter weight(kg):");
        double weight = input.nextDouble();

        System.out.println("Please enter height(m):");
        double height = input.nextDouble();

        double BMI = (weight) / (height * height);
        System.out.println("BMI = " + BMI);



        /*2-  Write a program that takes the obtained marks and total marks as input and calculates the percentage, then prints it. */
        System.out.println("----------exercise 2 ----------");
        System.out.println("please enter your obtained marks");
        double obtained_marks = input.nextDouble();

        System.out.println("please enter your total marks");
        double total_marks = input.nextDouble();

        double calculated_percentage_marks = (obtained_marks/total_marks) * 100;
        System.out.println(calculated_percentage_marks +"%");



         /*    3-Create a program that takes an amount in one currency and an exchange rate
                as input, then converts and prints the amount in another currency.
         */
        System.out.println("----------exercise 3 ----------");
        System.out.println("please enter the amount you want to exchange:");
        double amount = input.nextDouble();
        input.nextLine();

        System.out.println("please chose you currency (USD-EUR-SAR):");
        String currency = input.nextLine();
        currency = currency.toUpperCase(); //make sure the currency is upperCase due the switch statement underneath.

        switch (currency) {
            case "USD" -> System.out.println("amount in dollar is:" + amount);
            case "EUR" -> {
                amount = amount * 0.87;
                System.out.println("amount in euro is:" + amount);
            }
            case "SAR" -> {
                amount = amount * 3.75;
                System.out.println("amount in riyal is:" + amount);
            }
        }



        /*4- Create a program that takes a string as input, calculates its length, and then
            reverses the string using the StringBuilder class, finally printing both the length and
            reversed string.
        */
        System.out.println("----------exercise 4 ----------");
        System.out.println("Please enter any string: ");
        String str = input.nextLine();

        int str_length = str.length();
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();

        System.out.println("length of string = " + str_length);
        System.out.println("reversed string is:"+reversed);


        /*
          5- Develop a program that takes a sentence as input and extracts a substring from
          it, then prints the extracted substring
        */
        System.out.println("----------exercise 5 ----------");
        System.out.println("please enter your string");
        String str2 = input.nextLine();

        System.out.println("please enter the start index you want to extract with");
        int start_index = input.nextInt();

        System.out.println("please enter the end index you want to extract with");
        int end_index = input.nextInt();

        str2 = str2.substring(start_index,end_index);
        System.out.println("Extracted subString is: " + str2);



        /*6- Write a program that takes a sentence and a keyword as input, then check if
        the keyword is present in the sentence and prints the result.
        */
        System.out.println("----------exercise 6 ----------");
          System.out.println("Please enter your sentence: ");
          String sentence = input.nextLine();

          System.out.println("Please enter your Keyord: ");
          String keyword = input.nextLine();

          if(sentence.toLowerCase().contains(keyword.toLowerCase())){
              System.out.println("Keyword '"+keyword+"' is present in the sentence and starts at index: "+sentence.indexOf(keyword));
          }else {
              System.out.println("Keyword '"+keyword+"' is not present in the sentence");
          }

        /*
        7- Develop a program that takes a sentence and a word to replace as input, then
        replace all occurrences of the word with another word and prints the modified
        sentence.
         */
        System.out.println("----------exercise 7 ----------");
        System.out.println("Please enter your sentence: ");
        String original_sentence = input.nextLine();

        System.out.println("please enter the word you want to replace with: ");
        String word = input.nextLine();

        System.out.println("Please enter the new word:");
        String replacementWord = input.nextLine();

        String modifiedSentence = original_sentence.replace(word, replacementWord);

        System.out.println("modified sentence: " + modifiedSentence);



          /*8-Write a program that takes two strings as input and check if they are equal,
          ignoring the case, then prints whether they are equal or not.
          */
        System.out.println("----------exercise 7 ----------");
        System.out.println("word 1:");
        String word1 = input.nextLine();
        System.out.println("word 2:");
        String word2 = input.nextLine();

        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("word 1 and 2 is the same " + word1 + "," + word2);
        }
        else {
            System.out.println("word 1 and 2 is not the same " + word1 + "," + word2);
        }

    }
}
