package org.wecancodeit.columbus.reviewsthenextgeneration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private long id;
	private String title;

	public Review() {

	}

	public Review(Category category, String title) {
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

}