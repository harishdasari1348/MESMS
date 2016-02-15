/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import com.opensymphony.xwork2.validator.annotations.*;
import dao.LoginDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.interceptor.ServletRequestAware;
import pojo.LoginPOJO;

/**
 *
 * @author miracle
 */
@Results({
    @Result(name = "login", location = "/index.jsp"),
    @Result(name = "input", location = "/index.jsp"),
    @Result(name = "home", location = "/home.jsp")
})
public class LoginAction extends ActionSupport implements ServletRequestAware {

    public static final String HOME = "home";
    LoginPOJO loginPOJO = new LoginPOJO();
    LoginDAO loginDAO = new LoginDAO();
    private String name;
    private String pwd;
    private String error;
    private String lastLogin;
    private String ip;
    HttpSession session;
    private String menu="dashboard";

    public String getMenu() {
        return menu;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "The name is required.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "The Password is required.")
    public String getPwd() {
        return pwd;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public LoginAction() {
    }

    @Action(value = "/login")
    public String execute() throws Exception {
        loginPOJO.setUsername(name);
        loginPOJO.setPassword(pwd);
        loginPOJO.setIp(getIp());
        if (loginDAO.checkLoginCredentialsUser(loginPOJO)) {
            loginPOJO=loginDAO.refreshLoginPOJO(loginPOJO);
            session.setAttribute("id", loginPOJO.getLogin_id());
            setLastLogin(loginPOJO.getLastlogin().toString());
            setIp(loginPOJO.getIp());
            return HOME;
        }
        else
        {
        setError("Please provide valid login credentials");
        }
        return LOGIN;
    }

    public LoginPOJO getModel() {
        return loginPOJO;
    }

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        session = hsr.getSession();
        setIp(hsr.getRemoteAddr());

    }
}
