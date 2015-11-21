package internetshop.niva.il.servlet.mvc.controllers;

import internetshop.niva.il.database.DBException;
import internetshop.niva.il.database.jdbc.TVDAOImpl;
import internetshop.niva.il.servlet.mvc.MVCController;
import internetshop.niva.il.servlet.mvc.MVCModel;
import org.springframework.beans.factory.annotation.Autowired;
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

    public String getDB() throws DBException, SQLException, DBException, SQLException {
        tvdaoimpl.getById(2L).getTvebrand();
        return tvdaoimpl.getById(2L).getTvebrand();
    }

    public MVCModel execute(HttpServletRequest request, HttpServletResponse response)
          {return  new MVCModel("","/Menu.jsp");}
}
