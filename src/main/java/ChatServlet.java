/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Altysh
 */
@WebServlet(urlPatterns = {"/ChatServlet"})
public class ChatServlet extends HttpServlet {

    static Vector<Message> myChat = new Vector<>();
    private static int id = -1;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             String lastid = request.getParameter("id");
        response.setContentType("application/x-www-form-urlencoded");
        Gson myGson = new Gson();
        int i = 0;
        
        
            i = Integer.parseInt(lastid);
            
            
        
        
        List<Message> mas = new ArrayList<>();
        for (Message m : myChat) {
            if (m.getId() > i) {
                mas.add(m);
            }
        }
        System.out.println(myGson.toJson(mas));
        response.getWriter().print(myGson.toJson(mas));
       
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("post");
                response.setContentType("application/x-www-form-urlencoded");
 Gson myGson = new Gson();
    String name = request.getParameter("name");
        String mess = request.getParameter("mes");
        int mesid = id++;
        Message m =new Message(mess, name, id); 
        myChat.add(m);
        System.out.println(myGson.toJson(m));
        response.getWriter().print(myGson.toJson(m));
    }
    
}
