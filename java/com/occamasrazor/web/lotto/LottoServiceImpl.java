package com.occamasrazor.web.lotto;

import org.springframework.stereotype.Service;

@Service
public class LottoServiceImpl implements LottoService {
	private Lotto[] lottos;
	private int count;
	public LottoServiceImpl() {
		lottos = new Lotto[6];
		count = 0;
	}
	@Override
	public void add(Lotto lotto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Lotto[] number() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(Lotto lotto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Lotto lotto) {
		// TODO Auto-generated method stub
		
	}

}
