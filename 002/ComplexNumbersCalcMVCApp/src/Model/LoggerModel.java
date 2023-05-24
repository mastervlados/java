package Model;

public abstract class LoggerModel {
    
    /** Logger custom name */
    protected String loggerName;
    /** This label uses in the target file as post-prefix */
    protected static String filePrefix = "_xCalc";
    /** Contains current path for necessary file */
    protected String filePath;

    public String getLoggerName() {
        return loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }

    public static String getFilePrefix() {
        return filePrefix;
    }

    public static void setFilePrefix(String filePrefix) {
        LoggerModel.filePrefix = filePrefix;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
