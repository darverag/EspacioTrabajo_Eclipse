package com.desafiolatam;
import static org.junit.Assert.assertTrue;
import java.util.logging.Logger;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


@DisplayName("AppTest")
public class AppTest {
	
	private static Logger logger = Logger.getLogger("com.desafiolatam.Apptest");
   
	@BeforeAll
    public void metodoBeforeAll() {
    	logger.info("metodo before all");
    }
	
	@BeforeEach
    public void metodoBeforeEach() {
    	logger.info("metodo before each");
    }
    
	@Test							//LOS TEST VAN AL CENTRO 
	@DisplayName("Metodo Cacho")
    public void shouldAnswerWithTrue(){
    	logger.info("Por fin se solucionó el cacho");
        assertTrue(true);
    }
	
	@AfterEach
    public void metodoAfterEach() {
    	logger.info("metodo After each");
    	
    }
    
    @AfterAll
    public void metodoAfterAll() {
    	logger.info("metodo after All");
    }
    
    
}
