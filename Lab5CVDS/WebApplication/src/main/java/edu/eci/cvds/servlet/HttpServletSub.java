package edu.eci.cvds.servlet;

import edu.eci.cvds.servlet.model.Todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Optional;


@WebServlet(
        urlPatterns = "/EstoNoEsURL"
)
public class HttpServletSub extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer responseWriter = resp.getWriter();
        String message = "";
        try {
            Optional<String> optId = Optional.ofNullable(req.getParameter("id"));
            Todo todo = Service.getTodo(Integer.parseInt(optId.get()));
            resp.setStatus(HttpServletResponse.SC_OK);
            ArrayList<Todo> todoSet = new ArrayList<>();
            todoSet.add(todo);
            message = Service.todosToHTMLTable(todoSet);
        }
        catch (MalformedURLException malformedURLException){
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            message = Service.getHTMLError(resp.getStatus(), "error interno en el servidor");
        }
        catch (NumberFormatException numberFormatException){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            message = Service.getHTMLError(resp.getStatus(),"requerimiento invalido");
        }
        catch (FileNotFoundException fileNotFoundException){
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            message = Service.getHTMLError(resp.getStatus(),"no existe un item con el identificador");
        }
        catch (Exception exception){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            message = Service.getHTMLError(resp.getStatus(),"Requerimiento invalido");
        }
        finally {
            responseWriter.write(message);
        }
    }
    @Override
    //Copiado del doGet
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer responseWriter = resp.getWriter();
        String message = "";
        try {
            Optional<String> optId = Optional.ofNullable(req.getParameter("id"));
            Todo todo = Service.getTodo(Integer.parseInt(optId.get()));
            resp.setStatus(HttpServletResponse.SC_OK);
            ArrayList<Todo> todoSet = new ArrayList<>();
            todoSet.add(todo);
            message = Service.todosToHTMLTable(todoSet);
        }
        catch (MalformedURLException malformedURLException){
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            message = Service.getHTMLError(resp.getStatus(), "error interno en el servidor");
        }
        catch (NumberFormatException numberFormatException){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            message = Service.getHTMLError(resp.getStatus(),"requerimiento invalido");
        }
        catch (FileNotFoundException fileNotFoundException){
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            message = Service.getHTMLError(resp.getStatus(),"no existe un item con el identificador");
        }
        catch (Exception exception){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            message = Service.getHTMLError(resp.getStatus(),"Requerimiento invalido");
        }
        finally {
            responseWriter.write(message);
        }
    }
}
