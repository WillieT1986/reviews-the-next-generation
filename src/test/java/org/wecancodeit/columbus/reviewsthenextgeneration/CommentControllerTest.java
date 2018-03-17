package org.wecancodeit.columbus.reviewsthenextgeneration;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.ui.Model;

public class CommentControllerTest {

	@InjectMocks
	private CommentController underTest;

	@Mock
	private CommentRepository commentRepo;

	@Mock
	private Comment comment1;
	@Mock
	private Comment comment2;

	@Mock
	private ReviewRepository reviewRepo;

	@Mock
	private Model model;

	// @Before
	// public void setup() {
	// MockitoAnnotations.initMocks(this);
	// }
	//
	// @Test
	// public void shouldAddASingleCourseToModel() {
	// Long courseId = 1L;
	// when(courseRepo.findOne(courseId)).thenReturn(course1);
	// underTest.findOneCourse(courseId, model);
	// verify(model).addAttribute("courses", course1);
	// }
	//
	// @Test
	// public void shouldReturnASingleCourse() {
	// String template = underTest.findOneCourse(1L, model);
	// assertThat(template, is("course"));
	// }
	//
	// @Test
	// public void shouldReturnAllCourses() {
	// Collection<Course> allCourses = Arrays.asList(course1, course2);
	// when(courseRepo.findAll()).thenReturn(allCourses);
	// underTest.findAllCourses(model);
	// verify(model).addAttribute("courses", allCourses);
	// }

}
