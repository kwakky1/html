package com.occamasrazor.web.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.occamasrazor.web.util.Messenger;

@RestController
@RequestMapping("/member")
public class MemberController {
	@Autowired MemberService memberService;
	
	@PostMapping("/join")
	public Messenger add(@RequestBody Member member) {
		int current = memberService.count();
		memberService.add(member);
		return (memberService.count()==(current+1))? Messenger.SUCCESS : Messenger.FAIL; 
	}
	@PostMapping("/login")
	public Messenger login(@RequestBody Member member) {
		return (memberService.login(member))? Messenger.SUCCESS : Messenger.FAIL;
	}
	@GetMapping("/list")
	public Member[] list() {
		Member[] members = new Member[5];
		return members;
	}
	@GetMapping("/detail")
	public Member detail(@RequestBody Member member) {
		Member detailMember = new Member();
		return detailMember;
	}
	@GetMapping("/count")
	public int count() {
		int countMember = 0;
		return countMember;
	}
	@PutMapping("/update")
	public Member update(@RequestBody Member member) {
		Member update = new Member();
		return update;
	}
	@DeleteMapping("/delete")
	public Member delete(@RequestBody Member member) {
		Member delete = new Member();
		return delete;
	}
}
