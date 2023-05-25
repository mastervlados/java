package Model;

public interface iCalcModel<T> {

    /** Addition */
    T add(T a, T b);

    /** Subtraction */
    T subtract(T a, T b);

    /** Multiplication */
    T multiply(T a, T b);

    /** Division */
    T divide(T a, T b);
}
