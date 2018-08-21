package com.github.nilankamanoj.dependency.injection.ioc;

import com.github.nilankamanoj.dependency.injection.ioc.dependency.*;

public class MoreDependentOne {
    private DependencyOne dependencyOne;
    private DependencyTwo dependencyTwo;
    private DependencyThree dependencyThree;
    private DependencyFour dependencyFour;
    private DependencyFive dependencyFive;
    private DependencySix dependencySix;

    public MoreDependentOne(DependencyOne dependencyOne, DependencyTwo dependencyTwo, DependencyThree dependencyThree, DependencyFour dependencyFour, DependencyFive dependencyFive, DependencySix dependencySix) {
        this.dependencyOne = dependencyOne;
        this.dependencyTwo = dependencyTwo;
        this.dependencyThree = dependencyThree;
        this.dependencyFour = dependencyFour;
        this.dependencyFive = dependencyFive;
        this.dependencySix = dependencySix;
    }
}
