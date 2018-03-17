package org.wecancodeit.columbus.reviewsthenextgeneration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {

	@Id
	@GeneratedValue
	private long id;
	private String comment;

	@ManyToOne
	private Review review;

	public Comment(String comment, Review review) {
		this.comment = comment;
	}

	public String getComment() {
		return comment;
	}
}