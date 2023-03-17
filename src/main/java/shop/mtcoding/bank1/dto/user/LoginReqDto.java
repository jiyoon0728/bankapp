package shop.mtcoding.bank1.dto.user;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginReqDto {
    private String username;
    private String password;
}