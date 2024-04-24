package team.project.webshopping.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Getter
@Setter
@Table(name = "user_table")
public class UserJoinEntity extends BaseEntity{

    @Id // pk 컬럼 지정. 필수
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column
    private String password;

    @Column
    private String username;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private String address;

}
