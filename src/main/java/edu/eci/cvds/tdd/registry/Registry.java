package edu.eci.cvds.tdd.registry;

import java.util.HashMap;

public class Registry {
    private HashMap<Integer,Person> votantes;
    public Registry(){
        votantes = new HashMap<Integer, Person>();
    }
    public RegisterResult registerVoter(Person p) {
        // TODO Validate person and return real result.
        return RegisterResult.VALID;
    }
}
