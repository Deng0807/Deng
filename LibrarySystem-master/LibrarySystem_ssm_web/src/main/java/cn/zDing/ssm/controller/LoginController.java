package cn.zDing.ssm.controller;

import cn.zDing.ssm.domain.Admin;
import cn.zDing.ssm.domain.ReaderCard;
import cn.zDing.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;


@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

   /* @RequestMapping("/findId")
    public void findId(HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
    }*/
    //登录
    //负责处理loginCheck.jsp请求
    //请求参数会根据参数名称默认契约自动绑定到相应方法的入参中
   @RequestMapping(value = "/api/loginCheck", method = RequestMethod.POST)
   public @ResponseBody
   Object loginCheck(HttpServletRequest request) {
       Integer id = Integer.parseInt(request.getParameter("id"));
       String passwd = request.getParameter("passwd");
       System.out.println(id);
       System.out.println(passwd);
       boolean isReader = loginService.hasMatchReader(id, passwd);
       boolean isAdmin = loginService.hasMatchAdmin(id, passwd);
       System.out.println(isReader+"And"+isAdmin);
       HashMap<String, String> res = new HashMap<>();
       if (isAdmin) {
           Admin admin = new Admin();
           admin.setAdmin_id(id);
           admin.setPassword(passwd);
           String username = loginService.getAdminUsername(id);
           admin.setUsername(username);
           request.getSession().setAttribute("admin", admin);
           res.put("stateCode", "1");
           res.put("msg", "管理员登陆成功！");
       } else if (isReader) {
           ReaderCard readerCard = loginService.findReaderCardByReaderId(id);
           request.getSession().setAttribute("readercard", readerCard);
           res.put("stateCode", "2");
           res.put("msg", "读者登陆成功！");
       } else {
           res.put("stateCode", "0");
           res.put("msg", "账号或密码错误！");
       }
       return res;
   }


}
