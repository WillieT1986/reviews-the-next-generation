package org.wecancodeit.columbus.reviewsthenextgeneration;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private long id;
	private String tagName;

	@JsonIgnore
	@ManyToMany(mappedBy = "tags")
	private Collection<Review> reviews;

	private Collection<Tag> tags;

	public Tag() {
	}

	public Tag(String tagName) {
		this.tagName = tagName;
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

	public String addTag(Tag tag) {
		if (!(tags.contains(tag))) {
			tags.add(tag);
			return "added";
		} else {
			return "duplicate";
		}
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