package com.occamasrazor.web.lotto;
import java.util.Random;
import org.springframework.stereotype.Service;

import com.occamasrazor.web.util.LottoResult;
import com.occamasrazor.web.util.Messenger;

@Service
public class LottoServiceImpl implements LottoService {
	private Lotto[] lottos;
	private int[] numbers;
	private int count;
	private Random random;
	public LottoServiceImpl() {
		lottos = new Lotto[6];
		count = 0;
		random = new Random();
		numbers = new int[6];
	}
	@Override
	public void add(Lotto lotto) {
		lottos[count] = lotto;
		count++;
	}
	
	@Override
	public Lotto[] numbers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return count;
	}
	@Override
	public LottoResult compare(Lotto lotto) {
		LottoResult lottoResult = null; 
		String[] lottoNumber = lotto.getLotto().split(",");
		int [] randomNumber = random();
		int count=0;
		for(int i =0; i < randomNumber.length ; i++) {
				for(int j = 0; j< lottoNumber.length; j++) {
					if(randomNumber[i] == Integer.parseInt(lottoNumber[j])) {
						count++;
					}
				}
			}
			switch(count) {
			case 6: lottoResult = LottoResult.FIRST; break;
			case 5: lottoResult = LottoResult.SECOND; break;
			case 4: lottoResult = LottoResult.THRID; break;
			default : lottoResult = LottoResult.FAIL; break;
				}
			return lottoResult;
		}
	
		
	@Override
	public int[] random() {
		for(int i=0;i<count;i++) {
			numbers[i] = random.nextInt(45)+1;
		}
		return numbers;
	}


}
