class ReverseString {

    String reverse(String inputString) {
        StringBuilder reverse = new StringBuilder();
        for (int i = inputString.length(); i > 0; i--)
            reverse.append(inputString.charAt(i-1));
        return reverse.toString();
    }
}
