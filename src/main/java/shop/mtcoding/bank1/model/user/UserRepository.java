package shop.mtcoding.bank1.model.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.mtcoding.bank1.dto.user.LoginReqDto;

@Mapper
public interface UserRepository {
    public int insert(User user);

    public int updateById(User user);

    public int deleteById(int id);

    public List<User> findAll();

    public User findById(int id);

    public User findByUsernameAndPassword(LoginReqDto loginReqDto);
}
