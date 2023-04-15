import java.util.regex.*;

public class Jewels {

// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

    public static void main(String[] args) {
        String result = findJewelsInStones("aB", "aaaAbbbB");
        System.out.println(result);
    }

    public static String findJewelsInStones(String jewels, String stones) {
        String answer = new String();
        for (char symbol : jewels.toCharArray()) {
            Matcher matcher = Pattern.compile(String.valueOf(symbol)).matcher(stones);
            int countOfJewels = 0;
            while (matcher.find()) {
                countOfJewels++;
            }
            answer += String.format("%c%d", symbol, countOfJewels);
        } 
        return answer;
    }
}