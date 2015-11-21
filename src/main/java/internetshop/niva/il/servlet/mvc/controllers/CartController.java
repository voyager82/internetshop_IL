package internetshop.niva.il.servlet.mvc.controllers;

import internetshop.niva.il.servlet.mvc.MVCController;
import internetshop.niva.il.servlet.mvc.MVCModel;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ilugovecs on 2015.11.17..
 */
@Component
public class CartController implements MVCController {

    public MVCModel execute (HttpServletRequest request, HttpServletResponse response) {return  new MVCModel("", "/Cart.jsp");}
}
