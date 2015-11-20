package internetshop.niva.il.servlet.mvc;

import internetshop.niva.il.database.DBException;
import internetshop.niva.il.database.jdbc.TVDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

/**
 * Created by voyager on 2015.11.03..
 */
@Component
public class MenuController implements MVCController {

    @Autowired
    private TVDAOImpl tvdaoimpl;


    public String tv4kuhd4045() throws DBException, SQLException {
        return tvdaoimpl.getByScreenSize("1").getTvscreensize();
    }

    public MVCModel execute(HttpServletRequest request, HttpServletResponse response)
            throws DBException, SQLException {
        request.setAttribute("4kid1", 1);
        return new MVCModel( tv4kuhd4045(),"/Menu.jsp");
    }
}
