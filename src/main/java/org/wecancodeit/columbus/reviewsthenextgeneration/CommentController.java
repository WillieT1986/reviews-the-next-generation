package org.wecancodeit.columbus.reviewsthenextgeneration;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommentController {
	@Resource
	CommentRepository commentRepo;

	@Resource
	ReviewRepository reviewRepo;

	@RequestMapping("/comment")
	public String findOneComment(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("comments", commentRepo.findOne(id));
		return "comment";
	}
}
