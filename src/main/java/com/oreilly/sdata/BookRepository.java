package com.oreilly.sdata;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	//String operators

	public List<Book> findByTitle(String title);

	public List<Book> findByTitleLike(String title);

	public List<Book> findByTitleContaining(String title);

	public List<Book> findByTitleStartingWith(String title);

	public List<Book> findByTitleEndingWith(String title);

	public List<Book> findByTitleIgnoreCase(String title);

// Transversing Nested Properties

	public List<Book> findByPageCountEquals(int pageCount);

	public List<Book> findByPageCountGreaterThan(int pageCount);

	public List<Book> findByPageCountLessThan(int pageCount);

	public List<Book> findByPageCountGreaterThanEqual(int pageCount);

	public List<Book> findByPageCountLessThanEqual(int pageCount);

	public List<Book> findByPageCountBetween(int min, int max);

// Ordering  Results

	public List<Book> findByTitleContainingOrderByTitleAsc(String title);

	public List<Book> findByTitleContainingOrderByTitleDesc(String title);

	//Logical operators
	public List<Book> findByTitleContainingOrTitleContaining(String title, String title2);

	public List<Book> findByTitleContainingAndPageCountGreaterThan(String title, int pageCount);

	public List<Book> findByTitleNot(String title);

// Limiting query results

	public List<Book> findTopByOrderByPageCountDesc();

	public List<Book> findFirstByOrderByPageCountAsc();

	public List<Book> findTop5ByOrderByPriceDesc();

	public List<Book> findTop5ByTitleOrderByPriceAsc(String title);

}
