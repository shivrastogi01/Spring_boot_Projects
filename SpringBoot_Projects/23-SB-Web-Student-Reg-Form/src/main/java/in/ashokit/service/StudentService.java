package in.ashokit.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Student;
import in.ashokit.entity.StudentEntity;
import in.ashokit.repositories.CoursesRepository;
import in.ashokit.repositories.GendersRepository;
import in.ashokit.repositories.StudentRepository;
import in.ashokit.repositories.TimingsRepository;

@Service
public class StudentService {

	@Autowired
	private GendersRepository gendersRepo;

	@Autowired
	private CoursesRepository coursesRepo;

	@Autowired
	private TimingsRepository timingRepo;

	@Autowired
	private StudentRepository studentRepo;

	public List<String> getGenders() {
		// List<Gender> findAll = gendersRepo.findAll();

		/*
		 * List<String> genders = new ArrayList(); for(Gender g : findAll) {
		 * genders.add(g.getGenderName()); }
		 */

		/*
		 * List<String> genders = findAll.stream() .map(gender ->
		 * gender.getGenderName()) .collect(Collectors.toList());
		 */

		List<String> genders = gendersRepo.getGenderNames();

		return genders;
	}

	public List<String> getCourses() {
		List<String> courseNames = coursesRepo.getCourseNames();
		return courseNames;
	}

	public List<String> getTimings() {
		List<String> timings = timingRepo.getTimings();
		return timings;
	}

	public boolean saveStudent(Student student) {

		StudentEntity entity = new StudentEntity();
		BeanUtils.copyProperties(student, entity);

		StudentEntity save = studentRepo.save(entity);

		return save != null & save.getStudentId() != null;
	}
}
