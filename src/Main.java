import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        imia(); // начнем с пункта номер 7, пункт 1 и 2 пропустим.

        System.out.println("Vvedite nomer operacii (zadania)");
        System.out.println("1. Formula a*(b+(c/d))");
        System.out.println("2. Proverka diapazona");
        System.out.println("3. Polozhitelnoe/Otricatelnoe");
        System.out.println("4. True False pri otricatelnom");
        System.out.println("5. Visokosnii god");
        System.out.println("");

        // выбираем пункт из домашнего задания

        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println();

        // включаем сканнер для выбора пункта задания

        if (operation == 1) { // ввод чисел для формулы
            System.out.println("\n"+"Dlia vichislenia virazhenia vvedite 4 chisla: A,B,C,D.");
            System.out.println("vvedite A:");
            float a = scanner.nextInt();
            System.out.println("vvedite B:");
            float b = scanner.nextInt();
            System.out.println("vvedite C:");
            float c = scanner.nextInt();
            System.out.println("vvedite D:");
            float d = scanner.nextInt();
            System.out.println(formula(a,b,c,d)+"\n");

        } else if (operation == 2) { // ввод чисел для проверки диапазона
            System.out.println("Dlia proverki popadania v diapazon 10> chislo <20 vvedite 2 chisla");
            System.out.println("vvedite A:");
            float a = scanner.nextInt();
            System.out.println("vvedite B:");
            float b = scanner.nextInt();
            if (proverka(a,b)) {
                System.out.println("Summa chisel lezhit v predele ot 10 do 20");
                System.out.println(proverka(a,b)+"\n");
            } else {
                System.out.println("Summa chisel NE lezhit v predele ot 10 do 20");
                System.out.println(proverka(a, b) + "\n");
            }

        } else if (operation == 3) { // ввод числа для проверки на положительность
            System.out.println("Dlia proverki na polozhitelnost'");
            System.out.println("vvedite celoe chislo A:");
            int a = scanner.nextInt();

            if(plus(a)){
                System.out.println("Chislo " +a+" polozhitelnoe");
            } else
                System.out.println("Chsilo "+a+" otricatelnoe");

        } else if (operation == 4) { // ввод числа для проверки на отрицательность
            System.out.println("Vvedie celoe chislo, esli ono <=0, na vihode poluchim True");
            System.out.println("vvedite celoe chislo A:");
            int a = scanner.nextInt();
            System.out.println(minus(a));

        } else if (operation == 5) { // ввод номера года для проверки на високосность
            System.out.println("Yavliaetsia li fod visokosnim?'");
            System.out.println("vvedite god:");
            int a = scanner.nextInt();
            if (god(a)) {
                System.out.println("God " + a +" yavliaetsia visokosnim");
            } else
                System.out.println("God " + a + " ne visokosnii");

        } else System.out.println("Vi vveli nomer nesushetvuushei operacii");
    }

    // Далее методы
    // По порядку выбора номера операции

    public static void imia() { // Метод для печати имени
        System.out.println("Pozhaluista, predstavtes'" + "\n" + ("(dannii vopros iavliaetsia metodom vizova stroki, punkt domashnego zadania nomer 7)"));
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println("Zdravstvui, " + s+"\n");
    }

    public static float formula(float a, float b, float c, float d) { // Метод Пункт номер 1
        return a*(b+(c/d)); // возвращаем результат
    }

    public static boolean proverka(float a, float b) { // Метод Пункт номер 2
        boolean c=((a+b)>10 && (a+b)<20);// сравнение диапазона
        return c;
    }

    public static boolean plus (int a){  // Метод Пункт номер 3
        boolean x=(a>=0); // сравнение с нулём
        return x;
    }

    static boolean minus (int a){ // Метод Пункт номер 4
        return (a<=0); // сравнение с нулём
    }

    public static boolean god(int a) { // Метод Пункт номер 5
        boolean x=(((a%4==0)&&(a%100!=0))||(a%400==0));
        return x;
    }

}