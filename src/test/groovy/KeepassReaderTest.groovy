

/**
 * Created by leo on 28.11.15.
 */
class KeepassReaderTest extends GroovyTestCase {

    KeepassReader kpr;

    void setUp() {

/*        System.properties.each { key, value ->
            println "$key: $value"
        }
*/
        super.setUp()
        kpr = new KeepassReader();
    }

    void testGetPassFor() {
        System.out.println("Password: " + kpr.getPassFor("Test1"));
    }
}
