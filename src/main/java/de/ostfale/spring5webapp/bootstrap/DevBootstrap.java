package de.ostfale.spring5webapp.bootstrap;

import de.ostfale.spring5webapp.model.Author;
import de.ostfale.spring5webapp.model.Book;
import de.ostfale.spring5webapp.model.Publisher;
import de.ostfale.spring5webapp.repositories.AuthorRepository;
import de.ostfale.spring5webapp.repositories.BookRepository;
import de.ostfale.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by usauerbrei on 16.02.2018
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;

	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		initData();
	}

	private void initData() {
		// Eric
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "1234");
		Publisher hc = new Publisher("Harper Collins", "New York");

		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		ddd.setPublisher(hc);

		authorRepository.save(eric);
		publisherRepository.save(hc);
		bookRepository.save(ddd);


		// Rod
		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Development", "2344");
		Publisher worx = new Publisher("Worx", "Boston");
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);
		noEJB.setPublisher(worx);

		authorRepository.save(rod);
		publisherRepository.save(worx);
		bookRepository.save(noEJB);
	}
}
