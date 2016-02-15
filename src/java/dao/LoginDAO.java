/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import pojo.LoginPOJO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author miracle
 */
public class LoginDAO {
    
    DbConnection dbConn = new DbConnection();
    
    
    public void updateLastLoginAndIP(LoginPOJO login) {
        Statement stmt = null;
        Connection conn = null;
        try {
            Date date = new Date();
            String SQL = "update login set last_login='" + date.toLocaleString() + "',ip='"+login.getIp()+"'  where username='" + login.getUsername() + "' and password='" + login.getPassword() + "'";
            conn = dbConn.returnConnection();
            stmt = conn.createStatement();
            int count = stmt.executeUpdate(SQL);
            
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
    }
    
    public String getLastLogin(LoginPOJO login) {
        Statement stmt = null;
        Connection conn = null;
        String lastLogin = null;
        try {
            String SQL = "select * from login where username='" + login.getUsername() + "' and password='" + login.getPassword() + "'";
            conn = dbConn.returnConnection();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                lastLogin = rs.getString("last_login");
            }
            
            rs.close();
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
        return lastLogin;
    }
    
    public LoginPOJO refreshLoginPOJO(LoginPOJO login) {
        Statement stmt = null;
        Connection conn = null;
        int id = 0;
        try {
            String SQL = "select * from login where username='" + login.getUsername() + "' and password='" + login.getPassword() + "'";
            conn = dbConn.returnConnection();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                login.setLogin_id(rs.getInt("login_id"));
                login.setIp(rs.getString("ip"));
                login.setLastlogin(rs.getString("last_login"));
            }
            
            rs.close();
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
        return login;
    }
    
    public int getID(LoginPOJO login) {
        Statement stmt = null;
        Connection conn = null;
        int id = 0;
        try {
            String SQL = "select * from login where username='" + login.getUsername() + "' and password='" + login.getPassword() + "'";
            conn = dbConn.returnConnection();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                id = rs.getInt("login_id");
            }
            
            rs.close();
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
        return id;
    }
    
    public boolean checkLoginCredentialsUser(LoginPOJO login) {
        Statement stmt = null;
        Connection conn = null;
        boolean tf = false;
        try {
            String SQL = "select count(*) from login where username='" + login.getUsername() + "' and password='" + login.getPassword() + "'";
            conn = dbConn.returnConnection();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                int count = rs.getInt(1);
                if (count == 1) {
                    tf = true;
                    updateLastLoginAndIP(login);
                    
                }
            }
            rs.close();
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
        return tf;
    }
}
