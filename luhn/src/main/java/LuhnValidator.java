class LuhnValidator {

    boolean isValid(String candidate) {

        candidate = candidate.replaceAll(" ","");
        if (candidate.length() <= 1) return false;

        boolean other = false;
        int sum = 0;

        for (int i = candidate.length() - 1; i >= 0; i--) {
            try {
                int n = Character.getNumericValue(candidate.charAt(i));
                if (other) {
                    n *= 2;
                    if (n > 9) {
                        n -= 9;
                    }
                }
                sum += n;
                other = !other;
            } catch (Exception e) {
                return false;
            }
        }

        return sum % 10 == 0;

    }

}
