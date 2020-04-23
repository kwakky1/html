package com.occamasrazor.web.lotto;

import com.occamasrazor.web.util.LottoResult;

public interface LottoService {
	public void add(Lotto lotto);
	public Lotto[] numbers();
	public int count();
	public LottoResult compare(Lotto lotto);
	public int[] random();
}
