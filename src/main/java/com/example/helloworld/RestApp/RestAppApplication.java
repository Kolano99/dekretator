package com.example.helloworld.RestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestAppApplication.class, args);
	}

	//Stronkę w thymeleafie z odpowiednią formą
	//żeby dodać iText dodaj do Poma odpowiednią zależność
	/*
	<!-- https://mvnrepository.com/artifact/com.itextpdf/itextpdf -->
		<dependency>
		    <groupId>com.itextpdf</groupId>
		    <artifactId>itextpdf</artifactId>
		    <version>5.5.13.1</version>
		</dependency>

	 */
	//https://www.tutorialspoint.com/itext/itext_overview.htm
	//jeżeli z iTextem będą problemy to korzystałem kiedyś z JasperReports i to jakoś działało
	//można tez użyć dowolnego programu i odpalać go z command line-a (tylko pamiętaj, że serwer będzie na linuxie)
	//jest tez opcja generacji wszystkiego po froncie https://stackoverflow.com/questions/742271/generating-pdf-files-with-javascript
	//na jsie byłoby o tyle fajnie, że nie potrzebujesz żadnego serwera - tylko static content

}
