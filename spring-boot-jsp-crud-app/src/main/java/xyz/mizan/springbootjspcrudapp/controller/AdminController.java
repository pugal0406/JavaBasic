package xyz.mizan.springbootjspcrudapp.controller;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import xyz.mizan.springbootjspcrudapp.JWTUtility;
import xyz.mizan.springbootjspcrudapp.UserService;
import xyz.mizan.springbootjspcrudapp.entity.Employee;
import xyz.mizan.springbootjspcrudapp.entity.EmployeeSignUp;
import xyz.mizan.springbootjspcrudapp.entity.JwtRequest;
import xyz.mizan.springbootjspcrudapp.repository.EmployeeSignUpRepository;
import xyz.mizan.springbootjspcrudapp.service.EmployeeServiceImp;
import xyz.mizan.springbootjspcrudapp.service.EmployeeSignUpService;

@RestController
//@RequestMapping(value="/admin")
public class AdminController {

	@Autowired
	EmployeeSignUpService employeeSignUpService;

	@Autowired
	EmployeeSignUpRepository emprepo;
	
	 @Autowired
	    private AuthenticationManager authenticationManager;
	 
	 @Autowired
	    private UserService userService;
	 

	    @Autowired
	    private JWTUtility jwtUtility;



	@RequestMapping(value="/inPage", method=RequestMethod.GET)
	public ModelAndView addArticle() {
		ModelAndView model = new ModelAndView();
		EmployeeSignUp e = new EmployeeSignUp();
		model.addObject("employeeSignUpForm", e);

		model.setViewName("employee_signup");
		return model;
	}



	@RequestMapping(value="/emplogin", method=RequestMethod.GET)
	public ResponseEntity<EmployeeSignUp> loginPage() {
		return new ResponseEntity<EmployeeSignUp>(HttpStatus.OK);
		
	}


	@RequestMapping(value="/emplogin", method=RequestMethod.POST)
	public ResponseEntity<EmployeeSignUp> openPage(@RequestBody EmployeeSignUp employeeBO, HttpServletRequest request, HttpServletResponse res) throws ParseException, IOException {
		
//		EmployeeSignUp e = new EmployeeSignUp();
//		employeeBO.setEmail("email");
		System.out.println(employeeBO.getEmail());
		
		String uname=employeeBO.getEmail();
		String password=request.getParameter("password");
		EmployeeSignUp user = emprepo.findByEmail(uname);
		System.out.println(user.getEmail());
		HttpSession session=request.getSession();
		System.out.println("username--->"+uname);	
		session.setAttribute("UserName", uname);

		return new ResponseEntity<EmployeeSignUp>(HttpStatus.OK);
	}


	@RequestMapping(value="/inPage", method=RequestMethod.POST)
	public ResponseEntity<EmployeeSignUp> insertEmployee(@Valid		
			@RequestBody  EmployeeSignUp employeeBO,BindingResult result, HttpServletRequest request, HttpServletResponse res) throws ParseException, IOException {
		ModelAndView model = new ModelAndView();
		if(result.hasErrors()) {
			model.addObject("employeeSignUpForm", employeeBO);
			model.setViewName("employee_signup");
//			return new ResponseEntity<EmployeeSignUp>("employee_signup");
		}else {

			employeeBO.setEmail(employeeBO.getEmail());
//			System.out.println("before convert password---->"+employeeBO.getPassword());
//			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//			String encodedPassword = passwordEncoder.encode(employeeBO.getPassword());
//			employeeBO.setPassword(encodedPassword);
//			
			System.out.println("after convert password---->"+employeeBO.getPassword());
			HttpSession session=request.getSession();
			String req=request.getParameter("email");
			session.setAttribute("email", req);
			//		 String username = (String)request.getAttribute(req);
			//		  System.out.println("username--->"+username);
			//		  session.setAttribute("UserName", username);
			String id=request.getParameter("id");
			employeeBO=employeeSignUpService.createEmployeeSignUp(employeeBO);


			model.addObject("employeeSignUpForm", employeeBO);
			model.setViewName("employee_signup");
//			return new ModelAndView("redirect:/admin/emplogin");
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}

	
    @RequestMapping(value="/authenticate", method=RequestMethod.POST)
    public String authenticate(@RequestBody JwtRequest jwtRequest) throws Exception{

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            jwtRequest.getUsername(),
                            jwtRequest.getPassword()
                    )
            );
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }

        final UserDetails userDetails
                = userService.loadUserByUsername(jwtRequest.getUsername());

        final String token =
                jwtUtility.generateToken(userDetails);
        

        return  token;
    }
	
	
}
