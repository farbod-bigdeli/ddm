package ddm.common.utility.file_helper;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHelper {
    public static String CurrentDir() {
        return System.getProperty("user.dir");
    }

    public static Path JarLocation() throws URISyntaxException {
        return Paths.get(FileHelper.class.getProtectionDomain().getCodeSource().getLocation().toURI());
    }
}
