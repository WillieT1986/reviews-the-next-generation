package org.wecancodeit.columbus.reviewsthenextgeneration;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class JpaMappingTest {

	@Resource
	private TestEntityManager entityManager;

	@Resource
	private ReviewRepository reviewRepo;

	@Resource
	private CategoryRepository categoryRepo;

	@Resource
	private TagRepository tagRepo;

	@Test
	public void shouldSaveAndLoadReview() {
		Review review = new Review(null, "Title");
		review = reviewRepo.save(review);
		long reviewId = review.getId();

		entityManager.flush();
		entityManager.clear();

		review = reviewRepo.findOne(reviewId);
		assertThat(review.getTitle(), is("Title"));
	}

	@Test
	public void shouldSaveReviewToCategoryRelationship() {
		Category category = new Category("Anime");
		categoryRepo.save(category);
		long categoryId = category.getId();

		Review first = new Review(category, "Title");
		first = reviewRepo.save(first);

		Review second = new Review(category, "Title");
		second = reviewRepo.save(second);

		entityManager.flush();
		entityManager.clear();

		category = categoryRepo.findOne(categoryId);
		assertThat(category.getReviews(), containsInAnyOrder(first, second));
	}

	@Test
	public void shouldSaveAndLoadTag() {
		Tag tag = tagRepo.save(new Tag("tagName"));
		long tagId = tag.getId();

		entityManager.flush();
		entityManager.clear();

		tag = tagRepo.findOne(tagId);
		assertThat(tag.getTagName(), is("tagName"));
	}

	@Test
	public void shouldEstablishReviewToTagRelationships() {
		Tag java = tagRepo.save(new Tag("Java"));
		Tag ruby = tagRepo.save(new Tag("Ruby"));

		Review review = new Review(null, "Review Name", java, ruby);
		review = reviewRepo.save(review);
		long reviewName = review.getId();

		review = reviewRepo.findOne(reviewName);
		assertThat(review.getTags(), containsInAnyOrder(java, ruby));
	}

	@Test
	public void shouldEstablishTagToReviewsRelationship() {
		Tag tag = tagRepo.save(new Tag("Ruby"));
		long tagId = tag.getId();

		Review reviewNameOne = new Review(null, "reviewNameOne", tag);
		reviewNameOne = reviewRepo.save(reviewNameOne);

		Review reviewNameTwo = new Review(null, "reviewNameTwo", tag);
		reviewNameTwo = reviewRepo.save(reviewNameTwo);

		entityManager.flush();
		entityManager.clear();

		tag = tagRepo.findOne(tagId);
		assertThat(tag.getReviews(), containsInAnyOrder(reviewNameOne, reviewNameTwo));
	}

	@Test
	public void shouldReturnReviewNameImageAndDescription() {
		Tag tag = tagRepo.save(new Tag("Ruby"));

		Review underTest = new Review(null, "Title", "imageUrl", "Description", tag);
		String check = underTest.getTitle();
		String check2 = underTest.getImageUrl();
		String check3 = underTest.getDescription();

		assertEquals(check, "Title");
		assertEquals(check2, "imageUrl");
		assertEquals(check3, "Description");
	}
}