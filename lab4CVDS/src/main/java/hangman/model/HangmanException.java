package hangman.model;

public class HangmanException extends Exception {
    public static final String NEGATIVE_NUMBER = "El numero es negativo";


    public HangmanException(String message) {
        super(message);
    }
}
