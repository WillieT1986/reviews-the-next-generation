package org.wecancodeit.columbus.reviewsthenextgeneration;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Category {

	@Id
	@GeneratedValue
	private long id;

	public Category() {

	}

	public Category(String string) {

	}

	public long getId() {
		return id;
	}

}
