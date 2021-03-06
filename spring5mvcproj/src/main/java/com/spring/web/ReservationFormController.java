package com.spring.web;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.spring.exception.ReservationNotAvailableException;
import com.spring.model.Player;
import com.spring.model.Reservation;
import com.spring.model.SportType;
import com.spring.service.ReservationService;
import com.spring.validator.ReservationValidator;

@Controller
@RequestMapping("/reservationForm")
@SessionAttributes("reservation")
public class ReservationFormController {
	
	private ReservationService reservationService;
    private ReservationValidator reservationValidator;
	
    public ReservationFormController(ReservationService reservationService, ReservationValidator reservationValidator) {
        this.reservationService = reservationService;
        this.reservationValidator = reservationValidator;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm( @RequestParam(required = false, value = "username") String username, Model model) {
	    Reservation reservation = new Reservation();
	    reservation.setPlayer(new Player(username, null));
	    model.addAttribute("reservation", reservation);
	    return "reservationForm";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(@ModelAttribute("reservation") @Validated  Reservation reservation, BindingResult result, SessionStatus status) {
	    if(result.hasErrors())
	    	return "reservationForm";
    	else {
	    	reservationService.make(reservation);
	    	status.setComplete();
		    return "redirect:reservationSuccess";
    	}
    }
	
    @ModelAttribute("sportTypes")
	public List<SportType> populateSportTypes() {
		return reservationService.getAllSportTypes();
	}
    
    @InitBinder("reservation")
    public void initBinder(WebDataBinder binder) {
    	/* binder.registerCustomEditor(LocalDate.class, "date",  new PropertyEditorSupport() {
             @Override
             public void setAsText(String text) throws IllegalArgumentException {
               LocalDate.parse(text, DateTimeFormatter.ISO_DATE);
             }
           });*/
    	 binder.setValidator(reservationValidator);
       }

    
   /* @ExceptionHandler(ReservationNotAvailableException.class)
    public String handleReservationException(ReservationNotAvailableException e) {
    	return "reservationNotAvailable";
    }
    
    @ExceptionHandler(Exception.class)
    public String handlenException(Exception e) {
    	return "error";
    }*/
    
}
