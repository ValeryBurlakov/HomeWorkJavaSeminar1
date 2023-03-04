import java.util.Scanner;
public class homeWork1 {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
    
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false
    
        printString("abcd", 5); // abcdabcdabcdabcdabcd
        
        // високосность года
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите год: ");
        // intr flag = iScanner.hasNextInt();
        int year = iScanner.nextInt();
        isLeapYear(year);

        // вернуть массив заполненный initialValue
        createArray(5, 8);

        // в массиве 1 поменять на 0 и 0 на 1 (инверсия)
        arrayInversion();

        // числа МЕНЬШЕ 6 умножаем на 2
        arrayReplacement();

        // заполнение главной и побочной диагоналей
        Scanner sizeScanner = new Scanner(System.in);
        System.out.println("Введите размер квадратного массива: ");
        int sizeN = sizeScanner.nextInt();
        fillingInTheDiagonal(sizeN);
        sizeScanner.close();
        iScanner.close();
    }
    
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int c = a + b;
        if (c >= 10 && c <= 20)
        {
        return true;
        }
        // System.out.println(c >= 10 && c <= 20);
        else
        {
            return false;
        }
    }
    
    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x >= 0)
        {
            return true;
        }
        return false;
    }
    
    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
        System.out.println();
    }
    
    private static void isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println("Год високосный!");
                }
                else 
                {
                    System.out.println("Год не високосный(");
                }
            }
            else
            {
                System.out.println("Год високосный!");
            }
        }
        else
        {   
            System.out.println("Год не високосный(");
        }
    }
    
    public static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        
        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initalValue;
        }

        for (int item : array) { // foreach и таб
        System.out.printf("%d ", item);
        }
        System.out.println();
        // System.out.println(array);
        return null;
    }
    
    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static int[] arrayInversion()
    {   
        int[] arrayOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int nulll = 0;
        int onee = 1;
        System.out.println("Исходный массив:");
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i] + " ");
            if (arrayOne[i] == onee)
            {
                arrayOne[i] = nulll;
            }
            else
            { 
                if (arrayOne[i] == nulll)
                {
                arrayOne[i] = onee;
                }
            }
        }
        System.out.println();
        System.out.println("Инверсия массива:");
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i] + " ");
        }
        return arrayOne;
    }


    //  * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] 
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    
    public static int[] arrayReplacement()
    {   System.out.println();
        int[] arrayTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, 6};
        int numberSix = 6;
        int numberTwo = 2;
        System.out.println("Исходный массив:");
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i] + " ");
            if (arrayTwo[i] < numberSix)
            {
                arrayTwo[i] *= numberTwo;
            }
            else
            { 
                if (arrayTwo[i] >= numberSix)
                {
                continue;
                }
            }
        }
        System.out.println();
        System.out.println("Результат :");
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i] + " ");
        }
        System.out.println();
        return arrayTwo;
    }
    
    //  * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    //  * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
    //  * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    //  * * Также заполнить элементы побочной диагонали
    
    public static void fillingInTheDiagonal(int sizeN) {
        int[][] ourArray = new int[sizeN][sizeN];
        int numberOne = 1;
        
        for (int i = 0; i < ourArray.length; i++) {
            for (int j = 0; j < ourArray.length; j++) {
                if (i == j | i + j == sizeN - 1)
                {
                    ourArray[i][j] = numberOne;
                }
                else
                {
                    continue;
                }
            }
        }
        System.out.println("Наши диагонали:");
        for (int[] line : ourArray) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
     }
     
    }
    