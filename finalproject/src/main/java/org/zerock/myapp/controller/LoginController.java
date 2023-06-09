package org.zerock.myapp.controller;

import javax.inject.Inject;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.myapp.domain.LoginDTO;
import org.zerock.myapp.domain.LoginVO;
import org.zerock.myapp.exception.ControllerException;
import org.zerock.myapp.service.LoginService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor

@RequestMapping("/user")
@Controller
public class LoginController {	
	
	private LoginService service;
	
	@Inject
	BCryptPasswordEncoder bcryptPasswordEncoder;
	
	@GetMapping("/join")
	public void join() {
		log.info("join() invoked.");
	}	//join
	
	@GetMapping("/login")
	public void login() {
		log.info("login() invoked.");
	}	//login
	
	
	@PostMapping("/loginPost")
	public String loginPost(LoginDTO dto, RedirectAttributes rttrs, Model model) throws ControllerException{
		log.trace("loginPost({}, {}, {}) invoked.",dto, rttrs, model);
		
		try {
			LoginVO vo = this.service.login(dto);
			log.info("\t+vo:{}", vo);
			
			// 로그인 vo가 null 이고 입력한 비밀번호와 DB에 저장된 비밀번호가 일치할 시 로그인가능 (matches 메소드 활용)
			if(vo != null && bcryptPasswordEncoder.matches(dto.getPassword(), vo.getPassword())) {	
				
				model.addAttribute("__AUTH__",vo);	
				
				return "/index";	 
				
			} else {
				
				rttrs.addFlashAttribute("result", "회원정보가 존재하지 않습니다.");
				
				return "redirect:/user/login";	
				
			}	//if-else
			
		} catch(Exception e) {
			throw new ControllerException(e);
		}	// try-catch
		
	}	// loginPost
	
	
	@GetMapping("/logout")
	public void dummyLogout() {
		
		log.trace("dummyLogout() invoked.");
		
		}	//logout
	
}	// end class