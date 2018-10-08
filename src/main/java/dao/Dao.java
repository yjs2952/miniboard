package dao;

public class Dao {
    private String UserID;
    private String UserPassword;
    private String UserEmaile;
    private String UserName;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public String getUserEmaile() {
        return UserEmaile;
    }

    public void setUserEmaile(String userEmaile) {
        UserEmaile = userEmaile;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
