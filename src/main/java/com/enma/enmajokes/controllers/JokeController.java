/**
 * 
 */
package com.enma.enmajokes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.enma.enmajokes.services.JokeService;

/**
 * created by Marius I. Grigoras
 * on 30 oct. 2023
 */

@Controller
public class JokeController {

	private final JokeService jokeService;

	@Autowired
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	
	@RequestMapping({"/", ""})
	public String showJoke(Model model) {
		model.addAttribute("joke",jokeService.getJoke());
		return "index";
	}
	
}
