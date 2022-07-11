package xyz.mizan.springbootjspcrudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import xyz.mizan.springbootjspcrudapp.entity.EmployeeSignUp;
import xyz.mizan.springbootjspcrudapp.repository.EmployeeRepository;
import xyz.mizan.springbootjspcrudapp.repository.EmployeeSignUpRepository;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private EmployeeSignUpRepository repo;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
EmployeeSignUp user=repo.findByEmail(userName);
        return new User(user.getEmail(),user.getPassword(), new ArrayList<>());
        		}
}