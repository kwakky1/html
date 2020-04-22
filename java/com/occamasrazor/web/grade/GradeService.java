package com.occamasrazor.web.grade;

import com.occamasrazor.web.util.Credit;

public interface GradeService {
	public void add(Grade grade);
	public Grade[] list();
	public int count();
	public Credit detail(String userid);
	public void update(Grade grade);
	public void delete(Grade grade);
}
