package nl.ginger.librarywebsite.presentation.controller;

import nl.ginger.library.domain.entities.Book;
import nl.ginger.library.domain.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/{isbn}")
    public String getBook(@PathVariable String isbn, Model model) {

        Book book = bookService.getBook(isbn).orElseThrow();
        model.addAttribute("book", book);
        return "book";
    }


}