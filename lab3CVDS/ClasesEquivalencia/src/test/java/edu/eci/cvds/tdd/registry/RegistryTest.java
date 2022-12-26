package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();

    @Test
    public void validateIsAlive(){
        Person person = new Person("sebastian", 12345, 30, Gender.MALE, false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD,result);
    }
    @Test
    public void validateIsValid(){
        Person person = new Person("Rosa", 23233, 43, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID,result);
    }
    @Test
    public void validateIsValidButDeath(){
        Person person = new Person("Rosaura", 2132233, 45, Gender.FEMALE, false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD,result);
    }
    @Test
    public void validateInvalidAge() {
        Person person = new Person("pepito", 12213345, -12, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    @Test
    public void validateInvalidAgeDead(){
        Person person = new Person("Laura", 11213345, -12, Gender.FEMALE, false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD,result);
    }
    @Test
    public void validateUnderAge(){
        Person person = new Person("Valeria", 321432, 10, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    @Test
    public void validateUnderAgeDead(){
        Person person = new Person("Sara", 321432, 10, Gender.FEMALE, false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    @Test
    public void validateInvalidAgeHiguerThan100() {
        Person person = new Person("Rogelio", 3211432, 104, Gender.UNIDENTIFIED, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    // TODO Complete with more test cases
}
