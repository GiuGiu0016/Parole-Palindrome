package it.dstech.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
	
	@RequestMapping(value = "/testChiamata")
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model) {
	String[] nTermini = testo.split(" ");
	List<String> palindromi = new ArrayList<String>();
	int npalindromi = contaPalindromi(nTermini, palindromi);
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("risultato");
	modelAndView.addObject("nTermini", nTermini.length);
	modelAndView.addObject("npalindromi", npalindromi);
	modelAndView.addObject("palindromi", palindromi);	
	
	return modelAndView;
	}

	private int contaPalindromi(String[] nTermini, List<String> palindromi) {
		int npalindromi = 0;
		for (String parola : nTermini) {
			char[] caratteri = parola.toCharArray();
			if(palindroma(caratteri)) {
			palindromi.add(parola);
			npalindromi= npalindromi+1;
			}
		}
		return npalindromi;
	}
	
	public static boolean palindroma(char[] caratteri) {
		int i1 = 0;
		int i2 = caratteri.length - 1;
		while (i2>i1) {
	        if (caratteri[i1] != caratteri[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;	
		}
		return true;
	}
}
