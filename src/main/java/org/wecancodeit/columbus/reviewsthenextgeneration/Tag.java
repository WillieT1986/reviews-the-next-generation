package org.wecancodeit.columbus.reviewsthenextgeneration;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private long id;
	private String tagName;
	private Review review;

	@ManyToMany(mappedBy = "tags")
	private Collection<Review> reviews;

	public Tag() {
	}

	public Tag(String tagName, Review review) {
		this.tagName = tagName;
		this.review = review;
	}

	public long getId() {
		return id;
	}

	public String getTagName() {
		return tagName;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}

	public Review getReview() {
		return review;
	}

	@Override
	public String toString() {
		return tagName;
	}

	@Override
	public int hashCode() {
		return ((Long) id).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		return id == ((Tag) obj).id;
	}
}