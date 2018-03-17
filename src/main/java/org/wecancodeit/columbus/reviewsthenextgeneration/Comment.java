package org.wecancodeit.columbus.reviewsthenextgeneration;

import javax.persistence.Entity;

@Entity
public class Comment {

	private String comment;

	public Comment(String comment, Review review) {
		this.comment = comment;
	}

	public String getComment() {
		return comment;
	}
}
