package database;
import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class db_operation{
    private String url;
    private String user;
    private String pwd;
    private Connection con;
    
    public db_operation(){
        try {
            url="jdbc:mysql://localhost:3306/event_manager";
            user="root";
            pwd="";
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con=DriverManager.getConnection(url,user,pwd);
            } catch (SQLException ex) {
                Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean login(String email,String pass){
        try {
                con=DriverManager.getConnection(url,user,pwd);
                PreparedStatement pst=con.prepareStatement("select * from tbl_user where user_email='"+email+"' and user_pwd='"+pass+"'");
                ResultSet rs=pst.executeQuery();
                return rs.next();
            } catch (SQLException ex) {
                Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
            }
        return false;
    }
    public boolean reg(String name,String email,String pass){
        try {
            String sql="insert into tbl_user (user_email,user_name,user_pwd)values('"+email+"','"+name+"','"+pass+"')";
            Statement st=con.createStatement();
            st.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public ResultSet event_det(String cate,String user){
        ResultSet rs=null;
        String sql;
        LocalDate date=LocalDate.now();
        switch (cate) {
            case "past":
                sql="select * from tbl_event where event_date<'"+date+"'";
                break;
            case "upcoming":
                sql="select * from tbl_event where event_date>'"+date+"'";
                break;
            case "current":
                sql="select * from tbl_event where event_date='"+date+"'";
                break;
            case "cancelled":
                sql="select * from tbl_event where status='cancelled' and event_id in(select event_id from tbl_event_reg where user_email='"+user+"')";
                break;
            default:
                sql="select * from tbl_event where status='updated' and event_id in(select event_id from tbl_event_reg where user_email='"+user+"')";
                break;
        }
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return rs;
    }
    public ResultSet par_event_det(int id){
        ResultSet rs=null;
        String sql="select * from tbl_event where event_id="+id;
        PreparedStatement pst;
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public boolean new_event(String name,String place,String cate,String food_avl,String desc,int fees,int ttl_pass,String event_date,String time,String last_date,String admin){
        String sql="insert into tbl_event(event_name,event_desc,event_releted,event_place,food_avl,event_fees,event_ttl_pass,event_avl_pass,event_date,event_time,last_reg_date,admin) values('"+name+"','"+desc+"','"+cate+"','"+place+"','"+food_avl+"',"+fees+","+ttl_pass+","+ttl_pass+",'"+event_date+"','"+time+"','"+last_date+"','"+admin+"')";
        try {
            con=DriverManager.getConnection(url,user,pwd);
            PreparedStatement pst=con.prepareStatement(sql);
            pst.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public String get_org_name(String email){
        String name="";
        try {
            String sql="select * from tbl_user where user_email='"+email+"'";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next())
                name=rs.getString(2);
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return name;
    }
    public String get_pic(String email){
        String pic="";
        try {
            String sql="select * from tbl_user where user_email='"+email+"'";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next())
                pic=rs.getString(4);
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pic;
    }
    public boolean reg_event(int id,String user){
        try {
            String sql="insert into tbl_event_reg values("+id+",'"+user+"')";
            Statement st=con.createStatement();
            String up="update tbl_event set event_avl_pass=event_avl_pass-1 where event_id="+id;
            st.execute(sql);
            Statement st1=con.createStatement();
            st1.execute(up);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean check_reg_event(int id,String user){
        try {
            String sql="select * from tbl_event_reg where user_email='"+user+"' and event_id="+id;
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            return !rs.isBeforeFirst();
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public ResultSet view_user_event(String user){
        ResultSet rs=null;
        PreparedStatement pst;
        String sql="select * from tbl_event where status is null or status='updated' and admin='"+user+"'";
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public boolean delete_event(int id){
        String sql="update tbl_event set status='cancelled' where event_id="+id;
        try {
            Statement st=con.createStatement();
            st.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean update_event(int id,String event_name,String food_avl,String place,String desc,String date,String time){
        String sql="update tbl_event set event_name='"+event_name+"', food_avl='"+food_avl+"', event_place='"+place+"',event_desc='"+desc+"',event_date='"+date+"',event_time='"+time+"',status='updated' where event_id="+id;
        try {
            PreparedStatement pst=con.prepareStatement(sql);
            pst.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean check_old_pwd(String user,String pwd){
        String sql="select * from tbl_user where user_email='"+user+"'";
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            rs.next();
            return rs.getString(3).equals(pwd);
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean update_pwd(String user,String pwd){
        String sql="update tbl_user set user_pwd='"+pwd+"' where user_email='"+user+"'";
        try {
            PreparedStatement pst=con.prepareStatement(sql);
            pst.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean update_profile(String name,String user){
        String sql="update tbl_user set user_name='"+name+"' where user_email='"+user+"'";
        try {
            PreparedStatement pst=con.prepareStatement(sql);
            pst.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean update_profile(String name,String user,String pic){
        String sql="update tbl_user set user_name='"+name+"',user_img='"+pic+"' where user_email='"+user+"'";
        try {
            PreparedStatement pst=con.prepareStatement(sql);
            pst.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(db_operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}