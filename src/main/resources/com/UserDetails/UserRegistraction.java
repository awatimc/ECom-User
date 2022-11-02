import org.springframework.stereotype.Controller;

@Controller
public class UserRegistraction {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	private ModelAndView userRegister() {    //ModelAndView return the value of model and view
		System.out.println("------------");
		ModelAndView obj=new ModelAndView("Home"); 
		return obj;
	}

}
