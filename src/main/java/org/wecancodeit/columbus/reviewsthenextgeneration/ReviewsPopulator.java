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

		reviewRepo.save(new Review(anime, "Fairy Tail (2014)", "./images/fairy.jpg",
				"The #1 Wizard Guild isn�t only known for being Destructive but also known for their kindness and being humble towards the people. "
						+ "They love a good fight as they go all out destroying their enemies more than what they need to. Natsu Dragneel along with the Ice Making "
						+ "Wizard Gray Fullbuster have just devastated the Championship and as they draw nearer to victory. It is all abruptly ended by a "
						+ "Dark Wizard in the shadows. A Gate the brings Dragons from the past lay waste to the lands as these two young Wizards along with their "
						+ "Guild save the Kingdom from complete annihilation.",
				tag1, tag2, tag3, tag7, tag10, tag16));

		reviewRepo.save(new Review(anime, "Fullmetal Alchemist: Brotherhood", "./images/fullmetal.jpg",
				"The Law of Equivalent Exchange: \"In order for something to be obtained, something of equal value must be lost.\" This is law for Alchemist that "
						+ "two Brothers by the names of Edward and Alphonse Elric ignored while trying to bring their Mother back to life. The younger Brother lost his physical"
						+ " body while his old Brother lost his arm saving his brother�s life by placing his spiritual form within a suit of armor. They travel around seeking"
						+ " the philosopher's stone while at the same time unraveling their Countries darkest secrets. Between the search for a serial killer and time, the two"
						+ " brother�s hold onto doubt on whether or not they can fully become human again.",
				tag1, tag2, tag3, tag5, tag7, tag10, tag11, tag16));
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