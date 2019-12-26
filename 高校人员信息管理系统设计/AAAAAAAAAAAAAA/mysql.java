package AAAAAAAAAAAAAA;

import java.io.*;
import java.sql.*;
import java.util.Scanner;
public class mysql {
    //添加
    public void zhuce1(String id ,String name ,String sex,String age ,String xibu,String zhuanye,String zhicheng,String shiyanshi,String zhiwu,String zhengzhi) throws ClassNotFoundException, SQLException {
        Connection conn;
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");
        if(denglu(name,id)==1){
            chongfu m = new chongfu();
            m.play();
            return ;
        }
        String sql = "insert into test.teacher values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement state = conn.prepareStatement(sql);
        state.setString(1, id);                           //将第n个值替换成某个值
        state.setString(2, name);
        state.setString(3, sex);
        state.setString(4, age);
        state.setString(5, xibu);                           //将第n个值替换成某个值
        state.setString(6, zhuanye);
        state.setString(7, zhicheng);
        state.setString(8, shiyanshi);
        state.setString(9, zhiwu);
        state.setString(10, zhengzhi);
        state.executeUpdate();                  //执行插入操作
        Accept1 e = new Accept1();
        e.play();
    }
    public void zhuce2(String id ,String name ,String sex,String age ,String xibu,String zhuanye,String zhicheng,String shiyanshi,String zhiwu,String zhengzhi) throws ClassNotFoundException, SQLException {
        Connection conn;
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");
        if(denglu(name,id)==1){
            chongfu m = new chongfu();
            m.play();
            return;
        }
        String sql = "insert into test.shiyanyuan values (?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement state = conn.prepareStatement(sql);
        state.setString(1, id);                           //将第n个值替换成某个值
        state.setString(2, name);
        state.setString(3, sex);
        state.setString(4, age);
        state.setString(5, xibu);                           //将第n个值替换成某个值
        state.setString(6, zhuanye);
        state.setString(7, zhicheng);
        state.setString(8, shiyanshi);
        state.setString(9, zhiwu);
        state.setString(10, zhengzhi);
        state.executeUpdate();
        Accept1 e = new Accept1();
        e.play();
    }
    public void zhuce3(String id ,String name ,String sex,String age ,String xibu,String zhuanye,String zhicheng,String shiyanshi,String zhiwu,String zhengzhi) throws ClassNotFoundException, SQLException {
        Connection conn;
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");
        if(denglu(name,id)==1){
            chongfu m = new chongfu();
            m.play();
            return;
        }
        String sql = "insert into test.xingzheng values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement state = conn.prepareStatement(sql);
        state.setString(1, id);                           //将第n个值替换成某个值
        state.setString(2, name);
        state.setString(3, sex);
        state.setString(4, age);
        state.setString(5, xibu);                           //将第n个值替换成某个值
        state.setString(6, zhuanye);
        state.setString(7, zhicheng);
        state.setString(8, shiyanshi);
        state.setString(9, zhiwu);
        state.setString(10, zhengzhi);
        state.executeUpdate();                 //执行插入操作
        Accept1 e = new Accept1();
        e.play();
    }
    public void zhuce4(String id ,String name ,String sex,String age ,String xibu,String zhuanye,String zhicheng,String shiyanshi,String zhiwu,String zhengzhi) throws ClassNotFoundException, SQLException {
        Connection conn;
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");
        if(denglu(name,id)==1){
            chongfu m = new chongfu();
            m.play();
            return;
        }
        String sql = "insert into test.teacher_xingzheng values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement state = conn.prepareStatement(sql);
        state.setString(1, id);                           //将第n个值替换成某个值
        state.setString(2, name);
        state.setString(3, sex);
        state.setString(4, age);
        state.setString(5, xibu);                           //将第n个值替换成某个值
        state.setString(6, zhuanye);
        state.setString(7, zhicheng);
        state.setString(8, shiyanshi);
        state.setString(9, zhiwu);
        state.setString(10, zhengzhi);
        state.executeUpdate();         //执行插入操作
        Accept1 e = new Accept1();
        e.play();
    }
    public int denglu(String name, String id) throws ClassNotFoundException, SQLException {
        Connection conn;
        int flag=0;
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");

        String sql1 = "select * from test.teacher where name=?";
        PreparedStatement state1 = conn.prepareStatement(sql1);                    //容器
        state1.setString(1, name);                           //将第n个值替换成某个值
        ResultSet re1 = state1.executeQuery();                       //上传数据库返回结果集
        if (re1.next()) {
            flag=1;//如果取到了值，fanhui-1;
        }

        String sql2 = "select * from test.shiyanyuan where name=?";
        PreparedStatement state2 = conn.prepareStatement(sql2);                    //容器
        state2.setString(1, name);                           //将第n个值替换成某个值
        ResultSet re2 = state2.executeQuery();
        if (re2.next()) {
            flag=1;//如果取到了值，fanhui-1;
        }

        String sql3 = "select * from test.xingzheng where name=?";
        PreparedStatement state3 = conn.prepareStatement(sql3);                    //容器
        state3.setString(1, name);                           //将第n个值替换成某个值
        ResultSet re3 = state3.executeQuery();
        if (re3.next()) {
            flag=1;//如果取到了值，fanhui-1;
        }

        String sql4 = "select * from test.teacher_xingzheng where name=?";
        PreparedStatement state4 = conn.prepareStatement(sql4);                    //容器
        state4.setString(1, name);                           //将第n个值替换成某个值
        ResultSet re4 = state4.executeQuery();
        if (re4.next()) {
            flag=1;//如果取到了值，fanhui-1;
        }

        String sql5 = "select * from test.teacher where id=?";
        PreparedStatement state5 = conn.prepareStatement(sql5);                    //容器
        state5.setString(1, id);                           //将第n个值替换成某个值
        ResultSet re5 = state5.executeQuery();                       //上传数据库返回结果集
        if (re5.next()) {
            flag=1;//如果取到了值，fanhui-1;
        }

        String sql6 = "select * from test.shiyanyuan where id=?";
        PreparedStatement state6 = conn.prepareStatement(sql6);                    //容器
        state6.setString(1, id);                           //将第n个值替换成某个值
        ResultSet re6 = state6.executeQuery();
        if (re6.next()) {
            flag=1;//如果取到了值，fanhui-1;
        }

        String sql7 = "select * from test.xingzheng where id=? ";
        PreparedStatement state7 = conn.prepareStatement(sql7);                    //容器
        state7.setString(1, id);                           //将第n个值替换成某个值
        ResultSet re7 = state7.executeQuery();
        if (re7.next()) {
            flag=1;//如果取到了值，fanhui-1;
        }

        String sql8 = "select * from test.teacher_xingzheng where id=? ";
        PreparedStatement state8 = conn.prepareStatement(sql8);                    //容器
        state8.setString(1, id);                           //将第n个值替换成某个
        ResultSet re8 = state8.executeQuery();
        if (re8.next()) {
            flag=1;//如果取到了值，fanhui-1;
        }
        if(flag==1)
            return 1;
        else
            return 0;
    }
    //
    //删除
    public void del(String name) throws ClassNotFoundException, SQLException {
        Connection conn;
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");

        String sql = "delete from test.teacher where name = ?";
        PreparedStatement state = conn.prepareStatement(sql);
        state.setString(1, name);
        state.executeUpdate();

        String sq2 = "delete from test.xingzheng where name = ?";
        PreparedStatement state2 = conn.prepareStatement(sq2);
        state2.setString(1, name);
        state2.executeUpdate();

        String sq3 = "delete from test.shiyanyuan where name = ?";
        PreparedStatement state3 = conn.prepareStatement(sq3);
        state3.setString(1, name);
        state3.executeUpdate();

        String sq4 = "delete from test.teacher_xingzheng where name = ?";
        PreparedStatement state4 = conn.prepareStatement(sq4);
        state4.setString(1, name);
        state4.executeUpdate();
    }
    public void del2(String name,String id) throws ClassNotFoundException, SQLException {
        Connection conn;
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");

        String sql = "delete from test.teacher where name = ?";
        PreparedStatement state = conn.prepareStatement(sql);
        state.setString(1, name);
        state.executeUpdate();

        String sq2 = "delete from test.xingzheng where name = ?";
        PreparedStatement state2 = conn.prepareStatement(sq2);
        state2.setString(1, name);
        state2.executeUpdate();

        String sq3 = "delete from test.shiyanyuan where name = ?";
        PreparedStatement state3 = conn.prepareStatement(sq3);
        state3.setString(1, name);
        state3.executeUpdate();

        String sq4 = "delete from test.teacher_xingzheng where name = ?";
        PreparedStatement state4 = conn.prepareStatement(sq4);
        state4.setString(1, name);
        state4.executeUpdate();

        String sq5 = "delete from test.teacher where id = ?";
        PreparedStatement state5 = conn.prepareStatement(sq5);
        state5.setString(1, id);
        state5.executeUpdate();

        String sq6 = "delete from test.xingzheng where id = ?";
        PreparedStatement state6 = conn.prepareStatement(sq6);
        state6.setString(1, id);
        state6.executeUpdate();

        String sq7 = "delete from test.shiyanyuan where id = ?";
        PreparedStatement state7 = conn.prepareStatement(sq7);
        state7.setString(1, id);
        state7.executeUpdate();

        String sq8 = "delete from test.teacher_xingzheng where id = ?";
        PreparedStatement state8 = conn.prepareStatement(sq8);
        state8.setString(1, id);
        state8.executeUpdate();
    }
    //计数
    public int count1() throws ClassNotFoundException, SQLException {
        int sum=0;
        Connection conn;
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");
        String sql = "select * from test.teacher";
        PreparedStatement state = conn.prepareStatement(sql);
        ResultSet re1 = state.executeQuery();
        while(re1.next()){
            sum++;
        }
        return sum;
    }
    public int count2() throws ClassNotFoundException, SQLException {
        int sum=0;
        Connection conn;
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");
        String sql = "select * from test.shiyanyuan";
        PreparedStatement state = conn.prepareStatement(sql);
        ResultSet re1 = state.executeQuery();
        while(re1.next()){
            sum++;
        }
        return sum;
    }
    public int count3() throws ClassNotFoundException, SQLException {
        int sum=0;
        Connection conn;
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");
        String sql = "select * from test.xingzheng";
        PreparedStatement state = conn.prepareStatement(sql);
        ResultSet re1 = state.executeQuery();
        while(re1.next()){
            sum++;
        }
        return sum;
    }
    public int count4() throws ClassNotFoundException, SQLException {
        int sum=0;
        Connection conn;
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");
        String sql = "select * from test.teacher_xingzheng";
        PreparedStatement state = conn.prepareStatement(sql);
        ResultSet re1 = state.executeQuery();
        while(re1.next()){
            sum++;
        }
        return sum;
    }
    public int count5() throws ClassNotFoundException, SQLException {
        int sum=0;
        Connection conn;
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");

        String sql = "select * from test.teacher_xingzheng";
        PreparedStatement state = conn.prepareStatement(sql);
        ResultSet re1 = state.executeQuery();
        while(re1.next()){
            if(re1.getString(3).equals("男"))
                 sum++;
        }

        String sql2 = "select * from test.teacher";
        PreparedStatement state2 = conn.prepareStatement(sql2);
        ResultSet re2 = state2.executeQuery();
        while(re2.next()){
            if(re2.getString(3).equals("男")){
                sum++;
            }

        }

        String sql3 = "select * from test.shiyanyuan";
        PreparedStatement state3 = conn.prepareStatement(sql3);
        ResultSet re3 = state3.executeQuery();
        while(re3.next()){
            if(re3.getString(3).equals("男")){
                sum++;
            }
        }

        String sql4 = "select * from test.xingzheng";
        PreparedStatement state4 = conn.prepareStatement(sql4);
        ResultSet re4 = state4.executeQuery();
        while(re4.next()){
            if(re4.getString(3).equals("男")){
                sum++;
            }
        }
        return sum;
    }
    public int count6() throws ClassNotFoundException, SQLException {
        int sum=0;
        Connection conn;
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");

        String sql = "select * from test.teacher_xingzheng";
        PreparedStatement state = conn.prepareStatement(sql);
        ResultSet re1 = state.executeQuery();
        while(re1.next()){
            if(re1.getString(3).equals("女")){
                sum++;
            }

        }

        String sql2 = "select * from test.teacher";
        PreparedStatement state2 = conn.prepareStatement(sql2);
        ResultSet re2 = state2.executeQuery();
        while(re2.next()){
            if(re2.getString(3).equals("女")){
                sum++;
            }
        }

        String sql3 = "select * from test.shiyanyuan";
        PreparedStatement state3 = conn.prepareStatement(sql3);
        ResultSet re3 = state3.executeQuery();
        while(re3.next()){
            if(re3.getString(3).equals("女")){
                sum++;
            }
        }

        String sql4 = "select * from test.xingzheng";
        PreparedStatement state4 = conn.prepareStatement(sql4);
        ResultSet re4 = state4.executeQuery();
        while(re4.next()){
            if(re4.getString(3).equals("女")){
                sum++;
            }
        }
        return sum;
    }
    //查id
    public void chaxun1(String id) throws ClassNotFoundException, SQLException {
        Connection conn;
        int flag=0;
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");

        String sql1 = "select * from test.teacher where id=? ";
        PreparedStatement state1 = conn.prepareStatement(sql1);                    //容器
        state1.setString(1, id);                           //将第n个值替换成某个值
        ResultSet re1 = state1.executeQuery();                       //上传数据库返回结果集
        if (re1.next()) {

            xiugai m = new xiugai(re1.getString(1),re1.getString(2),re1.getString(3),re1.getString(4),re1.getString(5),re1.getString(6),re1.getString(7),re1.getString(8),re1.getString(9),re1.getString(10));
            m.play(re1.getString(1),re1.getString(2),re1.getString(3),re1.getString(4),re1.getString(5),re1.getString(6),re1.getString(7),re1.getString(8),re1.getString(9),re1.getString(10));
            return ;
        }

        String sql2 = "select * from test.shiyanyuan where id=?";
        PreparedStatement state2 = conn.prepareStatement(sql2);                    //容器
        state2.setString(1, id);                           //将第n个值替换成某个值
        ResultSet re2 = state2.executeQuery();
        if (re2.next()) {
            xiugai m = new xiugai(re2.getString(1),re2.getString(2),re2.getString(3),re2.getString(4),re2.getString(5),re2.getString(6),re2.getString(7),re2.getString(8),re2.getString(9),re2.getString(10));
            m.play(re2.getString(1),re2.getString(2),re2.getString(3),re2.getString(4),re2.getString(5),re2.getString(6),re2.getString(7),re2.getString(8),re2.getString(9),re2.getString(10));
            return;
        }

        String sql3 = "select * from test.xingzheng where id=?";
        PreparedStatement state3 = conn.prepareStatement(sql3);                    //容器
        state3.setString(1, id);                           //将第n个值替换成某个值
        ResultSet re3 = state3.executeQuery();
        if (re3.next()) {
            xiugai m = new xiugai(re3.getString(1),re3.getString(2),re3.getString(3),re3.getString(4),re3.getString(5),re3.getString(6),re3.getString(7),re3.getString(8),re3.getString(9),re3.getString(10));
            m.play(re3.getString(1),re3.getString(2),re3.getString(3),re3.getString(4),re3.getString(5),re3.getString(6),re3.getString(7),re3.getString(8),re3.getString(9),re3.getString(10));
            return;
        }

        String sql4 = "select * from test.teacher_xingzheng where id=?";
        PreparedStatement state4 = conn.prepareStatement(sql4);                    //容器
        state4.setString(1, id);                           //将第n个值替换成某个值
        ResultSet re4 = state4.executeQuery();
        if (re4.next()) {
            xiugai m = new xiugai(re4.getString(1),re4.getString(2),re4.getString(3),re4.getString(4),re4.getString(5),re4.getString(6),re4.getString(7),re4.getString(8),re4.getString(9),re4.getString(10));
            m.play(re4.getString(1),re4.getString(2),re4.getString(3),re4.getString(4),re4.getString(5),re4.getString(6),re4.getString(7),re4.getString(8),re4.getString(9),re4.getString(10));
            return;
        }
        notexist m = new notexist();
        m.play();

    }
    //查名
    public void chaxun2(String name) throws ClassNotFoundException, SQLException{
        Connection conn;
        int flag=0;
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");

        String sql1 = "select * from test.teacher where name=? ";
        PreparedStatement state1 = conn.prepareStatement(sql1);                    //容器
        state1.setString(1, name);                           //将第n个值替换成某个值
        ResultSet re1 = state1.executeQuery();                       //上传数据库返回结果集
        if (re1.next()) {
            xiugai m = new xiugai(re1.getString(1),re1.getString(2),re1.getString(3),re1.getString(4),re1.getString(5),re1.getString(6),re1.getString(7),re1.getString(8),re1.getString(9),re1.getString(10));
            m.play(re1.getString(1),re1.getString(2),re1.getString(3),re1.getString(4),re1.getString(5),re1.getString(6),re1.getString(7),re1.getString(8),re1.getString(9),re1.getString(10));
            return ;
        }

        String sql2 = "select * from test.shiyanyuan where name=?";
        PreparedStatement state2 = conn.prepareStatement(sql2);                    //容器
        state2.setString(1, name);                           //将第n个值替换成某个值
        ResultSet re2 = state2.executeQuery();
        if (re2.next()) {
            xiugai m = new xiugai(re2.getString(1),re2.getString(2),re2.getString(3),re2.getString(4),re2.getString(5),re2.getString(6),re2.getString(7),re2.getString(8),re2.getString(9),re2.getString(10));
            m.play(re2.getString(1),re2.getString(2),re2.getString(3),re2.getString(4),re2.getString(5),re2.getString(6),re2.getString(7),re2.getString(8),re2.getString(9),re2.getString(10));
            return;
        }

        String sql3 = "select * from test.xingzheng where name=?";
        PreparedStatement state3 = conn.prepareStatement(sql3);                    //容器
        state3.setString(1, name);                           //将第n个值替换成某个值
        ResultSet re3 = state3.executeQuery();
        if (re3.next()) {
            xiugai m = new xiugai(re3.getString(1),re3.getString(2),re3.getString(3),re3.getString(4),re3.getString(5),re3.getString(6),re3.getString(7),re3.getString(8),re3.getString(9),re3.getString(10));
            m.play(re3.getString(1),re3.getString(2),re3.getString(3),re3.getString(4),re3.getString(5),re3.getString(6),re3.getString(7),re3.getString(8),re3.getString(9),re3.getString(10));
            return;
        }

        String sql4 = "select * from test.teacher_xingzheng where name=?";
        PreparedStatement state4 = conn.prepareStatement(sql4);                    //容器
        state4.setString(1, name);                           //将第n个值替换成某个值
        ResultSet re4 = state4.executeQuery();
        if (re4.next()) {
            xiugai m = new xiugai(re4.getString(1),re4.getString(2),re4.getString(3),re4.getString(4),re4.getString(5),re4.getString(6),re4.getString(7),re4.getString(8),re4.getString(9),re4.getString(10));
            m.play(re4.getString(1),re4.getString(2),re4.getString(3),re4.getString(4),re4.getString(5),re4.getString(6),re4.getString(7),re4.getString(8),re4.getString(9),re4.getString(10));
            return;
        }
        notexist m = new notexist();
        m.play();

    }
    //保存
    public void baocun() throws ClassNotFoundException, SQLException{
        try{
            FileWriter f=new FileWriter("C:\\Users\\asus\\Desktop\\1.txt");
            f.write("");
            f.flush();
            f.close();

            FileWriter f1=new FileWriter("C:\\Users\\asus\\Desktop\\2.txt");
            f1.write("");
            f1.flush();
            f1.close();

            FileWriter f2=new FileWriter("C:\\Users\\asus\\Desktop\\3.txt");
            f2.write("");
            f2.flush();
            f2.close();

            FileWriter f3=new FileWriter("C:\\Users\\asus\\Desktop\\4.txt");
            f3.write("");
            f3.flush();
            f3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Connection conn;
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");

        String sql1 = "select * from test.teacher";
        PreparedStatement state1 = conn.prepareStatement(sql1);                    //容器
        ResultSet re1 = state1.executeQuery();                       //上传数据库返回结果集
        String[] p=new String[count1()];
        int count=0;
        while(re1.next()){
            StringBuilder sb=new StringBuilder();
            for(int i=1;i<11;i++){
                sb.append(re1.getString(i)).append(" ");
            }
            p[count]=sb.toString();
            count+=1;
        }
        try (BufferedWriter b = new BufferedWriter(new FileWriter("C:\\Users\\asus\\Desktop\\1.txt",true))) {
            for(int i=0;i<p.length;i++){
                b.write(p[i]);
                b.newLine();
            }
        } catch (IOException i) {
            System.out.println("写入失败");
        }

        String sql2 = "select * from test.shiyanyuan";
        PreparedStatement state2 = conn.prepareStatement(sql2);                    //容器
        ResultSet re2 = state2.executeQuery();                       //上传数据库返回结果集
        String[] p2=new String[count2()];
        int count2=0;
        while(re2.next()){
            StringBuilder sb2=new StringBuilder();
            for(int i=1;i<11;i++){
                sb2.append(re2.getString(i)).append(" ");
            }
            p2[count2]=sb2.toString();
            count2+=1;
        }
        try (BufferedWriter b2 = new BufferedWriter(new FileWriter("C:\\Users\\asus\\Desktop\\2.txt",true))) {
            for(int i=0;i<p2.length;i++){
                b2.write(p2[i]);
                b2.newLine();
            }
        } catch (IOException i) {
            System.out.println("写入失败");
        }

        String sql3 = "select * from test.xingzheng";
        PreparedStatement state3 = conn.prepareStatement(sql3);                    //容器
        ResultSet re3 = state3.executeQuery();                       //上传数据库返回结果集
        String[] p3=new String[count3()];
        int count3=0;
        while(re3.next()){
            StringBuilder sb3=new StringBuilder();
            for(int i=1;i<11;i++){
                sb3.append(re3.getString(i)).append(" ");
            }
            p3[count3]=sb3.toString();
            count3+=1;
        }
        try (BufferedWriter b3 = new BufferedWriter(new FileWriter("C:\\Users\\asus\\Desktop\\3.txt",true))) {
            for(int i=0;i<p3.length;i++){
                b3.write(p3[i]);
                b3.newLine();
            }
        } catch (IOException i) {
            System.out.println("写入失败");
        }

        String sql4 = "select * from test.teacher_xingzheng";
        PreparedStatement state4 = conn.prepareStatement(sql4);                    //容器
        ResultSet re4 = state4.executeQuery();                       //上传数据库返回结果集
        String[] p4=new String[count4()];
        int count4=0;
        while(re4.next()){
            StringBuilder sb4=new StringBuilder();
            for(int i=1;i<11;i++){
                sb4.append(re4.getString(i)).append(" ");
            }
            p4[count4]=sb4.toString();
            count4+=1;
        }
        try (BufferedWriter b4 = new BufferedWriter(new FileWriter("C:\\Users\\asus\\Desktop\\4.txt",true))) {
            for(int i=0;i<p4.length;i++){
                b4.write(p4[i]);
                b4.newLine();
            }
        } catch (IOException i) {
            System.out.println("写入失败");
        }
    }
    //读取
    public void duqu() throws ClassNotFoundException, SQLException{
        Connection conn;
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");

        try(BufferedReader b=new BufferedReader(new FileReader("C:\\Users\\asus\\Desktop\\1.txt"))){
            String str="";
            while ((str = b.readLine()) != null){
                String[] p=str.split(" ");
                if(denglu(p[1],p[0])==0){
                    zhuce1(p[0],p[1],p[2],p[3],p[4],p[5],p[6],p[7],p[8],p[9]);
                }
            }
        } catch (IOException e) {
            System.out.println("读取失败");
        }

        try(BufferedReader b=new BufferedReader(new FileReader("C:\\Users\\asus\\Desktop\\2.txt"))){
            String str="";
            while ((str = b.readLine()) != null){
                String[] p=str.split(" ");
                if(denglu(p[1],p[0])==0){
                    zhuce2(p[0],p[1],p[2],p[3],p[4],p[5],p[6],p[7],p[8],p[9]);
                }
            }
        } catch (IOException e) {
            System.out.println("读取失败");
        }

        try(BufferedReader b=new BufferedReader(new FileReader("C:\\Users\\asus\\Desktop\\3.txt"))){
            String str="";
            while ((str = b.readLine()) != null){
                String[] p=str.split(" ");
                if(denglu(p[1],p[0])==0){
                    zhuce3(p[0],p[1],p[2],p[3],p[4],p[5],p[6],p[7],p[8],p[9]);
                }
            }
        } catch (IOException e) {
            System.out.println("读取失败");
        }

        try(BufferedReader b=new BufferedReader(new FileReader("C:\\Users\\asus\\Desktop\\4.txt"))){
            String str="";
            while ((str = b.readLine()) != null){
                String[] p=str.split(" ");
                if(denglu(p[1],p[0])==0){
                    zhuce4(p[0],p[1],p[2],p[3],p[4],p[5],p[6],p[7],p[8],p[9]);
                }
            }
        } catch (IOException e) {
            System.out.println("读取失败");
        }
    }
    //修改
    public void xiugai (String name , String leixing ,String s)throws ClassNotFoundException, SQLException{
        try{
            Connection conn;
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT", "root", "68115tfq");
            String sql="";
            if(leixing=="id"){
                sql = "update test.teacher set id = ? where name= ? ";
            }
            if(leixing=="name"){
                sql = "update  test.teacher set name = ? where name= ? ";
            }
            if(leixing=="sex"){
                sql = "update test.teacher set sex = ? where name= ? ";
            }
            if(leixing=="age"){
                sql = "update test.teacher set age = ? where name= ? ";
            }
            if(leixing=="xibu"){
                sql = "update test.teacher set xibu = ? where name= ? ";
            }
            if(leixing=="zhuanye"){
                sql = "update test.teacher set zhuanye = ? where name= ? ";
            }
            if(leixing=="zhicheng"){
                sql = "update test.teacher set zhicheng = ? where name= ? ";
            }
            if(leixing=="shiyanshi"){
                sql = "update test.teacher set shiyanshi = ? where name= ? ";
            }
            if(leixing=="zhiwu"){
                sql = "update test.teacher set zhiwu = ? where name= ? ";
            }
            if(leixing=="zhengzhi") {
                sql = "update test.teacher set zhengzhi = ? where name= ? ";
            }
            PreparedStatement state = conn.prepareStatement(sql);
            state.setString(1,s);
            state.setString(2,name);
            state.executeUpdate();
        }catch (NullPointerException e){
            e.printStackTrace();
        }

    }

}


