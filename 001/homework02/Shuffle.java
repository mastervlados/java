public class Shuffle {

    // Вам дается строка S и целочисленный массив индексов int index[s.length].
    // Напишите программу, которая перетасует символы в S таким образом,
    // что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
    //
    // Пример: s = “cba”, index = [3,2,1] result “abc”
    public static void main(String[] args) {
        String s = "cba";
        int sLength = s.length();
        // int[] index = new int[sLength];
        // int j = 0;
        // for (int i = sLength; i > 0; i--) {
        //     index[j] = i;
        //     j++;
        // }
        int[] index = new int[] {2, 1, 3};
        // call method
        String result = shuffle(s, index);
        System.out.println(result);
    }
    
    public static String shuffle(final String s, final int[] index){
        char[] chars = new char[s.length()];
        char[] ss = s.toCharArray();
        String answer = new String();

        for (int position : index) {
            chars[position - 1] = ss[position - 1];
            // System.out.printf("%c", chars[position - 1]);
            answer += String.format("%c", chars[position - 1]);
        }

        return answer;
    }
}