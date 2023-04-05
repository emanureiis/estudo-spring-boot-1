package clinica.java.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Indica que esta classe é do tipo Controller
@RequestMapping("/hello") //Indica a solicição HTTP 
public class HelloController {

	@GetMapping //Invoca o método quando recebe requisições get
	public String helloWord() {
		return "Olá mundo";
	}
}
