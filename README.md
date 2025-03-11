# Weather Data Analyzer

This application parses weather data from a CSV file and provides various analysis features

## Table of Contents

- [Features](#features)
- [Project Structure](#project-structure)
- [Setup & Requirements](#setup--requirements)
- [Usage](#usage)
- [License](#license)

## Features

1. **Parse Weather Data**  
   Reads temperature, humidity, and precipitation from a CSV file.

2. **Analysis Functions**  
   - **Average Temperature** for a specific month (e.g., August).  
   - **Days Above Threshold** (e.g., above 30°C).  
   - **List of Rainy Days** (precipitation > 0).

3. **Classification**  
   Uses an **enhanced switch** to classify temperatures into categories:  
   - *Hot* (≥ 35°C)  
   - *Warm* (≥ 25°C)  
   - *Cold* (otherwise)

4. **Modern Java**  
   - **Records** (`WeatherRecord`) for data  
   - **Interfaces** (`WeatherDataAnalyzer`, `WeatherDataParser`) for logic  
   - **Lambdas** for event handlers and streams  
   - **Streams** for filtering and aggregation  
   - **Pattern Matching** in the switch statement  
   - **Markdown in Javadoc**

## Project Structure

Typical Maven-style layout:

```
Weather Data Analyzer
 ┣ src
 ┃ ┗ main
 ┃   ┣ java
 ┃   ┃ ┗ edu.farmingdale.weatherdataanalyzer
 ┃   ┃   ┣ HelloApplication.java
 ┃   ┃   ┣ WeatherDataAnalyzer.java
 ┃   ┃   ┣ WeatherDataParser.java
 ┃   ┃   ┣ WeatherRecord.java
 ┃   ┃   ┗ module-info.java (optional)
 ┃   ┗ resources
 ┃     ┣ hello-view.fxml
 ┃     ┗ weatherdata.csv
 ┗ README.md
```

- **`HelloApplication.java`**: The JavaFX `Application` class that launches the UI and ties everything together.
- **`WeatherDataAnalyzer.java`**: An interface with static methods for analyzing weather data (average temperature, days above threshold, rainy days, classification).
- **`WeatherDataParser.java`**: An interface with static methods to parse CSV files into `WeatherRecord` objects.
- **`WeatherRecord.java`**: A record that represents a single weather data entry (date, temperature, humidity, precipitation).
- **`weatherdata.csv`**: A sample CSV file with weather data.

## Setup & Requirements

- **Java 21 or higher** (Java 23 recommended to ensure pattern matching in switch is fully supported).
- A JavaFX-compatible environment (JavaFX libraries are needed at runtime).

### Building with IntelliJ IDEA

1. Open **Project Structure** → **Project** → set **Project SDK** to Java 21 or 23.
2. Under **Modules** → **Dependencies**, ensure the JavaFX libraries are added if you’re not using Maven/Gradle.
3. **Run** `HelloApplication` (or your main JavaFX class).

## Usage

1. **Place `weatherdata.csv` in `src/main/resources`.**  
   The CSV must have a header row:
   ```
   Date,Temperature,Humidity,Precipitation
   ```
2. **Run the Application.**  
   When the JavaFX window opens, you’ll see:
   - A text area (for output).
   - Three buttons:  
     - **Average Temp (Aug)**  
     - **Hot Days**  
     - **Rainy Days**

3. **Click the Buttons.**  
   - **Average Temp (Aug)** displays the rounded average temperature for August.  
   - **Hot Days** shows all days above a threshold (30°C by default in the code).  
   - **Rainy Days** lists all days with precipitation > 0.


## License

This project is for educational purposes. All Rights Reserved

---
