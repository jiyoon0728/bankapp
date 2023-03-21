package shop.mtcoding.bank1.dto.user;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.bank1.model.user.User;

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
        user.setFullname(fullname);
        return user;
    }
}