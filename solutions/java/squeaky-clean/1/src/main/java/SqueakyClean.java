class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        boolean shouldConvertToUpper = false;
        for (int i = 0; i < identifier.length(); i++) {
            char ch = identifier.charAt(i);
            if (ch == ' ') {
                sb.append('_');
            } 
            else if (ch == '-') {
                shouldConvertToUpper = true;
            } 
            else if (isLeet(ch)) {
                sb.append(convertLeet(ch));
            } 
            else if (Character.isLetter(ch)) {
                if (shouldConvertToUpper) {
                    sb.append(Character.toUpperCase(ch));
                    shouldConvertToUpper = false;
                } else {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
    private static boolean isLeet(char ch) {
        return "43017".indexOf(ch) != -1;
    }
    private static char convertLeet(char ch) {
        switch (ch) {
            case '4': return 'a';
            case '3': return 'e';
            case '0': return 'o';
            case '1': return 'l';
            case '7': return 't';
            default: return ch;
        }
    }
}