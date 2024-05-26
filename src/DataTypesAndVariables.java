import java.util.Scanner;

public class DataTypesAndVariables {
    public static void main(String[] args) {
        //integerOperations();
        //sumDigits();
        //elevator();
        //sumOfChars();
        //printAsciiTable();
        //triplesLatinLetters();
        //waterOverflow();
        beerKegs();



    }

    public static void integerOperations() {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        System.out.println((num1 + num2) / num3 * num4);
    }

    public static void sumDigits() {
        Scanner scanner = new Scanner(System.in);

        short inputNum = scanner.nextShort();
        byte sum = 0;
        while (inputNum > 0) {
            sum += inputNum % 10;
            inputNum /= 10;
        }
        System.out.println(sum);
    }

    public static void elevator() {
        Scanner scanner = new Scanner(System.in);

        byte peopleWaiting = scanner.nextByte();
        byte capacity = scanner.nextByte();

        int courses = peopleWaiting / capacity;
        if (peopleWaiting % capacity != 0) {
            courses++;
        }
        System.out.println(courses);
    }

    public static void sumOfChars() {
        Scanner scanner = new Scanner(System.in);

        byte lineCount = scanner.nextByte();
        short sum = 0;
        for (byte i = 0; i < lineCount; ++i) {
            char symbol = scanner.next().charAt(0);
            sum += (short) symbol;
        }

        System.out.printf("The sum equals: %d", sum);

    }

    public static void printAsciiTable() {
        Scanner scanner = new Scanner(System.in);

        byte start = scanner.nextByte();
        byte end = scanner.nextByte();

        for (byte i = start; i <= end; ++i) {
            System.out.printf(" %c", (char) i);
        }
    }

    public static void triplesLatinLetters() {
        Scanner scanner = new Scanner(System.in);

        byte size = scanner.nextByte();
        char firstLetter = 'a';
        char secondLetter = 'b';
        char thirdLetter = 'c';
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                for (int k = 0; k < size; ++k) {
                    firstLetter = (char) ('a' + i);
                    secondLetter = (char) ('a' + j);
                    thirdLetter = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", firstLetter, secondLetter, thirdLetter);
                }
            }
        }
    }

    public static void waterOverflow() {
        Scanner scanner = new Scanner(System.in);

        short capacity = 255;
        byte timesPoured = scanner.nextByte();

        short curLiters = 0;
        for (int i = 0; i < timesPoured; ++i) {
            short curPoured = scanner.nextShort();
            curLiters += curPoured;
            if(curLiters > capacity) {
                System.out.println("Insufficient capacity!");
                curLiters -= curPoured;
            }
        }
        System.out.println(curLiters);
    }


    public static void beerKegs() {
        Scanner scanner = new Scanner(System.in);

        byte inputs = scanner.nextByte();
        scanner.nextLine();
        String biggestKeg = "";
        float maxVolume = 0;
        for (int i = 0; i < inputs; ++i) {
            String curKeg = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            float curVolume = (float) (Math.PI * radius * radius * height);
            if(curVolume > maxVolume) {
                maxVolume = curVolume;
                biggestKeg = curKeg;
            }
            curKeg = "";
        }
        System.out.println(biggestKeg);
    }

}

