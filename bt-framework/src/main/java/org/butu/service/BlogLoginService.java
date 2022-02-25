package org.butu.service;

import org.butu.domain.ResponseResult;
import org.butu.domain.entity.User;

public interface BlogLoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
