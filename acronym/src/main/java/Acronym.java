class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        /*
        // Lambda Stream Method
        acronym = Stream.of(phrase.split("\\W+"))  // split at each word
                .filter(s -> !s.isEmpty()) // check to see if not empty string
                .map(s -> s.charAt(0))  // retrieves first character
                .map(ch -> ch.toString().toUpperCase())  // capitilizes character
                .collect(joining()); // joins as string
        */

        // Traditional Method
        String[] tokens = phrase.split("[-\\s\\_]");
        StringBuilder acronym = new StringBuilder();
        for (String token : tokens)
            if (token.length() != 0) acronym.append(token.charAt(0));
        return acronym.toString().toUpperCase();
    }

}
