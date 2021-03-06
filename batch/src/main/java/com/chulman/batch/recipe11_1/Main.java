package com.chulman.batch.recipe11_1;

import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BatchConfiguration.class);
        JobRegistry jobRegistry = context.getBean("jobRegistry", JobRegistry.class);
        JobLauncher jobLauncher = context.getBean("jobLauncher", JobLauncher.class);
        JobRepository jobRepository = context.getBean("jobRepository", JobRepository.class);

        System.err.println(jobRegistry);
        System.err.println(jobLauncher);
        System.err.println(jobRepository);
    }
}
