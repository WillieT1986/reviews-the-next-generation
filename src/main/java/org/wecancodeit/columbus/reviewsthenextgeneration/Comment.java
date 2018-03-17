package org.wecancodeit.columbus.reviewsthenextgeneration;

import javax.persistence.Entity;

@Entity
public class Comment {

	private String comment;

	public Comment(String comment) {
		this.comment = comment;
	}

	public String getComment() {
		return comment;
	}
}
