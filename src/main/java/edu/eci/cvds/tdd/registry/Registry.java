package edu.eci.cvds.tdd.registry;

import java.util.HashMap;

import java.util.HashSet;
import java.util.Set;

public class Registry {
    Set<Integer> ids = new HashSet<Integer>();

    public RegisterResult registerVoter(Person p) {
        RegisterResult result = 
            !p.isAlive() ? RegisterResult.DEAD :
            (p.getAge() < 0 || p.getAge() > 150) ? RegisterResult.INVALID_AGE :
            (p.getAge() < 18) ? RegisterResult.UNDERAGE :
            ids.contains(p.getId()) ? RegisterResult.DUPLICATED :
            RegisterResult.VALID;

        if (result == RegisterResult.VALID) {
            ids.add(p.getId());
        }

        return result;
    }
}
