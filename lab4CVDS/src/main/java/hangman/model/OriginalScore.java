package hangman.model;

public class OriginalScore implements GameScore{

    /**
     * @pre El juego inicia con 100 puntos
     * @pre El incorrectCount debe estar entre 0-10
     * @pos El puntaje final es calculado por la formula (100 - 10*incorrectCount)
     * @pos El incorrectCount no puede ser mayor a 10
     * @param correctCount no se bonifica las letras correctas
     * @param incorrectCount se penaliza con 10 puntos cada letra incorrecta
     * @return puntaje calculado
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException{
        int resultado = 100;
        if (incorrectCount < 0 || correctCount < 0) throw new HangmanException(HangmanException.NEGATIVE_NUMBER);
        resultado -= (incorrectCount * 10);
        if (resultado < 0) resultado = 0;
        return resultado;
    }
}
