package com.fundamentos.sprinboot.fundamentos;

import com.fundamentos.sprinboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;

	public FundamentosApplication (@Qualifier("componentTwoDependency") ComponentDependency ccomponentDependency) {
		this.componentDependency = ccomponentDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args)  {
		componentDependency.saludar();

	}
}
