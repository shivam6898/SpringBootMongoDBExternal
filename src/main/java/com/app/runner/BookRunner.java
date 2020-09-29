package com.app.runner;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.app.document.Book;
import com.app.repo.BookRepository;
@Component
public class BookRunner implements CommandLineRunner {
	@Autowired
	private BookRepository repo;
	@Override
	public void run(String... args) throws Exception {
		//repo.deleteAll();
		repo.save(new Book("REDR", "Uday Kumar", 45.76,
				Arrays.asList("A1","A2"), new String[]{"A","B","C"}));
		repo.save(new Book("REDS", "Venkat Reddy", 85.26,
				Arrays.asList("B1","B2"), new String[]{"X","Y","Z"}));
		repo.findAll().forEach(System.out::println);
		System.out.println("Completed");
	}
}