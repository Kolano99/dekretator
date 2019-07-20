package com.example.helloworld.RestApp;

import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/*@Controller
public class FileDownloadController {
	@RequestMapping(value = "/files/", method =  RequestMethod.GET)
	@ResponseBody
	public FileSystemResource getFile(@RequestParam("pierwszy_dekret") String pierwszyDekret){
		//iText
		return new FileSystemResource("C:\\Users\\Bracia\\IdeaProjects\\dekretator\\src\\main\\resources\\sample.pdf");
	}
}*/
@Controller
public class FileDownloadController {
	@GetMapping(value = "/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
}
