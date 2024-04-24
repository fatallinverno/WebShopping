package team.project.webshopping.dto;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
public class UserJoinDTO {

    private Long id;
    private String password;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String role;
    private LocalDateTime userJoinCreatedTime;
    private LocalDateTime userJoinUpdatedTime;

    public void userJoinDTO(Long id, String password, String name, String phone, String email, String address, String role, LocalDateTime userJoinCreatedTime){
        this.id = id;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.role = "ROLE_USER";
    }

    public static UserJoinDTO toDTO(UserJoinDTO userJoinDTO){
        UserJoinDTO userDto = new UserJoinDTO();

        return userJoinDTO;
    }

}
