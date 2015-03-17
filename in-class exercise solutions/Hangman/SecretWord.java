import java.util.HashMap;
import java.util.Random;

public class SecretWord {

    private static final String[] wordList = {
        "LARYNX", "GYM", "NYMPH", "PYGMY", "RHYTHMS",
        "LYNX",  "HYMN", "MYRRH", "GYPSY", "BROUHAHA",
        "WIMPY", "UNZIP", "UKULELE", "BORSCHT", "GAY",
        "ABSTRACT", "ALFALFA", "AMBASSADOR", "BOOK", "COMPUTER",
        "CRYPT",  "DISPEL", "FOYER", "FUZZY", "GNOME",
        "HUBBUB", "IMP", "JUNK", "KEYHOLE", "MESSY",
        "ONYX", "PUEBLO", "QUAGMIRE", "QUIET", "SLITHER",
        "SQUIRMY", "SUCCUMB", "TELEVISION", "WALLABY", "ZIRCON"
    };

    private String word;

    private HashMap<Character, Boolean> guessedLetters;

    public SecretWord() {
        Random r = new Random();
        int index = r.nextInt(wordList.length - 1);
        this.word = wordList[index];
        wordToHash();
    }

    public SecretWord(String word) {
        this.word = word.toUpperCase();
        wordToHash();
    }

    private void wordToHash() {
        this.guessedLetters = new HashMap<Character, Boolean>();
        for (int i = 0; i < this.word.length(); i++) {
            this.guessedLetters.put(this.word.charAt(i), false);
        }
    }

    private boolean isLowerCase(char letter) {
        return letter == Character.toLowerCase(letter);
    }

    public boolean isLetter(char letter) throws IllegalArgumentException {
        if (isLowerCase(letter)) {
            throw new IllegalArgumentException("Letters must be uppercase.");
        }
        return this.word.contains(Character.toString(letter));
    }

    public void set(char letter) throws IllegalArgumentException {
        if (isLowerCase(letter)) {
            throw new IllegalArgumentException("Letters must be uppercase.");
        }
        if (isLetter(letter)) {
            this.guessedLetters.put(letter, true);
        } else {
            throw new IllegalArgumentException(letter + " is not in the Secret Word!");
        }
    }

    public String toString() {
        String line = "";
        for (int i = 0; i < this.word.length(); i++) {
            char letter = this.word.charAt(i);
            if (this.guessedLetters.get(letter)) {
                line += letter + " ";
            } else {
                line += "_ ";
            }
        }
        return line;
    }

    public String reveal() {
        return this.word;
    }

    public boolean isGuessed() {
        for (Boolean guessed : this.guessedLetters.values()) {
            if (!guessed) {
                return false;
            }
        }
        return true;
    }
}