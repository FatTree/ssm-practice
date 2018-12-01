package controller;

import javax.annotation.Generated;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class memberController {
	@GetMapping("/member")
	public ModelAndView memberPage() {
		ModelAndView modelandview = new ModelAndView();
		
		return modelandview;
	}
}
