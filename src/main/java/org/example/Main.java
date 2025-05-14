package org.example; //DO NOT DELETE
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input_int = new Scanner(System.in);
    Scanner input_line = new Scanner(System.in);
    System.out.println("Choose program:\n1 - Further substring Fun\n2 - Run of Integers\n3 - Sum of a Range of Sequential Integers\n4 - Repeatedly Echo a Word\n5 - Words Separated by Dots\n6 - Adding up Integers\n7 - Shipping Cost Calculator");
    int menu = input_int.nextInt();
    System.out.println("");
    if (menu==1) { /// Further substring Fun
        System.out.println("Enter a string:");
        String str = input_line.nextLine();
        System.out.print("Enter beginning index: ");
        int start = input_int.nextInt();
        System.out.print("Enter ending index: ");
        int end = input_int.nextInt();
        input_int.close();
        input_line.close();
        System.out.println("\nOriginal String:\n" + str + "\n\nSubstring:\n" + str.substring(start,end));
    }
    if (menu==2) { /// Run of Integers
        System.out.println("Enter start:");
        int start = input_int.nextInt();
        System.out.println("Enter end:");
        int end = input_int.nextInt();
        input_int.close();
        System.out.println("");
        for (int i=0;i<=(end-start);i++) {
            System.out.println(start+i);
        }
    }
    if (menu==3) { /// Sum of a range of Sequential Integers
        System.out.println("Enter low:");
        int start = input_int.nextInt();
        System.out.println("Enter high:");
        int end = input_int.nextInt();
        input_int.close();
        int sum = 0;
        for (int i=0;i<=(end-start);i++) {
            sum+=start+i;
        }
        System.out.println("Sum = " + sum);
    }
    if (menu==4) { /// Repeatedly Echo a Word
        System.out.println("Enter a word:");
        String word = input_line.nextLine();
        input_line.close();
        System.out.println("");
        for (int i=0;i<word.length();i++) {
            System.out.println(word);
        }
    }
    if (menu==5) { /// Words Separated by Dots
        System.out.println("Enter first word:");
        String word1 = input_line.nextLine();
        System.out.println("Enter second word:");
        String word2 = input_line.nextLine();
        input_line.close();
        System.out.println("\n" + word1 + dots + word2);
    }
    if (menu==6) { /// Adding up Integers
        
    }
    if (menu==7) { /// Shipping Cost Calculator
        
    }
  }
}