class Proverb {
    private String[] words;

    public Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        if (words.length == 0) return "";
        StringBuilder proverb = new StringBuilder();
        for (int i = 1; i < words.length; i++) {
            proverb.append(String.format("For want of a %s the %s was lost.\n", words[i - 1], words[i]));
        }
        proverb.append(String.format("And all for the want of a %s.", words[0]));
        return proverb.toString();
    }

}
