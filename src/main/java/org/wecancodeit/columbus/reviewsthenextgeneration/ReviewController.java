package org.wecancodeit.columbus.reviewsthenextgeneration;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller
public class ReviewController {

	@Resource
	private ReviewRepository reviewRepo;

	@Resource
	private CategoryRepository categoryRepo;

	@Resource
	private TagRepository tagRepo;

}