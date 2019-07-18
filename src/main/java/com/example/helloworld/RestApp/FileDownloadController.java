package com.example.helloworld.RestApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@Controller
public class FileDownloadController {
	@RequestMapping(value = "/files/{file_name}", method =  RequestMethod.GET)
	public void getFile(@PathVariable("file_name") String fileName, HttpServletResponse response) throws FileNotFoundException {
		File initialFile = new File("src/main/com/example/helloworld/RestApp/sample.pdf");
		InputStream targetStream = new FileInputStream(initialFile);

	}
}
