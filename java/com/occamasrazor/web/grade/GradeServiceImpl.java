package com.occamasrazor.web.grade;

import org.springframework.stereotype.Service;

import com.occamasrazor.web.util.Credit;

@Service
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
		return grades;
	}

	@Override
	public Credit detail(String userid) {
		Credit credit =null;
		switch(average(userid)/10) {
		case 10: case 9: credit = Credit.A;
			break;
		case 8: credit = Credit.B;
			break;
		case 7: credit = Credit.C;
			break;
		case 6: credit = Credit.D;
			break;
		case 5: credit = Credit.E;
			break;
		case 4: credit = Credit.F;
			break;
		default : credit = Credit.F;
			break;
		}
		return credit;
	}

	

	private int average(String userid) {
		return total(userid)/4;
	}
	private int total(String userid) {
		int total =0;
		for(int i=0;i<count;i++) {
			if(userid.equals(grades[i].getUserid())) {
				total = Integer.parseInt(grades[i].getKorean())
						+Integer.parseInt(grades[i].getEnglish())
						+Integer.parseInt(grades[i].getMath())
						+Integer.parseInt(grades[i].getJava());
			}
		}
		return total;
	}
	
	@Override
	public void update(Grade grade) {
	}

	@Override
	public void delete(Grade grade) {
		
	}
	@Override
	public int count() {
		return count;
	}
	

}
