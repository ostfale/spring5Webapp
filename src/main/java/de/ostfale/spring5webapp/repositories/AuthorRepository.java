package de.ostfale.spring5webapp.repositories;

import de.ostfale.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by usauerbrei on 16.02.2018
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
