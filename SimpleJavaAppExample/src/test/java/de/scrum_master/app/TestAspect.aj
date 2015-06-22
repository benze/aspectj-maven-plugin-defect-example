package de.scrum_master.app;

public aspect TestAspect {
    before() : execution(* *(..)) {
        System.out.println(thisJoinPoint);
    }
}
