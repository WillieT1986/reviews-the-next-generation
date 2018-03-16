package org.wecancodeit.columbus.reviewsthenextgeneration;

import static java.util.Arrays.asList;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private long id;

	@ManyToOne
	private Category category;

	@ManyToMany
	private Collection<Tag> tags;

	private String title;

	public Review() {
	}

	public Review(Category category, String title, Tag... tags) {
		this.category = category;
		this.title = title;
		this.tags = new HashSet<>(asList(tags));
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
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
		return id == ((Review) obj).id;
	}

	public Object getTags() {
		return null;
	}
}