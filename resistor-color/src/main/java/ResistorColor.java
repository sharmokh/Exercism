import java.util.stream.Stream;

class ResistorColor {
    private enum Colors {
        black, brown, red, orange, yellow, green, blue, violet, grey, white
    }

    int colorCode(String color) {
        return Colors.valueOf(color).ordinal();
    }

    String[] colors() {
        return Stream.of(Colors.values())
                .map(Enum :: name)
                .toArray(String[] :: new);
    }
}
