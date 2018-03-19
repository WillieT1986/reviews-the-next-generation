package org.wecancodeit.columbus.reviewsthenextgeneration;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TagRestController {
	@Resource
	ReviewRepository reviewRepo;

	@Resource
	TagRepository tagRepo;
}
