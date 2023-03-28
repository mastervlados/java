// Task_1
// Улитка ползёт по вертикальному шесту высотой h метров, 
// поднимаясь за день на a метров, а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?
// Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
// Программа должна вывести одно натуральное число.

// Sample Input 1:
// 10
// 3
// 2

// Sample Output 1:
// 8

// 7 days = 7 meters and 3 meters until a day but night isn't appear

class Lesson01 {
    public static void main(String[] args) {
        int heightOfPole = 10;
        int snailPerDaytime = 3; // meters up
        int snailPerNight = 2; // meters down
        int days = 0;
        boolean flag = true;
        int currentValueOfMetersTraveled = 0;

        while (flag) {
            // daytime
            currentValueOfMetersTraveled += snailPerDaytime;
            days++;
            if (currentValueOfMetersTraveled == heightOfPole) {
                flag = false;
            } else {
                // night
                currentValueOfMetersTraveled -= snailPerNight;
            }
        }
        System.out.printf("Улитка заберется на шест длиной %d метров - за %d дней.", heightOfPole, days);
    }
}