package ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ssh.entity.User;
import ssh.service.UserService;

@Controller
@RequestMapping(value="")
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * http://localhost:8080/ssh/user/1
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/user/{id}", method = RequestMethod.GET)
	public User findById(@PathVariable("id")Long id) {
		User u = userService.findById(id);
		System.out.println(u);
		return u;
	}
	
	/**
	 * Ìø×ªµ½jsp/index.jsp
	 * @return
	 */
	@RequestMapping("/user/index")
	public String index() {
		return "index";
	}
}
