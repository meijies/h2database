package mytest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.h2.tools.Server;

/**
 * @author meijie
 */
public class MyServer {

  public static void main(String[] args) throws SQLException {
    List<String> list = new ArrayList<>();
    list.add("-tcp");
    list.add("-web");
    Server.main(list.toArray(new String[list.size()]));
  }
}
