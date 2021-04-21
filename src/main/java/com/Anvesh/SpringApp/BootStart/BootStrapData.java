package com.Anvesh.SpringApp.BootStart;

import com.Anvesh.SpringApp.Domain.Author;
import com.Anvesh.SpringApp.Domain.Book;
import com.Anvesh.SpringApp.Repository.AuthorRepo;
import com.Anvesh.SpringApp.Repository.BookRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepo authorrepository;
    private final BookRepo bookrepository;

    public BootStrapData(AuthorRepo authorrepository, BookRepo bookrepository) {
        this.authorrepository = authorrepository;
        this.bookrepository = bookrepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author a1 = new Author("Anvesh", "Kunuguntla");
        Book b1 = new Book("Harry Potter", "#####");
        a1.getBooks().add(b1);
        b1.getAuthors().add(a1);
        authorrepository.save(a1);
        bookrepository.save(b1);
        Author a2 = new Author("Anvesh", "Kunuguntla");
        Book b2 = new Book("Harry Potter", "#####");
        authorrepository.save(a2);
        bookrepository.save(b2);

        System.out.println("No of Books " + bookrepository.count());


    }
}

