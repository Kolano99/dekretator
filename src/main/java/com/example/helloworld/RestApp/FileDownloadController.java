package com.example.helloworld.RestApp;

import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class FileDownloadController {
	@RequestMapping(value = "/files/{file_name}", method =  RequestMethod.GET)
	@ResponseBody
	public FileSystemResource getFile(@PathVariable("file_name") String fileName){
		return new FileSystemResource("C:\\Users\\Janek\\IdeaProjects\\RestApp\\src\\main\\resources\\sample.pdf");
	}
}
