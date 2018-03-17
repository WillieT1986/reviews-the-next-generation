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

		reviewRepo.save(new Review(anime, "D.Gray-man", "./images/dman.jpg",
				"The Millenium Earl, a master of exploits while utilizing the souls of the dead trapped within Akuma plots the Destruction of the"
						+ " World. Under General Cross, the main protagonist Allen Walker uses his anti-Akuma weapon known as an innocence to fight against"
						+ " the Millenium Earls� Akuma in order to release their souls and free them from their entrapment so they may live in peace once"
						+ " and for all. At the same time, Allen Walker along with his friends must all land together in order to prevent the Destruction"
						+ " of the World.",
				tag1, tag2, tag3, tag4, tag16, tag17));

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