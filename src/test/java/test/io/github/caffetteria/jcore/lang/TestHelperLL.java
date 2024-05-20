package test.io.github.caffetteria.jcore.lang;

import io.github.caffetteria.jcore.lang.CoreRuntimeException;
import io.github.caffetteria.jcore.lang.HelperLL;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class TestHelperLL {

    private static final String LLP = "java.library.path";

    @Test
    void testLL() throws IOException {
        File libraryPath = new File( "src/test/resources/core/helper_ll" );
        String llPath = System.getProperty( LLP );
        System.setProperty( LLP, llPath+File.pathSeparator+libraryPath.getCanonicalPath() );
        int count1 = HelperLL.ll( "test_ll_fug1" );
        Assertions.assertEquals( 1, count1 );
        Assertions.assertThrows( CoreRuntimeException.class, () -> HelperLL.ll( "test_ll_fug" ) );
        Assertions.assertEquals( 0, HelperLL.ll( "test_ll_not_found" ) );
    }

    @Test
    void testCoreRuntimeException(){
        Assertions.assertNotNull( new CoreRuntimeException() );
        Assertions.assertNotNull( new CoreRuntimeException( new CoreRuntimeException( "a" ) ) );
        Assertions.assertNotNull( new CoreRuntimeException( "c", new CoreRuntimeException( "b" ) ) );
    }

}
