package com.up.stores.controller;

import com.up.stores.entity.Address;
import com.up.stores.service.IAddressService;
import com.up.stores.until.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
//指定了基本的请求路径为addresses。这意味着该控制器下的请求路径都是以/addresses开头的。
@RequestMapping("addresses")
public class AddressController extends BaseController {
    //有一个@Autowired注解，用于自动注入IAddressService接口的实例，表示控制器依赖于地址服务（addressService）
    @Autowired
    private IAddressService addressService;
    //addNewAddress方法处理addresses/add_new_address路径的POST请求
    @RequestMapping("add_new_address")
    public JsonResult<Void> addNewAddress(Address address, HttpSession session) {
        // 从Session中获取uid和username
        Integer uid = getuidFromSession(session);
        String username = getUsernameFromSession(session);
        // 调用业务对象的方法执行业务
        addressService.addNewAddress(uid, username, address);
        // 响应成功
        return new JsonResult<Void>(OK);
    }

    //getByUid方法处理addresses和addresses/路径的GET请求。
    @GetMapping({"", "/"})
    public JsonResult<List<Address>> getByUid(HttpSession session) {
        Integer uid = getuidFromSession(session);
        //调用地址服务的getByUid方法来获取该用户的地址列表
        List<Address> data = addressService.getByUid(uid);
        return new JsonResult<>(OK, data);
    }

    //setDefault方法处理addresses/{aid}/set_default路径的请求。
    //aid是路径变量
    @RequestMapping("{aid}/set_default")
    public JsonResult<Void> setDefault(@PathVariable("aid") Integer aid, HttpSession session) {
        Integer uid = getuidFromSession(session);
        String username = getUsernameFromSession(session);
        //调用地址服务的setDefault方法来设置指定地址为默认地址。
        addressService.setDefault(aid, uid, username);
        return new JsonResult<Void>(OK);
    }

    @RequestMapping("{aid}/delete")
    public JsonResult<Void> delete(@PathVariable("aid") Integer aid, HttpSession session) {
        Integer uid = getuidFromSession(session);
        String username = getUsernameFromSession(session);
        addressService.delete(aid, uid, username);
        return new JsonResult<Void>(OK);
    }
}