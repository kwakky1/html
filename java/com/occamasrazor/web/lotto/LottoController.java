package com.occamasrazor.web.lotto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.occamasrazor.web.util.Messenger;

@RestController
@RequestMapping("/lotto")
public class LottoController {
	@Autowired LottoService lottoService;
	@PostMapping("/buy")
	public void buy(@RequestBody Lotto lotto) {
		lottoService.add(lotto);
	}
}
