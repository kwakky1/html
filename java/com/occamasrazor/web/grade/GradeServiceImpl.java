package com.occamasrazor.web.grade;

public class GradeServiceImpl implements GradeService {
	private Grade[] grades;
	private int count;
	public GradeServiceImpl() {
		grades = new Grade[5];
		count = 0;
	}
	@Override
	public void add(Grade grade) {
		grades[count]=grade;
		count++;
	}

	@Override
	public Grade[] list() {
		Grade[] grades = null;
		
		return grades;
	}

	@Override
	public Grade detail(Grade grade) {
		Grade detail = new Grade();
		for(int i=0;i<count;i++) {
			if(grade.getUserid().equals(grades[i].getUserid())) {
				detail = grades[i];
				break;
			}
		}
		return detail;
	}

	@Override
	public Grade total(Grade grade) {
		Grade total = new Grade();
		return total;
	}

	@Override
	public Grade average(Grade grade) {
		Grade average = new Grade();
		return average;
	}

	@Override
	public Grade score(Grade grade) {
		Grade score = new Grade();
		return score;
	}

	@Override
	public void update(Grade grade) {
	}

	@Override
	public void delete(Grade grade) {
		
	}

}
