package de.ostfale.spring5Webapp.repositories;

import de.ostfale.spring5Webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by usauerbrei on 16.02.2018
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
