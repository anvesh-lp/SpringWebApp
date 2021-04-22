package com.Anvesh.SpringApp.Controllers;


import com.Anvesh.SpringApp.Repository.BookRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private final BookRepo bookrepository;

    public BookController(BookRepo bookrepository) {
        this.bookrepository = bookrepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookrepository.findAll());
        return "books/list";
    }
}
