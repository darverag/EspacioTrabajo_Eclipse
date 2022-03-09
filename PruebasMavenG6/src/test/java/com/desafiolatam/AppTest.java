package com.desafiolatam;
import static org.junit.Assert.assertTrue;
import java.util.logging.Logger;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("")
public class AppTest  //AQUI VAN CLASES QUE PERMITAN VALIDAR EL CÓDIGO
{
    private static Logger logger = Logger.getLogger("com.desafiolatam.Apptest");
    
    @Test								
    @DisplayName("Metodo cacho")
    public void shouldAnswerWithTrue() {
    	logger.info("Por fin se solucione el cacho");
        assertTrue(false);
    }
}
