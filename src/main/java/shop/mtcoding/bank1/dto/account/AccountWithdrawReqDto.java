package shop.mtcoding.bank1.dto.account;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountWithdrawReqDto {
    private Long amount;
    private String wAccountNumber;
    private String wAccountPassword;
}