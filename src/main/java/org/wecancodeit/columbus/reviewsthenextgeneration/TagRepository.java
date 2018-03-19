package org.wecancodeit.columbus.reviewsthenextgeneration;

import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Long> {

	Tag findByNameIgnoreCase(String tagName);

}
