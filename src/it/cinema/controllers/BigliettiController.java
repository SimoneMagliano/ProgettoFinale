package it.cinema.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


import it.cinema.entity.Biglietti;
import it.cinema.entity.Cinema;
import it.cinema.entity.Film;
import it.cinema.service.BigliettiService;
import it.cinema.service.CinemaService;
import it.cinema.service.FilmService;

@Controller
@Scope("session")
@SessionAttributes("Biglietti")
@RequestMapping("/biglietti")
public class BigliettiController {

	@Autowired
	private FilmService filmService;
	@Autowired
	private CinemaService cinemaService;
	@Autowired
	private BigliettiService bigliettiService;
	
	
	@GetMapping("/list")
	public String listBiglietti(Model theModel) {		
		List<Biglietti> BigliettiList = bigliettiService.getList();
		theModel.addAttribute("biglietti", BigliettiList);
		return "list-interventi";
	}
	
	@GetMapping("/delete")
	public String deleteBiglietti(@RequestParam("CodOperazione") int theCodOperazione) {
		bigliettiService.deleteBiglietto(theCodOperazione);
		return "redirect:/biglietti/list";
	}
	@GetMapping("/showFormUpdateBiglietto")
	public String showFormUpdateBiglietto(@RequestParam("codOperazione") int theCodOperazione,
									Model theModel) {
		List<Film> filmList = filmService.getList();
		Biglietti biglietti = bigliettiService.getBiglietto(theCodOperazione);	
		List<Cinema> cinemaList = cinemaService.getList();
		theModel.addAttribute("biglietti", biglietti);
		theModel.addAttribute("cinema", cinemaList);
		theModel.addAttribute("film", filmList);

		return "home";
	}
	@PostMapping("/saveBiglietti")
	public String saveBiglietti(@ModelAttribute("biglietti") Biglietti biglietti, @RequestParam("codOperazione") int theCodOperazione,
			@RequestParam("codCinema") String codCinema, @RequestParam("codFilm") int codFilm ) {
		Film film = filmService.getFilm(codFilm);
		bigliettiService.saveBiglietto(biglietti);		
		return "redirect:/interventi/list";
	}
	@GetMapping("/showFormAddBiglietti")
	public String showFormAddBiglietti(Model theModel) {
		List<Cinema> cinemaList = cinemaService.getList();
		List<Film> filmList = filmService.getList();
		List<Biglietti> bigliettiList = bigliettiService.getList();
		Biglietti theBiglietti = new Biglietti();	
		theModel.addAttribute("biglietti", theBiglietti);
		theModel.addAttribute("Cinema", cinemaList);
		theModel.addAttribute("Film", filmList);	

		return "home";
	}
	
	
}
