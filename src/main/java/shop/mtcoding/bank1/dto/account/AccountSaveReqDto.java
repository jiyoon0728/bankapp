package shop.mtcoding.bank1.dto.account;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.bank1.model.account.Account;

@Getter
@Setter
public class AccountSaveReqDto {
    private String number;
    private String password;

    // insert.update할 때 이 메서드에 DTO가 필요하다
    public Account toModel(int principalId) {
        Account account = new Account();
        account.setNumber(number);
        account.setPassword(password);
        account.setUserId(principalId);
        account.setBalance(1000l);
        return account;

    }
}
