package guru.springframework.spring5jokesappsv2.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5jokesappsv2.services.JokeService;

public class JokeController {
	
	private final JokeService jokeService;

public JokeController(JokeService jokeService) {
	this.jokeService = jokeService;
}

@RequestMapping({"/",""})
public String showJoke(Model model) {
	model.addAttribute("joke",jokeService.getJoke());
	return "index";
	
}
	

}
