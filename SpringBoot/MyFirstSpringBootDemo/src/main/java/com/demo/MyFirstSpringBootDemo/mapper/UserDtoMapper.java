package com.demo.MyFirstSpringBootDemo.mapper;

import java.time.format.DateTimeFormatter;

import com.demo.MyFirstSpringBootDemo.beans.User;
import com.demo.MyFirstSpringBootDemo.dto.UserDto;

public class UserDtoMapper {

	public static UserDto mapToUserdto(User u) {
		return new UserDto(u.getUid(),u.getUname(),u.getUpass(),u.getUdate().format(DateTimeFormatter.ofPattern("yyy-MM-dd")));
	}
}
