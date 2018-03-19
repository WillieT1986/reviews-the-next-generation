package org.wecancodeit.columbus.reviewsthenextgeneration;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TagRestController {
	@Resource
	ReviewRepository reviewRepo;

	@Resource
	TagRepository tagRepo;

	@RequestMapping("/tag/{tagId}/addtag/{tagName}")
	public Tag addTagFromTags(@PathVariable Long tagId, @PathVariable String tagName) {
		Tag tag = tagRepo.findOne(tagId);
		Tag tag1 = tagRepo.findByNameIgnoreCase(tagName);

		if (tag1 == null) {
			tag1 = new Tag(tagName);
			tagRepo.save(tag1);
		}
		String result = tag.addTag(tag1);
		tagRepo.save(tag);
		if (result.equals("added")) {
			return tag1;
		} else {
			return null;
		}
	}

}
