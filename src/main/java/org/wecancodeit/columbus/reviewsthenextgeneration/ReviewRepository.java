package org.wecancodeit.columbus.reviewsthenextgeneration;

import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long> {
	// Review findByName(String reviewTitle);
}
