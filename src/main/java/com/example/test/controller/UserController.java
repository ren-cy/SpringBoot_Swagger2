package com.example.test.controller;

import com.example.test.bean.UserBean;
import com.example.test.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  rency
 */
@Api(value = "/user", tags = "用户模块")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户信息", notes = "获取用户信息", httpMethod = "GET")
    //@ApiImplicitParam(name="user", value="User", required = true, dataType = "User")
    @RequestMapping("/getUserById")
    public Response getUserById(Integer userid){

        Response response = new Response();
        response.setCode("200");
        response.setMsg("成功");

        response.setUserBean(userService.getUserById(userid));

        return response;
    }

}

class Response {

    String code;

    String msg;

    List<UserBean> userBean;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<UserBean> getUserBean() {
        return userBean;
    }

    public void setUserBean(List<UserBean> userBean) {
        this.userBean = userBean;
    }
}