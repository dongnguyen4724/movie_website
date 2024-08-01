package com.dongnv.movie_website.mapper;

import com.dongnv.movie_website.dto.request.UserCreationRequest;
import com.dongnv.movie_website.dto.request.UserUpdateRequest;
import com.dongnv.movie_website.dto.response.UserResponse;
import com.dongnv.movie_website.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}