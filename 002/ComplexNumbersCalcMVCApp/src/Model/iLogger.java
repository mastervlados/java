package Model;

import Controller.Commands;

public interface iLogger<T> {

    /** Check for file by path */
    void checkFile();

    /** Create specific file handler for current logger */
    void createFileHandler();

    /** Preparing for logger settings */
    void initLogger();

    /** Writes new line in the document */
    void writeLog(T firtsTerm, T secondTerm, T result, Commands command);
}
