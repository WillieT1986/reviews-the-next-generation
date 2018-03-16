package org.wecancodeit.columbus.reviewsthenextgeneration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private long id;
	private String tagName;

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

}
