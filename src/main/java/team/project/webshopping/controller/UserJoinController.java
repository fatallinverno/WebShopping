package team.project.webshopping.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import team.project.webshopping.dto.UserJoinDTO;
import team.project.webshopping.service.UserJoinService;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
@RequestMapping("WebShopping")
public class UserJoinController {
    private UserJoinService userJoinService;

    @GetMapping("/userjoin")
    public String userJoinForm() {
        return "common/userjoin";
    }

    @PostMapping("/userjoin")
    public String userJoin(@ModelAttribute UserJoinDTO userJoinDTO)  throws IOException {
        System.out.println("userJoinDTO = " + userJoinDTO);
        userJoinService.userJoin(userJoinDTO);

        return "index";
    }

}
