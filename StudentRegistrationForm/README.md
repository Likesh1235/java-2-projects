# Student Registration Form
A Java Swing application for collecting and storing student information in a text file.

## Features
- User-friendly form with validation
- Saves data to `students.txt` file
- Reset button to clear all fields
- Error handling for file operations

## How to Run
1. Open terminal in this folder
2. Run: `javac StudentRegistration.java`
3. Run: `java StudentRegistration`

## Data Storage
Student data is saved in CSV format in `students.txt`:
```
Name,Roll No,Department,Email
```

## Technologies Used
- Java Swing for GUI
- FileWriter for data persistence
- JOptionPane for dialogs and notifications

## Form Fields
- **Name**: Student's full name
- **Roll No**: Student's roll number
- **Department**: Department/Course name
- **Email**: Student's email address

