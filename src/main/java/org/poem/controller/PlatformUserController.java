package org.poem.controller;


import org.poem.api.UserService;
import org.poem.api.bean.JsonBean;
import org.poem.entity.PlatformUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/platformUser")
public class PlatformUserController {

    @Autowired
    private UserService userService;

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    public ResponseEntity<JsonBean> getUserById (@PathVariable(value = "id") Integer id){
        JsonBean r = new JsonBean();
        try {
            PlatformUser user = userService.getUserById(id);
            r.setResult(user);
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

    /**
     * 查询用户列表
     * @return
     */
    @RequestMapping(value = "users", method = RequestMethod.GET)
    public ResponseEntity<JsonBean> getUserList (){
        JsonBean r = new JsonBean();
        try {
            List<PlatformUser> users = userService.getUserList();
            r.setResult(users);
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus(1);
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequestMapping(value = "user", method = RequestMethod.POST)
    public ResponseEntity<JsonBean> add (@RequestBody PlatformUser user){
        JsonBean r = new JsonBean();
        try {
            int orderId = userService.add(user);
            if (orderId < 0) {
                r.setResult(orderId);
                r.setStatus(1);
            } else {
                r.setResult(orderId);
            }
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());

            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    @RequestMapping(value = "user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<JsonBean> delete (@PathVariable(value = "id") Integer id){
        JsonBean r = new JsonBean();
        try {
            int ret = userService.delete(id);
            if (ret < 0) {
                r.setResult(ret);
                r.setStatus(0);
            } else {
                r.setResult(ret);
                r.setStatus(1);
            }
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus(1);

            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

    /**
     * 根据id修改用户信息
     * @param user
     * @return
     */
    @RequestMapping(value = "user/{id}", method = RequestMethod.PUT)
    public ResponseEntity<JsonBean> update (@PathVariable("id") Integer id, @RequestBody PlatformUser user){
        JsonBean r = new JsonBean();
        try {
            int ret = userService.update(id, user);
            if (ret < 0) {
                r.setResult(ret);
                r.setStatus(0);
            } else {
                r.setResult(ret);
                r.setStatus(1);
            }
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus(1);

            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

}
