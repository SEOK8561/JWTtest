package rc.bootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminController {

	//@PreAuthorize : 필터를 지나서 AOP에서 걸러냄
	//@PostAuthorize
    @GetMapping("index")
    public String index(){
        return "admin/index";
    }
}
