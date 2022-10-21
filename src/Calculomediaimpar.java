public class Calculomediaimpar {

    public static void main(String[] args) {
        int count = 0, sumOdd = 0, count2 = 0, max = 1000;
        double average;
        do {
            if (count % 2 != 0) {
                sumOdd = sumOdd + count;
                count2++;
            }
            count++;
        } while (count <= max);

        average = sumOdd / count2;
        System.out.println("O valor da soma dos impares e: " + sumOdd);
        System.out.println(" O valor da media dos numeros impares e: " + average);
        System.out.println("O valor da media geral e :" + sumOdd / max);
    }}