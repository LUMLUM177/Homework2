import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задание 2.1
        byte firstVar = 7;
        short secondVar = -7;
        int thirdVar = 1_000_777;
        long fourthVar = -7_777_777_777_777_777L;

        float fifthVar = 5.77f;
        double sixthVar = 3245.11324238;

        char seventhVar = 'M';
        boolean eighthVar = true;

        // Задание 2.2
        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float totalWeight = firstBoxer + secondBoxer;
        float weightDifference = Math.abs(firstBoxer - secondBoxer);

        System.out.println("Общий вес двух бойцов составляет: " + totalWeight + " кг");
        System.out.println("Разница в весе между бойцами составляет: " + weightDifference + " кг");

        //Задание 2.3
        int piecesBananas = 5;
        int piecesMilk = 200 / 100;
        int piecesIceCream = 2;
        int piecesEggs = 4;

        int weightBananas = 80;
        int weightMilk = 105;
        int weightIceCream = 100;
        int weightEggs = 70;

        int weightBreakfast = (piecesBananas * weightBananas) + (piecesMilk * weightMilk) + (piecesIceCream * weightIceCream) + (piecesEggs * weightEggs);
        double weightBreakfastKgs = weightBreakfast / (1000 * 1.0); // перевод в килограммы
        System.out.println("Общий вес спорт-завтрака составляет: " + weightBreakfastKgs + " килограмм");

        //Задание 2.4
        int extraWeight = 7000;
        int countDay1 = 7000 / 250;
        int countDay2 = 7000 / 500;
        int countDay = (countDay1 + countDay2) / 2;

        System.out.println("Если спортсмен будет сбрасывать по 250 грамм, ему потребуется: " + countDay1 + " дней.");
        System.out.println("Если спортсмен будет сбрасывать по 500 грамм, ему потребуется: " + countDay2 + " дней.");
        System.out.println("В среднем спортсмену потребуется: " + countDay + " день.");

        //Задание 2.5
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;

        int incomeYearMasha = salaryMasha * 12;
        int incomeYearDenis = salaryDenis * 12;
        int incomeYearKristina = salaryKristina * 12;

        int newSalaryMasha = (int) (salaryMasha + salaryMasha * 0.1);
        int newSalaryDenis = (int) (salaryDenis + salaryDenis * 0.1);
        int newSalaryKristina = (int) (salaryKristina + salaryKristina * 0.1);

        int newIncomeYearMasha = newSalaryMasha * 12;
        int newIncomeYearDenis = newSalaryDenis * 12;
        int newIncomeYearKristina = newSalaryKristina * 12;

        System.out.println("Маша теперь получает " + newIncomeYearMasha + " рублей. Годовой доход вырос на " + (newIncomeYearMasha - incomeYearMasha) + " рублей.");
        System.out.println("Денис теперь получает " + newIncomeYearDenis + " рублей. Годовой доход вырос на " + (newIncomeYearDenis - incomeYearDenis) + " рублей.");
        System.out.println("Кристина теперь получает " + newIncomeYearKristina + " рублей. Годовой доход вырос на " + (newIncomeYearKristina - incomeYearKristina) + " рублей.");

    }
}