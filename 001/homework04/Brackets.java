import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class Brackets {

// Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false

public static void main(String[] args) {
    System.out.println(validate(getDequeFromString("()[]")));
    System.out.println(validate(getDequeFromString("()")));
    System.out.println(validate(getDequeFromString("{[()]}")));
    System.out.println(validate(getDequeFromString("()()")));
    System.out.println(validate(getDequeFromString(")()(")));
    System.out.println(validate(getDequeFromString("{{{{{}}}}}")));
    System.out.println(validate(getDequeFromString("{[{{]{{}}}}}")));
}

public static Deque<Character> getDequeFromString(String str){
    Deque<Character> deque = new LinkedList<>();
    for (int i = 0; i < str.length(); i++) {
        deque.add(str.charAt(i));
    }
    return deque;
}

public static boolean validate(Deque<Character> deque){
    // ( ) — round brackets
    // [ ] — square brackets
    // { } — curly brackets
    Deque<Character> temp = new ArrayDeque<Character>();

    for (char bracket : deque) {
        // If a bracket like open section
        if (bracket == '(' || bracket == '[' || bracket == '{') {
            // Push the element in the stack
            temp.push(bracket);
            continue;
        }

        // If current character is not opening
        // bracket, then it must be closing. So stack
        // cannot be empty at this point.
        if (temp.isEmpty())
            return false;

        char target;

        switch (bracket) {
            case ')':
                // take the last element and check it
                target = temp.pop();
                if (target == '{' || target == '[')
                    return false;
                break;
            case '}':
                target = temp.pop();
                if (target == '(' || target == '[')
                    return false;
                break;
            case ']':
                target = temp.pop();
                if (target == '(' || target == '{')
                    return false;
                break;
        }
    }
    
    // If <temp> or stack isn't empty - means we have unclosed brackets
    return (temp.isEmpty());
}
}

