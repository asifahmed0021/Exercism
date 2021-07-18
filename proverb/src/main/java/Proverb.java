import java.util.*;

class Proverb {
    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        List<String> lines = new ArrayList<String>();

        for (int i = 0; i < words.length - 1; i++) {
            lines.add("For want of a " + words[i] + " the " + words[i + 1] + " was lost.");
        }

        if (words.length > 0) {
            lines.add("And all for the want of a " + words[0] + ".");
        }

        return String.join("\n", lines);
    }
}