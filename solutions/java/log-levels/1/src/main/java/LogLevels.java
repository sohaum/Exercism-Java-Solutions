public class LogLevels {
    
    public static String message(String logLine) {
        int colonIndex = logLine.indexOf(":");
        return logLine.substring(colonIndex + 1).trim();
    }

    public static String logLevel(String logLine) {
        int closingBracketIndex = logLine.indexOf("]");
        return logLine.substring(1, closingBracketIndex).toLowerCase();
    }

    public static String reformat(String logLine) {
        String msg = message(logLine);
        String lvl = logLevel(logLine);
        return msg + " (" + lvl+ ")";
    }
}
