
# Simple Tasks (Java) - Task 2.1

## Description

This project implements a Person class with three fields:
last name, first name, and age.

The equals() and hashCode() methods are overridden
to compare Person objects by their field values.

The program:
1. Creates a Person object.
2. Converts it to JSON using Gson.
3. Converts JSON back to a Person object.
4. Compares the original and restored objects using equals().

## Technologies

- Java 21
- Maven
- Gson
- JUnit 5
- EqualsVerifier

## How to Run

Run the application:

```bash
mvn compile exec:java -Dexec.mainClass=com.example.Main
```

Expected output:

```text
JSON: {"lastName":"Ivanov","firstName":"Ivan","age":20}
Objects are equal: true
```

## Testing

Run all unit tests:

```bash
mvn clean test
```

The project includes 9 unit tests that check:
- The equals() and hashCode() contract.
- Equality of objects with identical values.
- Inequality when fields are different.
- Comparison with null and other types.
- JSON serialization and deserialization.
