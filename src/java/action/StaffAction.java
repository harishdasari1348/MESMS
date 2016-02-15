/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.ServletRequestAware;
import pojo.StaffPOJO;

/**
 *
 * @author miracle
 */
@Results({
    @Result(name = "input", location = "/addNewStaff.jsp"),
    @Result(name = "addNewStaff", location = "/addNewStaff.jsp"),
    @Result(name = "listStaff", location = "/listStaffDetails.jsp"),
    @Result(name = "editStaff", location = "/editStaff.jsp")
})
public class StaffAction extends ActionSupport implements ServletRequestAware {

    HttpSession session;
    private String menu = "staff";
    private String biometricid;
    private String empname;
    private String doj;
    private String saltype;
    private String monsalary;
    private String department;
    private String bankaccnumber;
    private String address;
    private String modeoftravel;
    private String mobilenumber;
    private String error;
    private String success;
    List staffList = new ArrayList();

    public List getStaffList() {
        return staffList;
    }

    public void setStaffList(List staffList) {
        this.staffList = staffList;
    }

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
    StaffPOJO staffPOJO = new StaffPOJO();

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getSaltype() {
        return saltype;
    }

    public void setSaltype(String saltype) {
        this.saltype = saltype;

    }

    public String getMonsalary() {
        return monsalary;
    }

