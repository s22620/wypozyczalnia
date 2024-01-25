package pl.pjatk.Wypozyczalnia;

public class User {
    private String accid;

    public User(String accid) {
        this.accid = accid;
    }

    public String getAccid() {
        return accid;
    }

    public void setAccid(String accid) {
        this.accid = accid;
    }

    @Override
    public String toString() {
        return "User{" +
                "accid='" + accid + '\'' +
                '}';
    }
}
