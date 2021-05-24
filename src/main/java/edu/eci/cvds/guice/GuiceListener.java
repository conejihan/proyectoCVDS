package edu.eci.cvds.guice;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import edu.eci.cvds.sampleprj.dao.*;
import edu.eci.cvds.sampleprj.dao.mybatis.*;


public class GuiceListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.removeAttribute(Injector.class.getName());
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Injector injector = Guice.createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                install(JdbcHelper.PostgreSQL);
                setEnvironmentId("development");
                setClassPathResource("mybatis-config.xml");
                bind(CategoriaDAO.class).to(MyBatisCategoriaDAO.class);
                bind(ComentarioDAO.class).to(MyBatisComentarioDAO.class);
                bind(NecesidadDAO.class).to(MyBatisNecesidadDAO.class);
                bind(OfertaDAO.class).to(MyBatisOfertaDAO.class);
                bind(RespuestaDAO.class).to(MyBatisRespuestaDAO.class);
                bind(UsuarioDAO.class).to(MyBatisUsuarioDAO.class);
            }
        });

        servletContextEvent.getServletContext().setAttribute(Injector.class.getName(), injector);
    }
}