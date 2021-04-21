package com.Anvesh.SpringApp.Repository;

import com.Anvesh.SpringApp.Domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {
}
