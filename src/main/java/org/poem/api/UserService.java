package org.poem.api;

import org.poem.entity.PlatformUser;

import java.util.List;

public interface UserService {

    PlatformUser getUserById(Integer id);

    public List<PlatformUser> getUserList();

    public int add(PlatformUser user);

    public int update(Integer id, PlatformUser user);

    public int delete(Integer id);
}
