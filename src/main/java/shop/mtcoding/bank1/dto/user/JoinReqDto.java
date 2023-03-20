package shop.mtcoding.bank1.dto.user;

import org.apache.catalina.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JoinReqDto {
    private String username;
    private String password;
    private String fullname;

    public User toModel() {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setFullName(fullname);
        return user;
    }
}