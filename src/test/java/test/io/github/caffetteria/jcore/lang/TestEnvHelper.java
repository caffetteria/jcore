package test.io.github.caffetteria.jcore.lang;

import io.github.caffetteria.jcore.lang.EnvHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestEnvHelper {

    @Test
    void testCoreRuntimeException(){
        Assertions.assertNotNull( EnvHelper.getE( System.getenv().keySet().stream().findFirst().get() ) );
        Assertions.assertNotNull( EnvHelper.getP( System.getProperties().keySet().stream().findFirst().get().toString() ) );
    }

}
