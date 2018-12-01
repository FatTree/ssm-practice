package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class loginController {
	@GetMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView modelandview = new ModelAndView();
		
		return modelandview;
	}
	@PostMapping("/select")
	public Map<String, String> select(String memberId, String password) {
		Map<String, String> result = new HashMap<>();
		return result;
	}
	
	@PostMapping("/create")
	public String create(String memberId, String checkName) {
		String result = "success!";
		return result;
	}
	
	@PostMapping("/delete")
	public String delete(String memberId, String checkName) {
		String result = "success!";
		return result;
	}
	
	@PostMapping("/update")
	public String update(String memberId, String checkName) {
		String result = "success!";
		return result;
	}
}
