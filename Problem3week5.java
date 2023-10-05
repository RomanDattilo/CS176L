import java.util.Scanner;

public class Problem3week5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String changeString = replaceNumberWithWord(input);
        System.out.println("Changed string: " + changeString);

        scanner.close();
    }

    public static String replaceNumberWithWord(String input) {
        if (input.length() > 0 && Character.isDigit(input.charAt(0))) {
            char firstChar = input.charAt(0);
            String equalWord = getWord(firstChar);
            return equalWord + input.substring(1);
        } else {
            return input;
        }
    }

    public static String getWord(char digit) {
        switch (digit) {
       case '0':
                return "zero";
         case '1':
               return "one";
         case '2':
               return "two";
        case '3':
             return "three";
        case '4':
               return "four";
          case '5':
                  return "five";
           case '6':
                return "six";
          case '7':
                return "seven";
           case '8':
      return "eight";
               case '9':
        return "nine";
            default:
         return "";
            
         
      }
    }
}