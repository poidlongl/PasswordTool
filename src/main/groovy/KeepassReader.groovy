

import de.slackspace.openkeepass.KeePassDatabase
import de.slackspace.openkeepass.domain.KeePassFile

/**
 * Created by leo on 28.11.15.
 */
class KeepassReader {

    private KeePassFile kpf = null

    public KeepassReader ( String path, String pass ) {
        kpf = KeePassDatabase.getInstance(path).openDatabase( pass );
    }

    public KeepassReader() {
        this("/home/leo/Documents/KeepassTest.kdbx", "kikeriki")
    }

    public String getPassFor(String name) {
        return kpf.getEntryByTitle("Test1").getPassword()
    }

}
