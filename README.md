
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
11. [Contact Information](#contact-information)

---

## Project Description
Smart Expense Tracker is a robust and user-friendly desktop application built using Java, designed to assist individuals in managing their financial data effectively. This application allows users to securely record, organize, and analyze their income and expenses. With features like user authentication, signup functionality, and detailed reports, it aims to provide a seamless experience while maintaining data privacy and security.

The project leverages a MySQL database for storing user information and financial records, ensuring scalability and reliability for real-world use. The intuitive graphical user interface, built with Swing, makes it easy to navigate and perform tasks efficiently. Additionally, an executable (`.exe`) file is provided for users to quickly install and run the application.

---

## Features
- **User Authentication**: Ensures that each user has secure and private access to their financial data.
- **Sign Up Functionality**: New users can create an account to start using the application.
- **Add Income/Expense**: Easily record income and expense details, including amount, date, category, and description.
- **View Reports**: Generate insightful reports to understand spending habits and manage budgets better.
- **Category Management**: Organize expenses into categories for a clearer financial overview.
- **Search and Filter**: Quickly find specific records using advanced search and filter options.
- **Data Security**: All user data is securely stored in a relational database, with access restricted to the respective user.
- **Executable File**: Convenient `.exe` file for easy installation and use on Windows systems.

---

## Technologies Used
- **Programming Language**: Java (Swing for the graphical user interface)
- **Database**: MySQL (for storing user and financial data securely)
- **Development Environment**: NetBeans IDE (for streamlined coding and debugging)
- **Build Tool**: Apache Ant (for automating builds and packaging)
- **Executable Packaging**: Launch4j or similar tool for creating `.exe` files
- **Version Control**: Git (for code versioning and collaboration)

---

## Setup Instructions

### Prerequisites
1. Install the latest version of [Java JDK](https://www.oracle.com/java/technologies/javase-jdk-downloads.html).
2. Download and set up [NetBeans IDE](https://netbeans.apache.org/) for development (if modifying the source code).
3. Install [MySQL Community Server](https://dev.mysql.com/downloads/installer/) and MySQL Workbench for database management (only needed for developers).
4. For end-users, ensure Java Runtime Environment (JRE) is installed.

### Steps for Developers
1. Clone or download the project repository:
   ```bash
   git clone <https://github.com/sushantgarde/Smart-Expense-Tracker.git>
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

### Steps for End-Users
1. Download the provided executable file (`SmartExpenseTracker.exe`).
2. Double-click the file to install and launch the application.
3. Follow the on-screen instructions to log in or sign up.

---

## Usage
1. **Sign Up**:
   - New users can create an account by clicking the `Sign Up` button and filling out the required details.
2. **Login**:
   - Use your credentials to log in after creating an account.
3. **Dashboard**:
   - Upon logging in, access the dashboard to view an overview of your income and expenses.
4. **Add Transactions**:
   - Navigate to the `Add Income` or `Add Expense` section.
   - Enter the transaction details (amount, date, category, description) and click `Save`.
5. **Generate Reports**:
   - Go to the `Reports` section to generate detailed financial summaries by month, category, or custom date range.
6. **Logout**:
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
│   │   ├── SignUp.java               # Manages user signup functionality
│   ├── Images/         # UI assets and icons
├── Jar/                # Packaged executable JAR files
├── nbproject/          # NetBeans project files
├── test/               # Unit testing files
├── SmartExpenseTracker.exe  # Executable file for end-users
└── README.md           # Project documentation (this file)
```

---

## Screenshots
### Login Screen
![Screenshot 2024-12-26 213453](https://github.com/user-attachments/assets/1520f1cb-4e91-4954-993a-eda97cba6331)
![Screenshot 2024-12-26 213504](https://github.com/user-attachments/assets/5b5bc912-a49a-4f2d-807e-2728e2b2742e)

### Sign Up Screen
![Screenshot 2024-12-26 213403](https://github.com/user-attachments/assets/36bc80c9-0fb3-4767-8e7f-69866be0d284)
![Screenshot 2024-12-26 213439](https://github.com/user-attachments/assets/4ea7d14c-6b5c-497f-ab16-0c3c75c7ede1)

### Dashboard
![Screenshot 2024-12-26 213511](https://github.com/user-attachments/assets/9924a426-c0ad-464f-b336-83c0cc62bbae)

### Add Income/Expense
![Screenshot 2024-12-26 213553](https://github.com/user-attachments/assets/c33e5a56-588b-423e-8e93-47ea55ac143e)
![Screenshot 2024-12-26 213620](https://github.com/user-attachments/assets/ecbcb586-98bc-4def-86fc-98aa721658b9)

![Screenshot 2024-12-26 213653](https://github.com/user-attachments/assets/bb3353ad-585b-48d1-a456-591e58648550)

###Account
![Screenshot 2024-12-26 213710](https://github.com/user-attachments/assets/ff10a538-ff5b-4599-9f4d-49d372dd2227)

###Report
![Screenshot 2024-12-26 213704](https://github.com/user-attachments/assets/1d0c1b27-fd88-4997-85fe-adc55d46a563)

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

## Contact Information
**Author**: Sushant Garde  
**Email**: [Sushant](mailto:gardesushant1@gmail.com)  
**GitHub**: [sushantgarde](https://github.com/sushantgarde)  
**LinkedIn**: [Sushant Garde](https://linkedin.com/in/sushantgarde)

For any queries, feedback, or collaboration requests, feel free to reach out!
```
