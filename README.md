# Smart Expense Tracker

## Table of Contents
1. [Project Description](#project-description)
2. [Features](#features)
3. [Technologies Used](#technologies-used)
4. [Setup Instructions](#setup-instructions)
5. [Usage](#usage)
6. [Project Structure](#project-structure)
7. [Screenshots](#screenshots)
8. [Contributing](#contributing)
9. [Future Enhancements](#future-enhancements)
10. [License](#license)

---

## Project Description
Smart Expense Tracker is a robust and user-friendly desktop application built using Java, designed to assist individuals in managing their financial data effectively. This application allows users to securely record, organize, and analyze their income and expenses. With features like user authentication and detailed reports, it aims to provide a seamless experience while maintaining data privacy and security.

The project leverages a MySQL database for storing user information and financial records, ensuring scalability and reliability for real-world use. The intuitive graphical user interface, built with Swing, makes it easy to navigate and perform tasks efficiently.

---

## Features
- **User Authentication**: Ensures that each user has secure and private access to their financial data.
- **Add Income/Expense**: Easily record income and expense details, including amount, date, category, and description.
- **View Reports**: Generate insightful reports to understand spending habits and manage budgets better.
- **Category Management**: Organize expenses into categories for a clearer financial overview.
- **Search and Filter**: Quickly find specific records using advanced search and filter options.
- **Data Security**: All user data is securely stored in a relational database, with access restricted to the respective user.
- **Cross-Platform Compatibility**: Works on any system with Java Runtime Environment installed.

---

## Technologies Used
- **Programming Language**: Java (Swing for the graphical user interface)
- **Database**: MySQL (for storing user and financial data securely)
- **Development Environment**: NetBeans IDE (for streamlined coding and debugging)
- **Build Tool**: Apache Ant (for automating builds and packaging)
- **Version Control**: Git (for code versioning and collaboration)

---

## Setup Instructions

### Prerequisites
1. Install the latest version of [Java JDK](https://www.oracle.com/java/technologies/javase-jdk-downloads.html).
2. Download and set up [NetBeans IDE](https://netbeans.apache.org/) for development.
3. Install [MySQL Community Server](https://dev.mysql.com/downloads/installer/) and MySQL Workbench for database management.

### Steps to Set Up
1. Clone or download the project repository:
   ```bash
   git clone <repository-url>
   ```
2. Open the project in NetBeans IDE:
   - Navigate to `File > Open Project` and select the downloaded folder.
3. Set up the database:
   - Open MySQL Workbench.
   - Create a new database named `expense_tracker`.
   - Execute the SQL script provided in `src/resources/database.sql` to set up the necessary tables and initial data.
4. Configure database credentials:
   - Open the `DatabaseConnection.java` file located in the `src/smart_expense_tracker` directory.
   - Update the database URL, username, and password to match your MySQL setup:
     ```java
     String url = "jdbc:mysql://localhost:3306/expense_tracker";
     String user = "your_username";
     String password = "your_password";
     ```
5. Build and run the project:
   - In NetBeans, right-click on the project and select `Clean and Build`.
   - Run the project using `Shift + F6` or the green play button.

---

## Usage
1. **Login**:
   - Use your existing credentials to log in.
   - If you are a new user, create an account by clicking the `Sign Up` button and filling out the required details.
2. **Dashboard**:
   - Upon logging in, access the dashboard to view an overview of your income and expenses.
3. **Add Transactions**:
   - Navigate to the `Add Income` or `Add Expense` section.
   - Enter the transaction details (amount, date, category, description) and click `Save`.
4. **Generate Reports**:
   - Go to the `Reports` section to generate detailed financial summaries by month, category, or custom date range.
5. **Logout**:
   - Always log out after use to ensure your data remains secure.

---

## Project Structure
```
Smart Expense Tracker
├── build.xml           # Ant build script for building the project
├── src/                # Source code files
│   ├── smart_expense_tracker/
│   │   ├── DatabaseConnection.java   # Handles database connection
│   │   ├── Income.java               # Handles income-related operations
│   │   ├── Expense.java              # Handles expense-related operations
│   │   ├── LogIn.java                # Manages user authentication
│   ├── Images/         # UI assets and icons
├── Jar/                # Packaged executable JAR files
├── nbproject/          # NetBeans project files
├── test/               # Unit testing files
└── README.md           # Project documentation (this file)
```

---

## Screenshots
### Login Screen

### Dashboard
![Dashboard](src/Images/dashboard.png)
### Add Income/Expense
![Add Transaction](src/Images/add_transaction.png)

---

## Contributing
We welcome contributions from the community to improve and expand the project. To contribute:
1. Fork the repository on GitHub.
2. Create a new branch for your feature or bug fix:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Make your changes and commit them:
   ```bash
   git commit -m "Add your detailed commit message here"
   ```
4. Push your branch and create a pull request:
   ```bash
   git push origin feature/your-feature-name
   ```

Feel free to report issues or suggest new features by opening an issue in the GitHub repository.

---

## Future Enhancements
- **Mobile App Integration**: Develop a mobile version of the app for on-the-go expense tracking.
- **Cloud Backup**: Enable secure cloud storage and synchronization of data.
- **Budget Planning**: Add features to set monthly budgets and track adherence.
- **Export Reports**: Allow users to export reports in PDF and Excel formats.
- **Multi-language Support**: Support for multiple languages to reach a wider audience.

---

## License
This project is licensed under the [MIT License](LICENSE). You are free to use, modify, and distribute this project as per the terms of the license.

---

Thank you for using Smart Expense Tracker! If you have any questions or feedback, feel free to reach out.

