public class Main {
    public static void main(String[] args) {
//Задача №1
        int a = 256;
        byte b = 13;
        short c = 32760;
        long d = 123456789L;
        float i = 3.51f;
        double f = 5.45;
        System.out.println(String.format("Значение переменной a с типом int равно %d", a));
        System.out.println(String.format("Значение переменной b с типом byte равно %d", b));
        System.out.println(String.format("Значение переменной c с типом short равно %d", c));
        System.out.println(String.format("Значение переменной d с типом long равно %d", d));
        System.out.println(String.format("Значение переменной i с типом float равно %f", i));
        System.out.println(String.format("Значение переменной f с типом double равно %f", f));

//Задача №2
        float g = 27.12f;
        System.out.println(String.format("Значение переменной g с типом float равно %f", g));
        long k = 987678965549L;
        System.out.println(String.format("Значение переменной k с типом long равно %d", k));
        float l = 2.786f;
        System.out.println(String.format("Значение переменной l с типом float равно %f", l));
        short m = 569;
        System.out.println(String.format("Значение переменной m с типом short равно %d", m));
        short n = -159;
        System.out.println(String.format("Значение переменной n с типом short равно %d", n));
        short o = 27897;
        System.out.println(String.format("Значение переменной o с типом short равно %d", o));
        byte p = 67;
        System.out.println(String.format("Значение переменной p с типом byte равно %d", p));

//Задача №3
        short class1 = 23;
        short class2 = 27;
        short class3 = 30;
        short allSheets = 480;
        short totalStudents = (short) (class1 + class2 + class3);
        short sheetsPerStudent = (short) (allSheets / totalStudents);
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

//Задача №4
        int bottlesPerMinute = 16 / 2;
        System.out.println("За 20 минут машина произвела " + bottlesPerMinute * 20 + " штук бутылок");
        int minutesInADay = 60 * 24;
        System.out.println("За сутки машина произвела " + bottlesPerMinute * minutesInADay + " штук бутылок");
        int minutesInThreeDays = minutesInADay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesPerMinute * minutesInThreeDays + " штук бутылок");
        //предположим, что в месяце 30 дней
        int minutesInThirtyDays = minutesInADay * 30;
        System.out.println("За месяц машина произвела " + bottlesPerMinute * minutesInThirtyDays + " штук бутылок");

//Задача №5
        byte totalCans = 120;
        byte whiteCansPerClass = 2;
        byte brownCansPerClass = 4;
        byte totalCansPerClass = 2 + 4;
        byte classesAtSchool = (byte) (120 / totalCansPerClass);
        byte totalWhiteCans = (byte) (classesAtSchool * whiteCansPerClass);
        byte totalBrownCans = (byte) (classesAtSchool * brownCansPerClass);
        System.out.println("В школе, где " + classesAtSchool + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

//Задача №6
        short banana = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short egg = 4 * 70;
        short weightInGrams = (short) (banana + milk + iceCream + egg);
        short weightInKilograms = (short) (weightInGrams / 1000);
        System.out.println("Вес спортзавтрака " + weightInKilograms + " килограмм " + weightInGrams % 1000 + " грамм");

//Задача №7
        short minDays = 7000 / 500;
        short maxDays = 7000 / 250;
        short averageDays = (short) ((minDays + maxDays) / 2);
        System.out.println("В среднем на похудение потребуется " + averageDays + " дней, минимум " + minDays + " дней, а максимум " + maxDays + " дней");

//Задача №8
        int maryBefore = 67760;
        int denisBefore = 83690;
        int krisBefore = 76230;
        int maryAfter = (int) (maryBefore * 1.1);
        int denisAfter = (int) (denisBefore * 1.1);
        int krisAfter = (int) (krisBefore * 1.1);
        int maryIncreasePerYear = maryAfter * 12 - maryBefore * 12;
        int denisIncreasePerYear = denisAfter * 12 - denisBefore * 12;
        int krisIncreasePerYear = krisAfter * 12 - krisBefore * 12;
        System.out.println("Маша теперь получает " + maryAfter + " рублей. Годовой доход вырос на " + maryIncreasePerYear + " рублей");
        System.out.println("Денис теперь получает " + denisAfter + " рублей. Годовой доход вырос на " + denisIncreasePerYear + " рублей");
        System.out.println("Кристина теперь получает " + krisAfter + " рублей. Годовой доход вырос на " + krisIncreasePerYear + " рублей");
    }
}