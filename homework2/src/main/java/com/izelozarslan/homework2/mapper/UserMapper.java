package com.izelozarslan.homework2.mapper;

import com.izelozarslan.homework2.dto.user.UserDTO;
import com.izelozarslan.homework2.dto.user.UserSaveRequest;
import com.izelozarslan.homework2.entity.User;

import java.util.List;

public interface UserMapper {

    List<UserDTO> convertToUserDTOList(List<User> userList);

    UserDTO convertToUserDTO(User user);

    User convertToUserDTO(UserSaveRequest userSaveRequest);

}
