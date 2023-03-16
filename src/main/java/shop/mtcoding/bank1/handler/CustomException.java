package shop.mtcoding.bank1.handler;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {
    private HttpStatus status; // 상태코드만들기

    public CustomException(String message, HttpStatus status) { // 생성자 만들기
        super(message);
        this.status = status;
    }
}