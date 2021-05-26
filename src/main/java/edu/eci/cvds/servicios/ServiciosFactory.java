package edu.eci.cvds.servicios;

import com.google.inject.Injector;
import edu.eci.cvds.sampleprj.dao.*;
import edu.eci.cvds.sampleprj.dao.mybatis.*;
import edu.eci.cvds.servicios.impl.serviciosSolidaridadIMPL;
import org.mybatis.guice.XMLMyBatisModule;

import java.util.Optional;

import static com.google.inject.Guice.createInjector;
import edu.eci.cvds.servicios.impl.serviciosSolidaridadIMPL;

public class ServiciosFactory {
    public ServiciosFactory(){}
}
