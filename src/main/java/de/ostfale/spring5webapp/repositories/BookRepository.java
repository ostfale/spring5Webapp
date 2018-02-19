package de.ostfale.spring5webapp.repositories;

import de.ostfale.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by usauerbrei on 16.02.2018
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
