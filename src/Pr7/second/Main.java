package homeWork.Pr7.second;

public class Main {
    public static void main(String[] args) {
        Connection con = new Connection();
        con.regID(con.getArrCon());
        System.out.println(con.getId());


    }
}
