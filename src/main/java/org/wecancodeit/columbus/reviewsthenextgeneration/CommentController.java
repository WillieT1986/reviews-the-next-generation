package org.wecancodeit.columbus.reviewsthenextgeneration;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller
public class CommentController {
	@Resource
	CommentRepository commentRepo;

	@Resource
	ReviewRepository reviewRepo;
}
