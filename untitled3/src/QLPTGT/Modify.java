package QLPTGT;
import org.jetbrains.annotations.NotNull;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modify {
    public static List<QuanLyPTGT> findAll() {
        List<QuanLyPTGT> quanLyPTGTList = new ArrayList<>();
        Connection connection = null;

        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://192.168.56.101:3306/feedback?" + "user=sqluser3&password=123456" + "&useUnicode=true&characterEncoding=UTF-8");
            String sql = "Select * from feedback.comments";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                QuanLyPTGT quanLyPTGT = new QuanLyPTGT(
                        resultSet.getInt("ID"),
                        resultSet.getString("HãngSX"),
                        resultSet.getInt("NămSX"),
                        resultSet.getFloat("GiáBán"),
                        resultSet.getString("Màu"),
                        resultSet.getInt("SốChỗNgồi"),
                        resultSet.getString("KiểuĐộngCơ"),
                        resultSet.getString("CôngSuất"),
                        resultSet.getString("TrọngTải"));
                quanLyPTGTList.add(quanLyPTGT);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return quanLyPTGTList;
    }

    public static void Thêm(QuanLyPTGT quanLyPTGT) {
        Connection connection = null;

        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://192.168.56.101:3306/feedback?" + "user=sqluser3&password=123456" + "&useUnicode=true&characterEncoding=UTF-8");
            String sql = "insert into quanlyptgt(ID,HãngSX, NămSX, GiáBán, Màu, SốChỗNgồi, KiểuĐộngCơ, CôngSuất, TrọngTải) values(?,?,?,?,?,?,?,?,?)";
            statement = connection.prepareCall(sql);

            statement.setInt(1,quanLyPTGT.getID());
            statement.setString(2, quanLyPTGT.getHãngSX());
            statement.setInt(3, quanLyPTGT.getNămSX());
            statement.setFloat(4, quanLyPTGT.getGiáBán());
            statement.setString(5, quanLyPTGT.getMàu());
            statement.setInt(6, quanLyPTGT.getSốChỗNgồi());
            statement.setString(7, quanLyPTGT.getKiểuĐộngCơ());
            statement.setString(8, quanLyPTGT.getCôngSuất());
            statement.setString(9, quanLyPTGT.getTrọngTải());

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void Sửa(QuanLyPTGT quanLyPTGT) {
        Connection connection = null;

        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://192.168.56.101:3306/feedback?" + "user=sqluser3&password=123456" + "&useUnicode=true&characterEncoding=UTF-8");
            String sql = "update quanlyptgt set ID=?, HãngSX=?, NămSX=?, GiáBán=?, Màu=?, SốChỗNgồi=?, KiểuĐộngCơ=?, CôngSuất=?, TrọngTải=? where HãngSX=?, NămSX=?, GiáBán=?, Màu=?, SốChỗNgồi=?, KiểuĐộngCơ=?, CôngSuất=?, TrọngTải=? ";
            statement = connection.prepareCall(sql);

            statement.setInt(1,quanLyPTGT.getID());
            statement.setString(2, quanLyPTGT.getHãngSX());
            statement.setInt(3, quanLyPTGT.getNămSX());
            statement.setFloat(4, quanLyPTGT.getGiáBán());
            statement.setString(5, quanLyPTGT.getMàu());
            statement.setInt(6, quanLyPTGT.getSốChỗNgồi());
            statement.setString(7, quanLyPTGT.getKiểuĐộngCơ());
            statement.setString(8, quanLyPTGT.getCôngSuất());
            statement.setString(9, quanLyPTGT.getTrọngTải());

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


    }

    public static void Xóa(int ID) {
        Connection connection = null;

        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://192.168.56.101:3306/feedback?" + "user=sqluser3&password=123456" + "&useUnicode=true&characterEncoding=UTF-8");
            String sql = "delete from quanlyptgt where ID=? ";
            statement = connection.prepareCall(sql);

            statement.setInt(1, ID);


            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static List<QuanLyPTGT> findByID(int ID) {
        List<QuanLyPTGT> quanLyPTGTList = new ArrayList<>();
        Connection connection = null;

        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://192.168.56.101:3306/feedback?" + "user=sqluser3&password=123456" + "&useUnicode=true&characterEncoding=UTF-8");
            String sql = "Select * from quanlyptgt where ID =  ?";
            statement = connection.prepareCall(sql);
            statement.setInt(1, ID);

            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                QuanLyPTGT quanLyPTGT = new QuanLyPTGT(
                        resultSet.getInt("ID"),
                        resultSet.getString("HãngSX"),
                        resultSet.getInt("NămSX"),
                        resultSet.getFloat("GiáBán"),
                        resultSet.getString("Màu"),
                        resultSet.getInt("SốChỗNgồi"),
                        resultSet.getString("KiểuĐộngCơ"),
                        resultSet.getString("CôngSuất"),
                        resultSet.getString("TrọngTải"));
                quanLyPTGTList.add(quanLyPTGT);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return quanLyPTGTList;
    }

}