package internetshop.niva.il.servlet.mvc;



import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by ilugovecs on 2015.11.05..
 */
@Component
public class TVController implements MVCController  {

    public MVCModel execute(HttpServletRequest request, HttpServletResponse response) {

        {return new MVCModel(request.getParameter("4kid1"), "/TV.jsp");}
    }

}
