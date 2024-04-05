package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String home() {
        return "home";   //após o intervalo ver 03 onde mudou o 
        //return "WEB-INF/home.jsp" para o que ta ali salvar teste
    }
}


