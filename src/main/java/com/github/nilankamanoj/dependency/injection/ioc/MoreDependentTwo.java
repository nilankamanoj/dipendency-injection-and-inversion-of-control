package com.github.nilankamanoj.dependency.injection.ioc;

import com.github.nilankamanoj.dependency.injection.ioc.dependency.*;
import org.springframework.beans.factory.annotation.Autowired;

public class MoreDependentTwo {
    @Autowired
    private DependencyOne dependencyOne;
    @Autowired
    private DependencyTwo dependencyTwo;
    @Autowired
    private DependencyThree dependencyThree;
    @Autowired
    private DependencyFour dependencyFour;
    @Autowired
    private DependencyFive dependencyFive;
    @Autowired
    private DependencySix dependencySix;

    public boolean execute(){
        return dependencyOne.doSomething() == dependencyTwo.doSomething();
    }
}
