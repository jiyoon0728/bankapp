package shop.mtcoding.bank1.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JoinReqDto {
    private String username;
    private String password;
    private String fullname;
}