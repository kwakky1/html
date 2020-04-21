package com.occamasrazor.web.grade;

public interface GradeService {
	public void add(Grade grade);
	public Grade[] list();
	public Grade detail(Grade grade);
	public Grade total(Grade grade);
	public Grade average(Grade grade);
	public Grade score(Grade grade);
	public void update(Grade grade);
	public void delete(Grade grade);
}
