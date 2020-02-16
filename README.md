# celebrity-finder

This program is an attempt to solve the problem **Find the celebrity** by using graphs to model and find a solution.

It was developed with **Java 8** on **linux Ubuntu 16.04**, creating a new project using **Maven 3.3.9**.

## Project file description

As in every maven generated project, it has its src folder with both main and test subfolders with the code for the solution a its corresponding unit tests respectively. Also, it has a resource folder with an input.txt that can be used to test the program.

## Solution approach

In order to solve the **Find the celebrity** problem, it was modeled as a hacker rank problem where the program expects a determined input and writes out the output after executing the code.

### Input and Output Constraints

#### Input

The input of the program should follow the format below

```
    t
    n m
    u1 v1
    u2 v2
    ...
    um vm
```

where:
* t represent the number of cases to solve.
* n and m represents the total number of people in the group and m the total number of relationships among the group respectively
* m lines of u, v integer pairs representing relationships between nodes in the form of u knows v

##### Constraints
t > 0
n > 0
0 < m < n(n -1)/2

the repeated u v pairs will be ignored

##### Example

```
1
2 1
0
```

#### Output

For each test t the program will print the index of the person of the graph which meets the requirement, in the case of no nodes or more than one node fulfilling the condition the output will be -1

## Execution of the program

### Prerequisites 

The machine running the program must have JDK 8 or newer installed and added to the system's path as well as Maven 3.3.9 or newer and git.

### Executing the code

* Clone the project then navigate to the project folder.
    ```
    git clone https://github.com/mejiandres87/celebrity-finder.git
    cd celebrity-finder
    ```
* Compile the project
    ```
    mvn compile
    ```
* Package the project
    ```
    mvn package
    ```
* Run the program with an input file (example of the input file can be found on /src/main/resources/input.txt)
    ```
    java -jar target/celebrity-finder-1.0-SNAPSHOT.jar < src/main/java/resources/input.txt 
    ```
*The program also takes the input from standar input*


