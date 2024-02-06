import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");
        System.out.println("1. Added Coll to end of list: " + scottishIslands);
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");
        System.out.println("2. Added Tiree to start of list: " + scottishIslands);
//        3. Add "Islay" after "Jura" and before "Mull"
        int indexJura = scottishIslands.indexOf("Jura");
        indexJura += 1;
        scottishIslands.add(indexJura, "Islay");
        System.out.println("3. Added Islay to between Jura and Mull: " + scottishIslands);
//        4. Print out the index position of "Skye"
        System.out.println("4. Index of Skye: " + scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
        System.out.println("5. Removed Tresco by name: " + scottishIslands);
//        6. Remove "Arran" from the list by index
        int indexArran = scottishIslands.indexOf("Arran");
        scottishIslands.remove(indexArran);
        System.out.println("6. Removed Arran by index: " + scottishIslands);
//        7. Print the number of islands in your arraylist
        System.out.println("7. Array Size: " + scottishIslands.size());
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
        System.out.println("8. Sorted list: " + scottishIslands);

//        9. Print out all the islands using a for loop
        System.out.println("--------9. Printing Array List Using For Loop--------");
        for (String island: scottishIslands) {
            System.out.println(island);
        }

        System.out.println("-----------------------------");
//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println(" ");
        System.out.println("-----------Task 2-----------");

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        System.out.println("-----1. Printing Even Numbers---------");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        System.out.println("-----------------------------");

//        2. Print the difference between the largest and smallest value
        int max = numbers.get(0);
        int min = numbers.get(0);
        for (int number: numbers) {
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        int diff = max - min;

        System.out.println("Difference between largest and smallest number: " + diff);
//        3. Print True if the list contains a 1 next to a 1 somewhere.
        System.out.println("True will be printed if list contains a 1 next to a 1 somewhere: ");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 1) {
                if (numbers.get(i+1) == 1) {
                    System.out.println("True");
                }
            }
        }
//        4. Print the sum of the numbers,
        int sum = 0;
        for (int number : numbers) {
            sum  += number;
        }
        System.out.println("Sum of numbers in list is: " + sum);
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.
        sum = 0;
        for (int number : numbers) {
            if (number == 13) {
                break;
            } else {
                sum  += number;
            }
        }
        System.out.println("Sum of numbers in list is: " + sum);


    }

}
