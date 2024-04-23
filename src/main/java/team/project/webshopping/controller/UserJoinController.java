package team.project.webshopping.controller;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import team.project.webshopping.service.UserJoinService;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
@RequestMapping("WebShopping")
public class UserJoinController {
    private UserJoinService userJoinService;

    @GetMapping("/userjoin")
    public String userJoinForm() {
        return "userjoin";
    }

    @PostMapping("/user_join")
    public String userJoin()  throws IOException {
        System.out.println("컨트롤 탔나?");

        return "index";
    }

}
