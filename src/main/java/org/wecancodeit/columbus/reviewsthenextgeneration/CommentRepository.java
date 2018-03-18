package org.wecancodeit.columbus.reviewsthenextgeneration;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {

	Comment findByName(String name);

	Collection<Comment> findByReview(Review review);
	// Collection<Comment> findAllByOrderByNameAsc();
}