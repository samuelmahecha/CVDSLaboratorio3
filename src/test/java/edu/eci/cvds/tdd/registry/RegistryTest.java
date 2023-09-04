package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Person person = new Person("Samuel", 10107601, 25,Gender.MALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    public void validateInvalidAgeNegative() {
        Person person = new Person("Hann", 14856, -22,Gender.MALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    public void validateInvalidAgeTooHigh() {
        Person person = new Person("Fernanda", 149856, 1000,Gender.FEMALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
     public void validateInvalidUnderAge() {
        Person person = new Person("Maria", 1495656, 14,Gender.FEMALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }   
     public void validateIsAlive() {
        Person person = new Person("Cristian", 14956896, 98,Gender.MALE,false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }   
     public void validateDuplicate() {
        Person person = new Person("Cristian", 14956896, 98,Gender.MALE,false);
        RegisterResult result1 = registry.registerVoter(person);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }   
   
}
