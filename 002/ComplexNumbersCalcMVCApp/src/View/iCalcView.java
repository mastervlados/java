package View;

public interface iCalcView<T> {
    
    /** Shows message before run the program */
    void showLabel();

    /** Shows message when close the program */
    void exitProgram();

    /** Suggests Enter Command */
    String suggestInputCommand();

    /** Suggests Enter Number */
    T suggestInputTerm();

    /** Suggests Enter Answer to a question */
    boolean suggestInputAnswerToAQuestion(String question);
}
