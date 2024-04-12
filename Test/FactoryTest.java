import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {

   @Test
   @DisplayName("Camion")

    void testGetTransporteCamion() {

        Comun salida = FactoryTransporte.getTransporte(FactoryTransporte.CAMION);
        assertTrue(salida instanceof  Camion);
    }

    @Test
    @DisplayName("Bicicleta")
    public void testGetTransporteBicicleta() {
        Comun salida = FactoryTransporte.getTransporte(FactoryTransporte.BICICLETA);
        assertTrue(salida instanceof  Bicicleta);
    }




}
