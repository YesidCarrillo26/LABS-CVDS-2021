package hangman.model;

public class PowerScore implements GameScore{

    /**
     * @pre El juego incia en 0 puntos
     * @pos La formula que calcula el puntaje es ((5^(correctCount))- (8*incorrectCount)
     * @pos Si el puntaje es menor a 0, este se convierte en 0
     * @pos Si con las reglas expuestas el puntaje sobrepasa los 500 puntos, el puntaje es 500
     * @param correctCount La i-ésima letra correcta se bonifica con 5^i
     * @param incorrectCount Se penaliza con 8 puntos
     * @return puntaje calculado
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException{
        if (incorrectCount < 0 || correctCount < 0) throw new HangmanException(HangmanException.NEGATIVE_NUMBER);
        int resultado = 0;
        resultado = ((power(5,correctCount))-(8*incorrectCount));
        if (resultado > 500) resultado = 500;
        else if (resultado < 0) resultado = 0;
        return resultado;
    }

    //Implementacion auxiliar
    private int power(int number,int power){
        int result = number;
        for (int i = 1; i < power; i++){
            result *= number;
        }
        return result;
    }
}
