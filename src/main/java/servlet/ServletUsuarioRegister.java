package servlet;

	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import controller.UsuarioController;

	/**
	 * Servlet implementation class ServletUsuarioRegister
	 */
	@WebServlet("/ServletUsuarioRegister")
	public class ServletUsuarioRegister extends HttpServlet {
		private static final long serialVersionUID = 1L;
		
		/**
		 * @see HttpServlet#HttpServlet()
		 */
		public ServletUsuarioRegister() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			UsuarioController usuario = new UsuarioController();
                        
                        String nombreUsuario = request.getParameter("nombreUsuario");
                        String apellidoUsuario = request.getParameter("apellidoUsuario");
                        String nombreMascota = request.getParameter("nombreMascota");
                        String razaMascota = request.getParameter("razaMascota");
                        String tipoMascota = request.getParameter("tipoMascota");
                        String correo = request.getParameter("correo");
                        String celular = request.getParameter("celular");
                        String direccion = request.getParameter("direccion");
                        int identificacionUsuario = Integer.parseInt(request.getParameter("identificacionUsuario"));			
			String username = request.getParameter("username");
			String contrasena = request.getParameter("contrasena");
			
			
			String result = usuario.register(username, contrasena, nombreUsuario, apellidoUsuario, nombreMascota, tipoMascota, correo, celular, direccion, identificacionUsuario, razaMascota);
			
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println(result);
			out.flush();
			out.close();
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}

	}
