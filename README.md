Campus Course Records Manager

Evolution of Java

1995: Java 1.0 launched by Sun Microsystems.

1998: Java 2 introduced, splitting into SE, EE, and ME editions.

2006: Sun made Java open-source under GPL; later Oracle acquired Sun.

2011: Java SE 7 delivered with new language improvements.

2014: Java SE 8 brought lambdas and the Streams API.

2017: Java SE 9 introduced the modular system.

2024: Latest releases go up to Java SE 24 with continuous enhancements.


Java Editions: ME vs SE vs EE

Edition	Description	Example Use Cases

Java ME	Micro Edition, optimized for devices	IoT gadgets, feature phones
Java SE	Standard Edition for general purpose	Desktop software, tools, servers
Java EE	Enterprise Edition for large systems	Web apps, enterprise solutions


Java Architecture: JDK, JRE, JVM

JDK (Java Development Kit):
A complete toolkit for Java development, including javac, libraries, and debugging tools.

JRE (Java Runtime Environment):
Contains JVM and standard libraries to run Java apps, but lacks compiler tools.

JVM (Java Virtual Machine):
Runs compiled bytecode and ensures platform independence.


Workflow:

Write Java code → Compile with JDK → Run bytecode on JVM (with JRE support).

Installing and Setting up Java on Windows

1. Download the latest JDK from the [Oracle/OpenJDK website].


2. Install following the setup wizard.


3. Configure environment variables:

Add JAVA_HOME pointing to the JDK folder.

Append %JAVA_HOME%\bin to the system Path.




Using Eclipse IDE: Creating and Running Projects

1. Launch Eclipse.


2. Go to File → New → Java Project.


3. Provide a project name and choose workspace if needed.


4. Select “Create separate folders for sources and class files”.


5. Finish the setup.



Running your code

Right-click on the main class → Run As → Java Application.

Use Run → Run Configurations to pass arguments or customize settings.



---

Project Setup Instructions

1. Clone/Open the Repository
Repository Link: CampusCoursesRecordsManager
Open it in your IDE.


2. Add CSV Data Files
Ensure files are stored at:

data/students.csv

data/courses.csv

data/enrollments.csv



3. Build the Project
Compile source files in your IDE or with build tools (Maven/Gradle, if configured).


4. Run the Application
Start the main class: edu.ccrm.cli.CCRMApp.
The system will load records from the CSVs.




---

Screenshots

C:\Users\Akshat Kumar\OneDrive\Desktop\VIT Bhopal University\Fall 2025-2026\CSE2006\Assignment\CCRM\Screenshots\Screenshot 2025-09-24 191616.png

C:\Users\Akshat Kumar\OneDrive\Desktop\VIT Bhopal University\Fall 2025-2026\CSE2006\Assignment\CCRM\Screenshots\Screenshot 2025-09-24 190123.png

C:\Users\Akshat Kumar\OneDrive\Desktop\VIT Bhopal University\Fall 2025-2026\CSE2006\Assignment\CCRM\Screenshots\Screenshot 2025-09-24 190231.png

C:\Users\Akshat Kumar\OneDrive\Desktop\VIT Bhopal University\Fall 2025-2026\CSE2006\Assignment\CCRM\Screenshots\Screenshot 2025-09-24 190405.png

C:\Users\Akshat Kumar\OneDrive\Desktop\VIT Bhopal University\Fall 2025-2026\CSE2006\Assignment\CCRM\Screenshots\Screenshot 2025-09-24 190415.png

C:\Users\Akshat Kumar\OneDrive\Desktop\VIT Bhopal University\Fall 2025-2026\CSE2006\Assignment\CCRM\Screenshots\Screenshot 2025-09-24 190432.png

C:\Users\Akshat Kumar\OneDrive\Desktop\VIT Bhopal University\Fall 2025-2026\CSE2006\Assignment\CCRM\Screenshots\Screenshot 2025-09-24 190446.png

C:\Users\Akshat Kumar\OneDrive\Desktop\VIT Bhopal University\Fall 2025-2026\CSE2006\Assignment\CCRM\Screenshots\Screenshot 2025-09-24 190650.png

C:\Users\Akshat Kumar\OneDrive\Desktop\VIT Bhopal University\Fall 2025-2026\CSE2006\Assignment\CCRM\Screenshots\Screenshot 2025-09-24 190716.png

C:\Users\Akshat Kumar\OneDrive\Desktop\VIT Bhopal University\Fall 2025-2026\CSE2006\Assignment\CCRM\Screenshots\Screenshot 2025-09-24 190904.png

C:\Users\Akshat Kumar\OneDrive\Desktop\VIT Bhopal University\Fall 2025-2026\CSE2006\Assignment\CCRM\Screenshots\Screenshot 2025-09-24 191041.png

C:\Users\Akshat Kumar\OneDrive\Desktop\VIT Bhopal University\Fall 2025-2026\CSE2006\Assignment\CCRM\Screenshots\Screenshot 2025-09-24 191122.png

C:\Users\Akshat Kumar\OneDrive\Desktop\VIT Bhopal University\Fall 2025-2026\CSE2006\Assignment\CCRM\Screenshots\Screenshot 2025-09-24 191251.png

C:\Users\Akshat Kumar\OneDrive\Desktop\VIT Bhopal University\Fall 2025-2026\CSE2006\Assignment\CCRM\Screenshots\Screenshot 2025-09-24 191333.png


