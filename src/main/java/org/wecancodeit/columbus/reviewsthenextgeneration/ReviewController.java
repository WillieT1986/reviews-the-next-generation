package org.wecancodeit.columbus.reviewsthenextgeneration;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	private ReviewRepository reviewRepo;

	@Resource
	private CategoryRepository categoryRepo;

	@Resource
	private TagRepository tagRepo;

	@RequestMapping(value = "reviews")
	public String getAllReviews(@RequestParam Long id, Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	@RequestMapping("review")
	public String getAReview(@RequestParam Long id, Model model) {
		model.addAttribute("review", reviewRepo.findOne(id));
		return "review";
	}

	@RequestMapping(value = "categories")
	public String getAllCategories(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "categories";
	}

	@RequestMapping("category")
	public String getACategory(@RequestParam Long id, Model model) {
		model.addAttribute("category", categoryRepo.findOne(id));
		return "category";
	}

	@RequestMapping(value = "tags")
	public String getAllTags(Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		return "tags";
	}

	@RequestMapping("tag")
	public String getATag(@RequestParam Long id, Model model) {
		model.addAttribute("tag", tagRepo.findOne(id));
		return "tag";
	}

	@RequestMapping("/tag/{id}")
	public String showTag(@PathVariable Long id, Model model) {
		model.addAttribute("currentTagId", tagRepo.findOne(id));
		return "tag";
	}

}