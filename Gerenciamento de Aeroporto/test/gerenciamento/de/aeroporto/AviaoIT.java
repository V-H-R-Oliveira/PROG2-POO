package gerenciamento.de.aeroporto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AviaoIT {
    
    public AviaoIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testesMetodos() {
        Aviao a1 = new Aviao(1, "GOL");
        Aviao a2 = new Aviao(2, "GOL");
        Aviao a3 = new Aviao(3, "GOL");
        Aviao a4 = new Aviao(4, "GOL");
        
        Aeroporto curitiba = new Aeroporto(1, "Curitiba");
        Aeroporto londrina = new Aeroporto(2, "Londrina");
        
        londrina.decolar(a1);
        curitiba.aterrissar(a1);
        
        londrina.decolar(a2);
        curitiba.aterrissar(a2);
        
        curitiba.decolar(a3);
        londrina.aterrissar(a3);
        
        curitiba.decolar(a4);
        londrina.aterrissar(a4);
        
        System.out.println("----- CURITIBA -----");
        curitiba.listar();
        System.out.println("----- LONDRINA -----");
        londrina.listar();
    }
}
