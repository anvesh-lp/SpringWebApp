package com.Anvesh.SpringApp.Repository;

import com.Anvesh.SpringApp.Domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {


}
