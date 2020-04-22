package com.occamasrazor.web.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.occamasrazor.web.util.Credit;
import com.occamasrazor.web.util.Messenger;

@RestController
@RequestMapping("/grade")
public class GradeController {
	@Autowired GradeService gradeService;
	
	@PostMapping("/register")
	public Messenger register(@RequestBody Grade grade) {
		Messenger messenger = null;
		int current = gradeService.count();
		gradeService.add(grade);
		return (gradeService.count() == (current+1))? messenger.SUCCESS
				:messenger.FAIL;
	}
	@PostMapping("/addition")
	public Messenger add(@RequestBody Grade grade) {
		Messenger add =null;
		int current =0;
		return add;
		
	}
	
	@GetMapping("/add/{userid}") // path
	public Credit confirm(@PathVariable String userid) {
		return gradeService.detail(userid);
	}
	
}
