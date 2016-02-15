/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.ServletRequestAware;
import pojo.DepartmentPOJO;

/**
 *
 * @author miracle
 */
@Results({
    @Result(name = "input", location = "/addNewDepartment.jsp"),
    @Result(name = "addNewDepartment", location = "/addNewDepartment.jsp")
})
public class DepartmentAction extends ActionSupport implements ServletRequestAware {

    HttpSession session;
    private String departName;
    private String departDesc;
    private String error;
    private String success;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
    private int deptID;

    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }
    private String menu = "department";

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getDepartDesc() {
        return departDesc;
    }

    public void setDepartDesc(String departDesc) {
        this.departDesc = departDesc;
    }

    public String getMenu() {
        return menu;
    }

    public DepartmentAction() {
    }

    @Action(value = "/addNewDepartment")
    public String execute() {
        DepartmentPOJO deptPOJO = new DepartmentPOJO();
        deptPOJO.setDepartmentName(getDepartName());
        deptPOJO.setDepartmentDescription(getDepartDesc());
        if ("".equals(deptPOJO.getDepartmentName()) || deptPOJO.getDepartmentName() == null) {
            setError("Please provide Valid \"Department Name\"");
        } else if ("".equals(deptPOJO.getDepartmentDescription()) || deptPOJO.getDepartmentDescription() == null) {
            setError("Please provide Valid \"Department Description\"");
        } else {
            if (staffDAO.checkBioIDAlreadyExists(staffPOJO)) {
                setError("Error!! Bio Metric ID already Exists!! Please check");
            } else {

                if (staffDAO.addNewStaff(staffPOJO)) {
                    setSuccess("New Staff addedd successfully");
                } else {
                    setError("Error!! New Staff did not added, Please check");
                }
            }
        }

        return "addNewDepartment";

    }

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        session = hsr.getSession();
    }
}
