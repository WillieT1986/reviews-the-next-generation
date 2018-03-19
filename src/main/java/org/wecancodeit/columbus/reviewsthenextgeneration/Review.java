package org.wecancodeit.columbus.reviewsthenextgeneration;

import static java.util.Arrays.asList;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private long id;

	@JsonIgnore
	@OneToMany(mappedBy = "review")
	private Collection<Comment> comments;

	@JsonIgnore
	@ManyToOne
	private Category category;

	@JsonIgnore
	@ManyToMany
	private Collection<Tag> tags;

	@Lob
	private String description;
	private String title;
	private String imageUrl;

	public Review() {
	}

	public Review(Category category, String title, String imageUrl, String description, Tag... tags) {
		this.category = category;
		this.title = title;
		this.imageUrl = imageUrl;
		this.description = description;
		this.tags = new HashSet<>(asList(tags));
	}

	// public Review(Comment... comments) {
	// this.comments = new HashSet<>(asList(comments));
	// }

	public Collection<Tag> getTags() {
		return tags;
	}

	public Collection<Comment> getComments() {
		return comments;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getDescription() {
		return description;
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
}