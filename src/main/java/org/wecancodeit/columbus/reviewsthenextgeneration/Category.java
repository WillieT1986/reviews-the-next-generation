package org.wecancodeit.columbus.reviewsthenextgeneration;

import java.util.Collection;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Category {

	@Id
	@GeneratedValue
	private long id;

	@OneToMany(mappedBy = "category")
	private Collection<Review> reviews;

	private String categoryName;

	public Category() {

	}

	public Category(String categoryName) {
		this.categoryName = categoryName;
	}

	public long getId() {
		return id;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}

}
