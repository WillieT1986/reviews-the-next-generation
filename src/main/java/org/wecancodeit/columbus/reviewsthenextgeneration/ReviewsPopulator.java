package org.wecancodeit.columbus.reviewsthenextgeneration;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;

public class ReviewsPopulator implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		@Resource
		private ReviewRepository reviewRepo;

		@Resource
		private CategoryRepository categoryRepo;

		@Resource
		private TagRepository tagRepo;

	}
}