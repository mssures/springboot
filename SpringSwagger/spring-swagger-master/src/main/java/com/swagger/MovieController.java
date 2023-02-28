package com.swagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/movies")
public class MovieController {

	private static List<Movie> Movies= new ArrayList<Movie>();
	
	@GetMapping
	public List<Movie> getMovies()
	{
		return Movies;
	}
	
	@PostMapping
	public Movie addMovies(@RequestBody Movie movie) {
		Movies.add(movie);
		return movie;
	}
}
