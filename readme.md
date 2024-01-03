# Movie Management System

Welcome to the Movie Management System! This console-based application allows you to effortlessly register, search for, and edit movie records. The system is built with Java and Maven, utilizing Lombok for enhanced readability.

## Getting Started

### Prerequisites

Ensure you have the following installed:

- Java 20
- Maven
- Lombok 1.18.30

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/movie-management.git
   ```

2. **Navigate to the project directory:**

   ```bash
   cd movie-management
   ```

3. **Build the project using Maven:**

   ```bash
   mvn clean install
   ```

4. **Run the application:**

   ```bash
   java -jar target/movie-management-1.0-SNAPSHOT.jar
   ```

## Usage

Upon launching the application, you'll encounter an intuitive menu offering the following options:

1. **Register Movie:** Add a new movie effortlessly.
2. **Search for Movies:** Explore movies based on name, release year, producer, language, and more.
3. **Edit Movie:** Modify existing movie records with ease.

Follow the on-screen prompts to navigate and interact seamlessly with the system.

## Code Structure

The project adheres to a clean and organized structure:

- **Main:** Initiates the console-based user interface.
- **NavigateMenuService:** Manages navigation through menus and submenus.
- **NavigateMenuScreens:** Provides clear text representations for different screens.
- **Movie:** Represents a movie record concisely as a Java record.
- **Language:** Enumerates supported languages for clarity.
- **FileWriterHandler:** Efficiently writes new movie records to the CSV file.
- **FileReaderHandler:** Reads and fetches movie records from the CSV file seamlessly.

## Contribution

Contributions, feedback, and suggestions are welcomed! Feel free to open an issue or create a pull request.
