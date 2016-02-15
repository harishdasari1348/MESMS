/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import dao.DbConnection;
import dao.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import pojo.StaffPOJO;

/**
 *
 * @author miracle
 */
public class StaffDAO {

    DbConnection dbConn = new DbConnection();

    public StaffPOJO getStaffDetails(String BioMetricID) {
        StaffPOJO staff = new StaffPOJO();

        Statement stmt = null;
        Connection conn = null;
        int count = 0;
        try {
            Date date = new Date();
            String SQL = "select * from staffdetails where biometricid='" + BioMetricID + "'";
            conn = dbConn.returnConnection();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                staff.setBiometricid(rs.getString("biometricid"));
                staff.setEmpname(rs.getString("empname"));
                staff.setDoj(rs.getString("doj"));
                staff.setSaltype(rs.getString("saltype"));
                staff.setMonsalary(rs.getString("monsalary"));
                staff.setDepartment(rs.getString("department"));
                staff.setBankaccnumber(rs.getString("bankaccnumber"));
                staff.setAddress(rs.getString("address"));
                staff.setModeoftravel(rs.getString("modeoftravel"));
                staff.setMobilenumber(rs.getString("mobilenumber"));
            }

            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

        return staff;
    }

    public boolean checkBioIDAlreadyExists(StaffPOJO staff) {
        Statement stmt = null;
        Connection conn = null;
        int count = 0;
        try {
            Date date = new Date();
            String SQL = "select * from staffdetails where biometricid='" + staff.getBiometricid() + "'";
            conn = dbConn.returnConnection();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                count = count + 1;
            }

            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateStaff(StaffPOJO staff) {
        Statement stmt = null;
        Connection conn = null;
        int count = 0;
        try {
            Date date = new Date();
            String SQL = "update staffdetails  set empname='" + staff.getEmpname() + "',doj='" + staff.getDoj() + "',saltype='" + staff.getSaltype() + "',monsalary='" + staff.getMonsalary() + "',department='" + staff.getDepartment() + "',bankaccnumber='" + staff.getBankaccnumber() + "',address='" + staff.getAddress() + "',modeoftravel='" + staff.getModeoftravel() + "',mobilenumber='" + staff.getMobilenumber() + "' where biometricid='" + staff.getBiometricid() + "'";
            conn = dbConn.returnConnection();
            stmt = conn.createStatement();
            count = stmt.executeUpdate(SQL);

            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addNewStaff(StaffPOJO staff) {
        Statement stmt = null;
        Connection conn = null;
        int count = 0;
        try {
            Date date = new Date();
            String SQL = "insert into staffdetails values('" + staff.getBiometricid() + "','" + staff.getEmpname() + "','" + staff.getDoj() + "','" + staff.getSaltype() + "','" + staff.getMonsalary() + "','" + staff.getDepartment() + "','" + staff.getBankaccnumber() + "','" + staff.getAddress() + "','" + staff.getModeoftravel() + "','" + staff.getMobilenumber() + "')";
            conn = dbConn.returnConnection();
            stmt = conn.createStatement();
            count = stmt.executeUpdate(SQL);

            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList getListOfStaff() {
        Statement stmt = null;
        Connection conn = null;
        int count = 0;
        ArrayList staffList = new ArrayList();
        try {
            Date date = new Date();
            String SQL = "select * from staffdetails";
            conn = dbConn.returnConnection();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                StaffPOJO staff = new StaffPOJO();
                staff.setBiometricid(rs.getString("biometricid"));
                staff.setEmpname(rs.getString("empname"));
                staff.setDoj(rs.getString("doj"));
                staff.setSaltype(rs.getString("saltype"));
                staff.setMonsalary(rs.getString("monsalary"));
                staff.setDepartment(rs.getString("department"));
                staff.setBankaccnumber(rs.getString("bankaccnumber"));
                staff.setAddress(rs.getString("address"));
                staff.setModeoftravel(rs.getString("modeoftravel"));
                staff.setMobilenumber(rs.getString("mobilenumber"));
                staffList.add(staff);

            }
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return staffList;
    }

    public boolean deleteStaff(String BioID) {
        Statement stmt = null;
        Connection conn = null;
        int count = 0;
        try {           
            String SQL = "delete from staffdetails  where biometricid='" + BioID + "'";
            conn = dbConn.returnConnection();
            stmt = conn.createStatement();
            count = stmt.executeUpdate(SQL);

            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        if (count == 1) {
            return true;
        } else {
            return false;
        }

    }
}
