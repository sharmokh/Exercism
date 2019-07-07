class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        int sum = 0, factor = 10;
        for (char c : stringToVerify.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c) * factor;
                factor--;
            } else if (c == 'X' && factor == 1) {
                sum += 10;
                factor--;
            }
        }
        return sum % 11 == 0 && factor == 0;
    }

}
