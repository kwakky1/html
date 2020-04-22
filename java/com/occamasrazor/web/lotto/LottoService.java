package com.occamasrazor.web.lotto;

public interface LottoService {
	public void add(Lotto lotto);
	public Lotto[] number();
	public int count();
	public void update(Lotto lotto);
	public void delete(Lotto lotto);
}
