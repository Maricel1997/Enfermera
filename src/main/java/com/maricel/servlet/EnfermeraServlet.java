import com.maricel.dao.EnfermeraDAO;
import com.maricel.dao.EnfermeraDAOImpl;
import com.maricel.model.Enfermera;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

@WebServlet(urlPatterns="/EnfermeraServlet")
public class EnfermeraServlet extends HttpServlet {

    // Se define el objeto "enfermeraDao" de clase EnfermeraDAO.
    private EnfermeraDAO enfermeraDAO;

    public EnfermeraServlet(){
   
        super();
        // Se instancia la clase  EnfermeraDAOImpl.
        enfermeraDAO = new EnfermeraDAOImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.procesarSolicitud(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.procesarSolicitud(req, resp);
    }

    protected void procesarSolicitud(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Se redirecciona de acuerdo a la petición
        switch (request.getParameter("action")) {
            case "list":
                // this.list(request, response);
                break;
            case "create":
                this.create(request, response);
                break;
            case "read":
                // this.read(request, response);
                break;
            case "update":
                //this.update(request, response);
                break;
            case "delete":
                // this.delete(request, response);
                break;
            case "showRegister":
                this.showRegister(request, response);
                break;
            case "index":
                this.index(request, response);
                break;
            default:
                this.index(request, response);
                break;
        }

    }

     private void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
                 }

   private void showRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
               RequestDispatcher dispatcher = request.getRequestDispatcher("/view/create.jsp");
               dispatcher.forward(request, response);
    }

    private void create(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Se recogen los datos desde la peticion.
        String id = request.getParameter("Id");
        String nombre = request.getParameter("nombre");
        String especialidad = request.getParameter("especialidad");
        String telefono = request.getParameter("telefono");
        String email = request.getParameter("email");

        // Se crea el objeto que se envia al BD.
        Enfermera objEnfermera = new Enfermera();
        objEnfermera.setNombre(nombre);
        objEnfermera.setEspecialidad(especialidad);
        objEnfermera.setTelefono(telefono);
        objEnfermera.setEmail(email);
        
        // Se envia el objeto para insertar en la BD.
        enfermeraDAO.insert(objEnfermera);

        // Se ejecuta el método "index" para redireccionar al JSP "index.jsp"
        this.index(request, response);
    }
}