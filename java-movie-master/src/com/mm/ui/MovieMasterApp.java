package com.mm.ui;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mm.db.DAO;
import com.mm.db.MovieDBDAO;
import com.mm.model.Movie;
import com.mm.db.MovieFileDAO;

import Util.MyConsole;

public class MovieMasterApp {
	
	//private static DAO<Movie> movieDAO = new MovieFileDAO();
	private static DAO<Movie> movieDAO = new MovieDBDAO();
	private static List<String> ratings = new ArrayList<>(Arrays.asList("G", "PG", "PG-13", "R", "NC-17"));

	public static void main(String[] args) {
		
		
		MyConsole.printHeader("Welcome to the MovieMaster App");
		
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = MyConsole.promptString("Enter command: ");
			switch (command) {
			case "all":
				displayAllMovies();
				break;
			case "add":
				AddMovie();
				break;
			case "del":
				deleteMovie();
				break;
			case "exit":
				break;
			default:
				MyConsole.printL("Invalid Option. Try again.");
				break;	
			
			}
		}
		MyConsole.printL("\nBye");
	}
	
	private static void displayAllMovies() {
		MyConsole.printHeader("Display Movies:", "+");
		//movieDAO.getAll().forEach(Movie::toString);
		movieDAO.getAll().forEach(movie -> MyConsole.printL(movie.toString()));
	}

	private static void AddMovie() {
		MyConsole.printHeader("Add Movie:", "+");
		int movieId = MyConsole.promptInt("Id: ");
		String title = MyConsole.promptString("Title: ");
		int year = MyConsole.promptInt("Year: ");
		String rating = MyConsole.promptString("Rating: ", ratings);
		String director = MyConsole.promptString("Director: ");
		movieDAO.add(new Movie(movieId, title, year, rating, director));
		MyConsole.printL("Movie added.");
	}

	private static void deleteMovie() {
		MyConsole.printHeader("Delete Movie:", "+");	
		MyConsole.printHeader("Delete Movie:", "+");
		int id = MyConsole.promptInt("Movie ID: ");
		movieDAO.delete(id);
		MyConsole.printL("Movie deleted.");
		
	}

	private static void displayMenu() {
		MyConsole.printL("Menue");
		MyConsole.printL("==================");
		MyConsole.printL("all - Get All Movie");
		MyConsole.printL("add - Add a Movie");
		MyConsole.printL("del - Delete a Movie");
		MyConsole.printL("exit");
	}
}
