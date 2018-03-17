package org.wecancodeit.columbus.reviewsthenextgeneration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comment {

	@Id
	@GeneratedValue
	private long id;

	private String comment;

	public Comment(String comment, Review review) {
		this.comment = comment;
	}

	public String getComment() {
		return comment;
	}
}