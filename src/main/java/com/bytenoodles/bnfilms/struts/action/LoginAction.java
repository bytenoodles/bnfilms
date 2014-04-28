package com.bytenoodles.bnfilms.struts.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author jorge
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;
 
    public String login() {
        if(username != null && password != null){
            if (username.equals("admin") 
                    && password.equals("1234")) {
                ActionContext.getContext().getSession().put("login", true);
            } else {
                addActionError(getText("error.login"));
                
            }
        }
        return SUCCESS;
    }
    
    public String logout() {
        ActionContext.getContext().getSession().remove("login");
        return SUCCESS;
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
}