package org.wecancodeit.columbus.reviewsthenextgeneration;

import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {

	// Comment findByName(String comment);
	// Collection<Comment> findByReview(Review review);
	// Collection<Comment> findAllByOrderByNameAsc();
}