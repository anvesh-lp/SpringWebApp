package com.Anvesh.SpringApp.BootStart;

import com.Anvesh.SpringApp.Domain.Author;
import com.Anvesh.SpringApp.Domain.Book;
import com.Anvesh.SpringApp.Domain.Publisher;
import com.Anvesh.SpringApp.Repository.AuthorRepo;
import com.Anvesh.SpringApp.Repository.BookRepo;
import com.Anvesh.SpringApp.Repository.PublisherRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepo authorrepository;
    private final BookRepo bookrepository;
    private final PublisherRepo publisherrepository;

    public BootStrapData(AuthorRepo authorrepository, BookRepo bookrepository, PublisherRepo publisherrepository) {
        this.authorrepository = authorrepository;
        this.bookrepository = bookrepository;
        this.publisherrepository = publisherrepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author a1 = new Author("Anvesh", "Kunuguntla");
        Book b1 = new Book("Harry Potter", "#####");
        Publisher p1 = new Publisher("anvesh", "London", "manchester", "London", "####");
        publisherrepository.save(p1);
        a1.getBooks().add(b1);
        b1.getAuthors().add(a1);
        b1.setPublisher(p1);
        p1.getBooks().add(b1);
        authorrepository.save(a1);
        bookrepository.save(b1);
        publisherrepository.save(p1);

        Author a2 = new Author("Anvesh", "Kunuguntla");
        Book b2 = new Book("Harry Potter", "#####");

        b2.setPublisher(p1);
        p1.getBooks().add(b2);
        authorrepository.save(a2);
        bookrepository.save(b2);
        publisherrepository.save(p1);
        System.out.println("No of Books " + bookrepository.count());
        System.out.println("No of Publishers " + publisherrepository.count());

    }
}

