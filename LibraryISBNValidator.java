public class LibraryISBNValidator {
 public static String normalizeCode(String raw) {
        if (raw == null || raw.trim().length() < 3) {
            return raw != null ? raw.trim() : "";
        }
         String trimmed = raw.trim();
        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    public static String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid: wrong length";
        }
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: non-letter publisher code";
            }
        }
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: non-digit body";
            }
        }
        String pubCode = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7);

        StringBuilder sb = new StringBuilder();
        sb.append("[").append(pubCode).append("] ").append("YEAR: ").append(year).append(" | ").append("CATALOG: ").append(catalog);
        return sb.toString();
    }

    public static void main(String[] args) {
        String input1 = " pen2026004251 ";
        String normalized1 = normalizeCode(input1);
        System.out.println(validateAndFormat(normalized1));

        String input2 = "12N2026004251";
        String normalized2 = normalizeCode(input2);
        System.out.println(validateAndFormat(normalized2));
    }
}