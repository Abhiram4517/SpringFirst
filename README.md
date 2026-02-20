# 🌱 Spring Core — Basic IoC Project

This is my first project using the Spring Framework (Spring Core). It demonstrates how the Spring IoC container manages objects using Java-based configuration.

⚠️ This project does NOT use Dependency Injection. The bean is created manually inside the configuration class.

## 🚀 Features

✔️ Spring IoC Container usage  
✔️ Java-based configuration (no XML)  
✔️ Bean creation using @Bean annotation  
✔️ ApplicationContext usage  
✔️ Simple POJO as a Spring bean  

## 🧠 Concepts Covered

- Spring Core
- Inversion of Control (IoC)
- ApplicationContext
- Java Configuration
- Bean Creation

## 📁 Project Structure

spring-core-basic-ioc  
│  
├── in.beans  
│   └── Appconfig.java  
│  
├── in.main  
│   └── Test.java  
│  
└── sp1  
    └── Student.java  

## ⚙️ How It Works

1. Spring container is created using AnnotationConfigApplicationContext  
2. Configuration class registers a Student bean using @Bean  
3. The bean is retrieved from the container  
4. Student details are printed to the console  



## 📌 Output

Student [eid=1, name=Abhiram, sal=10000.0]

## 🎯 Purpose

This project is created to understand how Spring manages objects using the IoC container before learning Dependency Injection and Spring Boot.

## 📚 Next Steps

- Dependency Injection (@Autowired)  
- Component Scanning  
- Constructor Injection  
- Spring Boot  

## 👨‍💻 Author

Abhiram — Aspiring Java Backend Developer
