// Task_4. *
// +Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.
import java.util.Arrays;

class RestoreEquation {
    public static void main(String[] args) {
        getSolutionForEquation("2? + ?5 = 69");
        getSolutionForEquation("?2 + 5? = 69");
        getSolutionForEquation("5 + 2? + ?5 = 69");
        getSolutionForEquation("2? - ?5 = 69");
        getSolutionForEquation("2? / ?5 = 69");
        getSolutionForEquation("2? * ?5 = 69");
    }

    public static void getSolutionForEquation(String equation) {
        String[] elements = equation.split(" ");

        if (elements.length == 5) {
            String firstValue = elements[0]; 
            int[] parseFirstNumber = getParseStringWithNumbers(firstValue); // [2, ?] > [?, 2]

            String operation = elements[1]; // + - * /

            String secondValue = elements[2]; 
            int[] parseSecondNumber = getParseStringWithNumbers(secondValue); // [?, 5] > [5, ?]

            String result = elements[4]; // result 
            int[] parseResultNumber = getParseStringWithNumbers(result); // [6, 9] > [9, 6]

            switch (operation) {
                case "+": 
                    checkForSolutionBySumNums(parseFirstNumber, parseSecondNumber, parseResultNumber);
                    break;
                default: 
                    System.out.printf("Operation '%s' not supported. (%s)\n", operation, equation);
                    break;
                }
        } else {
            // Equation isn't correct!
            System.out.printf("Error, (%s) isn't correct!\n", equation);
        }
    }

    public static int[] getParseStringWithNumbers(String parseString) {

        char[] chars = parseString.toCharArray();
        int charsLength = chars.length;
        int[] result = new int[charsLength];
        // int j = 0;

        // for (int i = charsLength - 1; i >= 0; i--) {
        //     if (chars[i] == '?') {
        //         result[j] = -1;
        //     } else {
        //         result[j] = Character.getNumericValue(chars[i]);
        //     }
        //     j++;
        // }

        for (int j = 0; j < charsLength; j++) {
            if (chars[j] == '?') {
                result[j] = -1;
            } else {
                result[j] = Character.getNumericValue(chars[j]);
            }
        }

        // for (int k = 0; k < charsLength; k++) {
        //     System.out.println(result[k]);
        // }

        return result;
    }

    public static void checkForSolutionBySumNums(int[] q, int[] w, int[] e) {
        // «q, w, e» might be different lengths!
        String answer = "";

        for (int i = 0; i < q.length; i++) {
            if (q[i] == -1) {
                int x = e[i] - w[i];
                q[i] = Math.abs(x);
            }
            answer += q[i];
        }

        answer += " + ";

        for (int j = 0; j < w.length; j++) {
            if (w[j] == -1) {
                int y = e[j] - q[j];
                w[j] = Math.abs(y);
            }
            answer += w[j];
        }
        
        answer += " = ";

        for (int item : e) {
            answer += item;
        }

        System.out.printf("Repaired: %s\n", answer);
        
    }
}