package org.wecancodeit.columbus.reviewsthenextgeneration;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewsPopulator implements CommandLineRunner {

	@Resource
	private ReviewRepository reviewRepo;

	@Resource
	private CategoryRepository categoryRepo;

	@Resource
	private TagRepository tagRepo;

	@Override
	public void run(String... args) throws Exception {
		Category anime = createCategory("Anime Reviews");
		Category manga = createCategory("Mange Reviews");

		Tag tag1 = createTag("Action");
		Tag tag2 = createTag("Adventure");
		Tag tag3 = createTag("Comedy");
		Tag tag4 = createTag("Demons");
		Tag tag5 = createTag("Drama");
		Tag tag6 = createTag("Ecchi");
		Tag tag7 = createTag("Fantasy");
		Tag tag8 = createTag("Game");
		Tag tag9 = createTag("Historical");
		Tag tag10 = createTag("Magic");
		Tag tag11 = createTag("Martial Arts");
		Tag tag12 = createTag("Military");
		Tag tag13 = createTag("Romance");
		Tag tag14 = createTag("Samurai");
		Tag tag15 = createTag("School");
		Tag tag16 = createTag("Shounen");
		Tag tag17 = createTag("Super Powers");

	}

	private Category createCategory(String catName) {
		Category c = new Category(catName);
		return categoryRepo.save(c);
	}

	private Tag createTag(String tagName) {
		Tag t = new Tag(tagName);
		return tagRepo.save(t);
	}
}