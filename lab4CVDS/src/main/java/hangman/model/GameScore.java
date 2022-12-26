package hangman.model;

public interface GameScore {
    default int calculateScore(int correctCount, int incorrectCount)
            throws HangmanException{
        if (correctCount < 0 || incorrectCount < 0)
            throw new HangmanException(HangmanException.NEGATIVE_NUMBER);
        return 0;
    }
}
