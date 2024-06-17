# Cucumber Demo Projekt

Dieses Projekt demonstriert die Verwendung von Cucumber mit Java, um einfache Tests 
für eine Taschenrechner-Anwendung zu erstellen.

## Voraussetzungen

- **Java Development Kit (JDK) 8 oder höher**
- **Maven**
- **Eine Entwicklungsumgebung (IDE): IntelliJ IDEA**

## Projektstruktur
<pre>
cucumber-demo
│ pom.xml
└───src
   ├───main
   │     └───java
   │         └───calculator
   |                CucumberDemoProjekt.java
   │                Calculator.java
   └───test
      ├───java
      │   └───calculator
      │       │   RunCucumberTest.java
      │       └───steps
      │             CalculatorSteps.java
      |      
      └───resources
          └───features
                calculator.feature
</pre>



## Einrichtung

1. **Clone das Repository:**
   ```sh
   git clone <repo-url>
   cd cucumber-demo

2. **Build das Repository:**
    ```sh
   mvn clean install
   
3. **Ausführe die Tests:**
   ```sh 
   mvn test