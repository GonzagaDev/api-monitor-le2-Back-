package filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "CharacterEncodingFilter", urlPatterns = { "/rest/*" })
public class CharsetFilter implements Filter {

    @Override
    public void destroy() {
    }
    // Filtro para configurar o charset da api.
    // Todas as requisicoes que passarem por "/rest" vao passar por este metodo doFilter()
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        // configura o charset para todas as URLs a partir de /rest
        String charset = "UTF-8";
        request.setCharacterEncoding(charset);
        response.setCharacterEncoding(charset);
        chain.doFilter(request, response);
        System.out.println("Set current Charset UTF-8");
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
    }

}