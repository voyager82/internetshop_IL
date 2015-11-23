package internetshop.niva.il.servlet.mvc.controllers;

import internetshop.niva.il.database.jdbc.TVDAOImpl;
import internetshop.niva.il.servlet.mvc.MVCController;
import internetshop.niva.il.servlet.mvc.MVCModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by voyager on 2015.11.03..
 */

@Component
public class MenuController implements MVCController {

    @Autowired
    private TVDAOImpl tvdaoimpl;

    public MVCModel execute(HttpServletRequest request, HttpServletResponse response)
          {return  new MVCModel("","/Menu.jsp");}
}
