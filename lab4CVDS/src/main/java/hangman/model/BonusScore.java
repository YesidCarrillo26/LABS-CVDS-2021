package hangman.model;

public class BonusScore implements GameScore{

    /**
     * @pre El juego inicia en 0 puntos
     * @pos El puntaje es calculado con la formula ((correctCount*10) - (incorrectCount * 5))
     * @pos Si el puntaje resultante es menor a 0, este se convierte en 0
     * @param correctCount Se bonifica con 10 puntos cada letra correcta
     * @param incorrectCount Se penaliza con 5 puntos cada letra incorrecta
     * @return Puntaje calculado
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException{
        if (incorrectCount < 0 || correctCount < 0) throw new HangmanException(HangmanException.NEGATIVE_NUMBER);
        int resultado = 0;
        resultado = ((correctCount*10)-(incorrectCount*5));
        if (resultado < 0) resultado = 0;
        return resultado;
    }
}
