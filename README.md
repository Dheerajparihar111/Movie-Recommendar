🎬 Movie Recommendation System 

A professional Command Line Movie Recommendation System built using Java (OOP principles).
This project demonstrates structured programming, clean architecture, and user-friendly CLI interaction with a colored interface.

🚀 Overview

This application allows users to:

Browse a collection of movies
Search and filter based on preferences
Get recommendations based on genre and rating
View top-rated movies

It is designed as a modular, scalable CLI application following industry-style OOP design patterns.

✨ Features
🎥 Movie Management
View all available movies
Search movies by name
Filter movies by genre
⭐ Recommendation System
Suggest movies based on user’s preferred genre
Filters high-rated movies (rating ≥ 8)
📊 Top Rated Section
Displays top 5 highest-rated movies
Sorted dynamically
🎨 CLI UI Enhancements
Colored output for better readability
🟢 Success / Results
🔴 Errors
🔵 Input prompts
🟡 Menu options
🧱 Project Architecture (OOP)
Movie.java         → Data Model (Encapsulation)
MovieService.java  → Business Logic
Main.java          → User Interface (CLI)
🔹 Design Principles Used
Encapsulation (private fields + getters)
Separation of concerns
Modular code structure
🛠️ Technologies Used
☕ Java (Core)
📚 ArrayList (dynamic storage)
🔁 Collections.sort (sorting logic)
🎨 ANSI Escape Codes (CLI colors)
💻 Command Line Interface
⚙️ Menu Options
===== MOVIE RECOMMENDATION SYSTEM =====

1 View All Movies
2 Search Movie
3 Filter by Genre
4 Recommend Movies
5 Top Rated Movies
6 Exit
🖥️ Sample Output
===== MOVIE RECOMMENDATION SYSTEM =====

Enter choice: 4
Enter preferred genre: SciFi

Recommended Movies:
Inception | SciFi | ⭐ 8.8 | 2010
Interstellar | SciFi | ⭐ 8.6 | 2014
▶️ How to Run
1. Compile
javac Main.java Movie.java MovieService.java
2. Run
java Main
📌 How It Works
Movies are stored in an ArrayList
User input drives filtering and recommendation
Sorting is done using comparator logic
CLI UI is enhanced using ANSI color codes
🎯 Learning Outcomes
Object-Oriented Programming (OOP)
CLI-based application development
Data filtering & searching algorithms
Clean code structuring
User interaction handling
🔥 Future Enhancements
📁 File-based storage (persistent data)
❤️ Favorites / Watchlist system
⭐ Smart recommendation (scoring algorithm)
🔍 Multi-genre filtering
🎨 Boxed UI design
🌐 API integration for real-time data
👨‍💻 Author

Dheeraj Parihar
Electronics & Telecommunication Engineering Student
Aspiring Entrepreneur & Developer
