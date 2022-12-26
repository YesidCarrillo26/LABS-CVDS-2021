package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    ArrayList<Person> idPersons = new ArrayList<Person>();
    public RegisterResult registerVoter(Person p){
        RegisterResult registerResult;
        // TODO Validate person and return real result.
        if (p.isAlive()){
            int idPerson = p.getId();
            if (!idPersons.contains(idPerson)) {
                int age = p.getAge();
                if (age >= 18){
                    if(age > 100) registerResult = RegisterResult.INVALID_AGE;
                    else {
                        registerResult = RegisterResult.VALID;
                    }
                }
                else if (age <0){
                    registerResult = RegisterResult.INVALID_AGE;
                }
                else registerResult = RegisterResult.UNDERAGE;
            }
            else{
                registerResult = RegisterResult.DUPLICATED;
            }
        }
        else registerResult = RegisterResult.DEAD;
        return registerResult;
    }
}
