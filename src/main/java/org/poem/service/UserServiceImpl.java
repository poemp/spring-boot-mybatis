package org.poem.service;

import org.poem.api.UserService;
import org.poem.entity.PlatformUser;
import org.poem.mapper.PlatformUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private PlatformUserMapper platformUserMapper;

    @Override
    public PlatformUser getUserById(Integer id) {
        return this.platformUserMapper.getUserById(id);
    }

    @Override
    public List<PlatformUser> getUserList() {
        return this.platformUserMapper.getUserList();
    }

    @Override
    public int add(PlatformUser user) {
        return this.platformUserMapper.add(user);
    }

    @Override
    public int update(Integer id, PlatformUser user) {
        return this.platformUserMapper.update(id,user);
    }

    @Override
    public int delete(Integer id) {
        return this.platformUserMapper.delete(id);
    }
}
