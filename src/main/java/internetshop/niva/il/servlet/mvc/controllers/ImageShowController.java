package internetshop.niva.il.servlet.mvc.controllers;

import internetshop.niva.il.database.DBException;
import internetshop.niva.il.database.jdbc.TVDAOImpl;
import internetshop.niva.il.servlet.mvc.MVCController;
import internetshop.niva.il.servlet.mvc.MVCModel;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by ilugovecs on 2015.11.20..
 */

@Component
public class ImageShowController extends HttpServlet implements MVCController {

        public void getImage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            int ImageID = 0;
            TVDAOImpl tv = new TVDAOImpl();
            Connection connection = null;
            if (req.getParameter("imgID") != null) {
                try {
                    ImageID = Integer.parseInt(req.getParameter("imgID"));
                    byte[] imgData = tv.getImage(ImageID);
                    resp.setContentType("image/jpeg");
                    OutputStream outputStream = resp.getOutputStream();
                    outputStream.write(imgData);
                    resp.getOutputStream().flush();
                    resp.getOutputStream().close();
                    // return;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

public String getTV() throws DBException, SQLException {
    TVDAOImpl tvdaoimpl = new TVDAOImpl();
   // tvdaoimpl.get4KUHD(1);
    return tvdaoimpl.getByScreenSize("1").getTvscreensize();
}

 public MVCModel execute(HttpServletRequest request, HttpServletResponse response)
         throws DBException, SQLException {return new MVCModel(getTV(), "/helloWorld.jsp");
    }


}