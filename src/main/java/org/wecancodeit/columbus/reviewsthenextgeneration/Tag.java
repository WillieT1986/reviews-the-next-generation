package org.wecancodeit.columbus.reviewsthenextgeneration;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Tag {

	@Id
	@GeneratedValue
	private long id;

	public Tag() {

	}

	public Tag(String string) {
	}

	public long getId() {
		return id;
	}

}
