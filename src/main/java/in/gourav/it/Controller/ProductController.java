package in.gourav.it.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.gourav.it.entity.Product;

@Controller
public class ProductController {
	
	@GetMapping("/")
	public String loadform(Model model) {
		model.addAttribute("product", new Product());
		return "index";
	}

}
