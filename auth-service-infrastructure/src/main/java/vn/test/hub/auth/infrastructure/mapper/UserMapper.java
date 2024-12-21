package vn.test.hub.auth.infrastructure.mapper;

import org.mapstruct.Mapper;
import vn.test.hub.auth.business.domain.User;
import vn.test.hub.auth.infrastructure.datasource.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserEntity user);
}
