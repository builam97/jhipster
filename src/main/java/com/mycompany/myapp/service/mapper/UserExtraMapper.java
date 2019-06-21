package com.mycompany.myapp.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mycompany.myapp.domain.UserExtra;
import com.mycompany.myapp.service.dto.UserExtraDTO;

@Mapper(componentModel = "spring", uses = {})
public interface UserExtraMapper extends EntityMapper<UserExtraDTO, UserExtra>{
	@Mapping(source = "user.firstName", target= "firstName")
	@Mapping(source = "user.lastName", target= "lastName")
	@Mapping(source = "user.email", target= "email")
	UserExtraDTO toDto(UserExtra userExtra);
	
	UserExtra toEntity(UserExtraDTO userExtraDto);
}
