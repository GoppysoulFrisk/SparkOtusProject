# Spark Otus Project

## Overview
This project is a simple Apache Spark application written in Scala. It serves as a demonstration of how to set up a Spark project using Scala and sbt (Scala Build Tool).

## Project Structure
```
spark-scala-project
├── src
│   ├── main
│   │   ├── scala
│   │   │   └── Main.scala
│   │   └── resources
│   └── test
│       ├── scala
│       │   └── MainTest.scala
│       └── resources
├── build.sbt
├── project
│   └── build.properties
└── README.md
```

## Setup Instructions

1. **Prerequisites**
   - Ensure you have Java (JDK 8 or later) installed on your machine.
   - Install Scala and sbt. You can follow the installation instructions from the official Scala and sbt websites.

2. **Clone the Repository**
   ```bash
   git clone <repository-url>
   cd spark-scala-project
   ```

3. **Build the Project**
   Run the following command to build the project:
   ```bash
   sbt compile
   ```

4. **Run the Application**
   To run the Spark application, use:
   ```bash
   sbt run
   ```

5. **Run Tests**
   To execute the unit tests, run:
   ```bash
   sbt test
   ```

## Usage
This project demonstrates basic data processing tasks using Apache Spark. You can modify the `Main.scala` file to implement your own data processing logic.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.