package com.fundamentos.sprinboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoDependency implements ComponentDependency{

    @Override
    public void saludar() {
        System.out.println("hello word desde componente dos");
    }
}