    public void setMonsalary(String monsalary) {
        this.monsalary = monsalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBankaccnumber() {
        return bankaccnumber;
    }

    public void setBankaccnumber(String bankaccnumber) {
        this.bankaccnumber = bankaccnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getModeoftravel() {
        return modeoftravel;
    }

    public void setModeoftravel(String modeoftravel) {
        this.modeoftravel = modeoftravel;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getBiometricid() {
        return biometricid;
    }

    public void setBiometricid(String biometricid) {
        this.biometricid = biometricid;
    }

    public String getMenu() {
        return menu;
    }

    public StaffAction() {
    }

    @Action(value = "/addNewStaff")
    public String execute() {
        StaffDAO staffDAO = new StaffDAO();
        staffPOJO.setBiometricid(getBiometricid());
        staffPOJO.setEmpname(getEmpname());
        staffPOJO.setDoj(getDoj());
        staffPOJO.setSaltype(getSaltype());
        staffPOJO.setMonsalary(getMonsalary());
        staffPOJO.setDepartment(getDepartment());
        staffPOJO.setBankaccnumber(getBankaccnumber());
        staffPOJO.setAddress(getAddress());
        staffPOJO.setModeoftravel(getModeoftravel());
        staffPOJO.setMobilenumber(getMobilenumber());
        if ("".equals(staffPOJO.getBiometricid()) || staffPOJO.getBiometricid() == null) {
            setError("Please provide Valid \"Bio-Metric ID\"");
        } else if ("".equals(staffPOJO.getEmpname()) || staffPOJO.getEmpname() == null) {
            setError("Please provide Valid \"Employee Name\"");
        } else if ("".equals(staffPOJO.getDoj()) || staffPOJO.getDoj() == null) {
            setError("Please provide Valid \"Date Of Joining\"");
        } else if ("".equals(staffPOJO.getSaltype()) || staffPOJO.getSaltype() == null) {
            setError("Please provide Valid \"Salary Type\"");
        } else if ("".equals(staffPOJO.getMonsalary()) || staffPOJO.getMonsalary() == null) {
            setError("Please provide Valid \"Monthly Salary\"");
        } else if ("".equals(staffPOJO.getDepartment()) || staffPOJO.getDepartment() == null) {
            setError("Please provide Valid \"Department\"");
        } else if ("".equals(staffPOJO.getBankaccnumber()) || staffPOJO.getBankaccnumber() == null) {
            setError("Please provide Valid \"Bank Account Number\"");
        } else if ("".equals(staffPOJO.getAddress()) || staffPOJO.getAddress() == null) {
            setError("Please provide Valid \"Address\"");
        } else if ("".equals(staffPOJO.getModeoftravel()) || staffPOJO.getModeoftravel() == null) {
            setError("Please provide Valid \"Mode Of Travel\"");
        } else if ("".equals(staffPOJO.getMobilenumber()) || staffPOJO.getMobilenumber() == null) {
            setError("Please provide Valid \"Mobile Number\"");
        } else if (!(staffPOJO.getBiometricid()).matches("[0-9]+")) {
            setError("Please provide Valid \"Bio-Metric ID\" (Numbers only)");
        } else if (!(staffPOJO.getBankaccnumber()).matches("[0-9]+")) {
            setError("Please provide Valid \"Bank Account Number\" (Numbers only)");
        } else if (!(staffPOJO.getMobilenumber()).matches("[0-9]+")) {
            setError("Please provide Valid \"Mobile Number\" (Numbers only)");
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

        return "addNewStaff";
    }

    @Action(value = "/listStaff")
    public String listStaffDetails() {
        StaffDAO staffDao = new StaffDAO();
        setStaffList(staffDao.getListOfStaff());
        return "listStaff";

    }

    @Action(value = "/editStaff")
    public String editStaff() {
        System.out.println("------------------->" + getBiometricid());
        StaffDAO staffDao = new StaffDAO();
        staffPOJO = staffDao.getStaffDetails(getBiometricid());
        setEmpname(staffPOJO.getEmpname());
        setDoj(staffPOJO.getDoj());
        setSaltype(staffPOJO.getSaltype());
        setMonsalary(staffPOJO.getMonsalary());
        setDepartment(staffPOJO.getDepartment());
        setBankaccnumber(staffPOJO.getBankaccnumber());
        setAddress(staffPOJO.getAddress());
        setModeoftravel(staffPOJO.getModeoftravel());
        setMobilenumber(staffPOJO.getMobilenumber());
        return "editStaff";
    }

    @Action(value = "/saveStaffDetails")
    public String saveStaffDetails() {
        StaffDAO staffDAO = new StaffDAO();
        staffPOJO.setBiometricid(getBiometricid());
        staffPOJO.setEmpname(getEmpname());
        staffPOJO.setDoj(getDoj());
        staffPOJO.setSaltype(getSaltype());
        staffPOJO.setMonsalary(getMonsalary());
        staffPOJO.setDepartment(getDepartment());
        staffPOJO.setBankaccnumber(getBankaccnumber());
        staffPOJO.setAddress(getAddress());
        staffPOJO.setModeoftravel(getModeoftravel());
        staffPOJO.setMobilenumber(getMobilenumber());
        if ("".equals(staffPOJO.getBiometricid()) || staffPOJO.getBiometricid() == null) {
            setError("Please provide Valid \"Bio-Metric ID\"");
        } else if ("".equals(staffPOJO.getEmpname()) || staffPOJO.getEmpname() == null) {
            setError("Please provide Valid \"Employee Name\"");
        } else if ("".equals(staffPOJO.getDoj()) || staffPOJO.getDoj() == null) {
            setError("Please provide Valid \"Date Of Joining\"");
        } else if ("".equals(staffPOJO.getSaltype()) || staffPOJO.getSaltype() == null) {
            setError("Please provide Valid \"Salary Type\"");
        } else if ("".equals(staffPOJO.getMonsalary()) || staffPOJO.getMonsalary() == null) {
            setError("Please provide Valid \"Monthly Salary\"");
        } else if ("".equals(staffPOJO.getDepartment()) || staffPOJO.getDepartment() == null) {
            setError("Please provide Valid \"Department\"");
        } else if ("".equals(staffPOJO.getBankaccnumber()) || staffPOJO.getBankaccnumber() == null) {
            setError("Please provide Valid \"Bank Account Number\"");
        } else if ("".equals(staffPOJO.getAddress()) || staffPOJO.getAddress() == null) {
            setError("Please provide Valid \"Address\"");
        } else if ("".equals(staffPOJO.getModeoftravel()) || staffPOJO.getModeoftravel() == null) {
            setError("Please provide Valid \"Mode Of Travel\"");
        } else if ("".equals(staffPOJO.getMobilenumber()) || staffPOJO.getMobilenumber() == null) {
            setError("Please provide Valid \"Mobile Number\"");
        } else if (!(staffPOJO.getBiometricid()).matches("[0-9]+")) {
            setError("Please provide Valid \"Bio-Metric ID\" (Numbers only)");
        } else if (!(staffPOJO.getBankaccnumber()).matches("[0-9]+")) {
            setError("Please provide Valid \"Bank Account Number\" (Numbers only)");
        } else if (!(staffPOJO.getMobilenumber()).matches("[0-9]+")) {
            setError("Please provide Valid \"Mobile Number\" (Numbers only)");
        } else {
            if (staffDAO.updateStaff(staffPOJO)) {
                setSuccess("Staff changes saved successfully");
            } else {
                setError("Error!! Did not save staff details, Please check");
            }

        }
        return "editStaff";
    }

    @Action(value = "/deleteStaff")
    public String deleteStaffDetails() {
        StaffDAO staffDAO = new StaffDAO();
        if (staffDAO.deleteStaff(getBiometricid())) {
            setSuccess("Staff details deleted successfully");
        } else {
            setError("Error!! Did not delete staff details, Please check");
        }

        StaffDAO staffDao = new StaffDAO();
        setStaffList(staffDao.getListOfStaff());
        return "listStaff";
    }

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        session = hsr.getSession();
    }
}
