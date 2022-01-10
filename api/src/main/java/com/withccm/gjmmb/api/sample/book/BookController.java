package com.withccm.gjmmb.api.sample.book;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.withccm.gjmmb.core.sample.book.Book;
import com.withccm.gjmmb.core.sample.book.BookRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BookController {

	private final BookRepository bookRepository;

	@GetMapping("/books")
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

	@PostMapping("/books")
	public void postBook(@RequestBody Book book) {
		bookRepository.save(book);
	}

	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable Integer id) {
		return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("not found book"));
	}

	@PutMapping("/books/{id}")
	public void putBook(@PathVariable Integer id, @RequestBody Book book) {
		book.setId(id);
		bookRepository.save(book);
	}

	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable Integer id) {
		bookRepository.deleteById(id);
	}
}
