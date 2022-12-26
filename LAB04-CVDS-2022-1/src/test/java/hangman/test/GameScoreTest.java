package hangman.test;

import hangman.model.BonusScore;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;
import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest {
    private OriginalScore originalScore;
    private BonusScore bonusScore;
    private PowerScore powerScore;
    private int resultado;

    /**
     *OriginalScore
     * Resultante entre 0 y 100
     * Puntaje 0: incorrectCount > 10
     * Invalidos: incorrectCount < 0
     * Invalidos: correctCount < 0
     */
    @Test
    public void validTestOriginalScore(){
        originalScore = new OriginalScore();
        try {
            resultado = originalScore.calculateScore(5, 4);
            Assert.assertTrue(resultado == 60);
        }
        catch (Exception e){ }
    }

    @Test
    public void validTestOriginalScore1(){
        originalScore = new OriginalScore();
        try {
            resultado = originalScore.calculateScore(5, 9);
            Assert.assertTrue(resultado == 10);
        }
        catch (Exception e){ }
    }

    @Test
    public void validTestOriginalScore2(){
        originalScore = new OriginalScore();
        try {
            resultado = originalScore.calculateScore(5, 1);
            Assert.assertTrue(resultado == 90);
        }
        catch (Exception e){ }
    }

    @Test
    public void validTestOriginalScoreIncorrectScoreInvalid(){
        originalScore = new OriginalScore();
        try {
            resultado = originalScore.calculateScore(1,11);
            Assert.assertTrue(resultado == 0);
        }
        catch (Exception e){}
    }

    @Test
    public void validTestOriginalScoreInvalidScore(){
        originalScore = new OriginalScore();
        try {
            resultado = originalScore.calculateScore(2,-4);
            Assert.assertTrue(false);
        }
        catch (Exception e){
            Assert.assertTrue(true);
        }
    }
    @Test
    public void validTestOriginalScoreCorrectScoreInvalid(){
        originalScore = new OriginalScore();
        try {
            resultado = originalScore.calculateScore(-5,2);
            Assert.assertTrue(false);
        }
        catch (Exception e){
            Assert.assertTrue(true);
        }
    }

    /**
     * BonusScore
     * Resultante: puntaje calculado >= 0
     * Puntaje 0: (2*incorrectCount) > correctCount
     * Invalidos: incorrectCount < 0
     * Invalidos: correctCount < 0
     */

    //Falta programar
    @Test
    public void validBonusScoreReturn(){
        try {
            bonusScore = new BonusScore();
            resultado = bonusScore.calculateScore(5, 7);
            Assert.assertTrue(resultado == 15);
        }
        catch (Exception e){}
    }

    //Falta programar
    @Test
    public void bonusScoreSetTo0(){
        try {
            bonusScore = new BonusScore();
            resultado = bonusScore.calculateScore(4, 10);
            Assert.assertTrue(resultado == 0);
        } catch (Exception e){}
    }

    @Test
    public void bonusScoreSetTo5(){
        try {
            bonusScore = new BonusScore();
            resultado = bonusScore.calculateScore(1, 1);
            Assert.assertTrue(resultado == 5);
        } catch (Exception e){}
    }

    @Test
    public void bonusScoreSetTo995AlmostMax(){
        try {
            bonusScore = new BonusScore();
            resultado = bonusScore.calculateScore(100, 1);
            //System.out.println(resultado);
            Assert.assertTrue(resultado == 995);
        } catch (Exception e){}
    }

    @Test
    public void validTestBonusScoreInvalidScore(){
        bonusScore = new BonusScore();
        try {
            resultado = bonusScore.calculateScore(2,-4);
            Assert.assertTrue(false);
        }
        catch (Exception e){
            Assert.assertTrue(true);
        }
    }
    @Test
    public void validTestBonusScoreCorrectScoreInvalid(){
        bonusScore = new BonusScore();
        try {
            resultado = bonusScore.calculateScore(-5,2);
            Assert.assertTrue(false);
        }
        catch (Exception e){
            Assert.assertTrue(true);
        }
    }

    /**
     * PowerScore
     * Resultante: puntaje calculado >= 0 y <= 500
     * Puntaje 0: incorrectCount*8 > 500
     * Puntaje > 500: puntajeCalculado = 500
     * Invalidos: incorrectCount < 0
     * Invalidos: correctCount < 0
     */

    @Test
    public void resultPowerScoreValid(){
        powerScore = new PowerScore();
        try {
            resultado = powerScore.calculateScore(3,1);
            Assert.assertTrue(resultado == 117);
        }catch (Exception e){ }
    }


    @Test
    public void resultPowerScoreBiggerThan500(){
        powerScore = new PowerScore();
        try {
            resultado = powerScore.calculateScore(4,0);
            Assert.assertTrue(resultado == 500);
        }
        catch (Exception e){}
    }

    @Test
    public void resultPowerScoreBiggerThan500with1Mistake(){
        powerScore = new PowerScore();
        try {
            resultado = powerScore.calculateScore(4,16);
            Assert.assertTrue(resultado == 497);
        }
        catch (Exception e){}
    }

    @Test
    public void resultPowerScoreSmallestPossible(){
        powerScore = new PowerScore();
        try {
            resultado = powerScore.calculateScore(2,3);
            Assert.assertTrue(resultado == 1);
        }
        catch (Exception e){}
    }

    @Test
    public void resultPowerScoreIncorrectScoreBiggerThan500(){
        powerScore = new PowerScore();
        try {
            resultado = powerScore.calculateScore(2,63);
            Assert.assertTrue(resultado == 0);
        }
        catch (Exception e){}
    }

    @Test
    public void validTestPowerScoreInvalidScore(){
        powerScore = new PowerScore();
        try {
            resultado = powerScore.calculateScore(2,-4);
            Assert.assertTrue(false);
        }
        catch (Exception e){
            Assert.assertTrue(true);
        }
    }
    @Test
    public void validTestPowerScoreCorrectScoreInvalid(){
        powerScore = new PowerScore();
        try {
            resultado = powerScore.calculateScore(-5,2);
            Assert.assertTrue(false);
        }
        catch (Exception e){
            Assert.assertTrue(true);
        }
    }
}
