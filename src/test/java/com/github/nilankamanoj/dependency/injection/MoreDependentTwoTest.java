package com.github.nilankamanoj.dependency.injection;

import com.github.nilankamanoj.dependency.injection.ioc.MoreDependentTwo;
import com.github.nilankamanoj.dependency.injection.ioc.dependency.DependencyOne;
import com.github.nilankamanoj.dependency.injection.ioc.dependency.DependencyTwo;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class MoreDependentTwoTest {
    @InjectMocks
    MoreDependentTwo moreDependentTwo;

    @Mock
    DependencyOne dependencyOne;
    @Mock
    DependencyTwo dependencyTwo;
    // mocking for other object

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test(){
        when(dependencyOne.doSomething()).thenReturn("output");
        when(dependencyTwo.doSomething()).thenReturn("output");
        // mock other dependencies related methods to "moreDependentTwo.execute()"

        assertEquals(true,moreDependentTwo.execute());
    }
}
