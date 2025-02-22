
package diff.rednaga;

import android.content.res.AXMLResource;

import java.io.*;
import java.util.Properties;

public class AXMLPrinter {

    private static String VERSION;

    static {
        InputStream templateStream = AXMLPrinter.class.getClassLoader().getResourceAsStream("axmlprinter.properties");
        if (templateStream != null) {
            Properties properties = new Properties();
            String version = "(unknown version)";
            try {
                properties.load(templateStream);
                version = properties.getProperty("application.version");
            } catch (IOException ex) {
                System.err.println("Unable to find version number!");
            }
            VERSION = version;
        } else {
            VERSION = "[unknown version - no properties found]";
        }

    }

    public static void main(String[] arguments) throws IOException {
        if (arguments.length < 1) {
            System.out.println("Usage: AXMLPrinter <binary xml file>");
            return;
        }

        if (arguments[0].equalsIgnoreCase("-v") || arguments[0].equalsIgnoreCase("-version")) {
            //System.out.printf("axmlprinter %s (http://github.com/rednaga/axmlprinter2)\n", VERSION);
            //System.out.printf("Copyright (C) 2015-2025 Red Naga - Tim 'diff' Strazzere (diff@protonmail.com)\n");
            return;
        }

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            AXMLResource axmlResource = new AXMLResource();
            fileInputStream = new FileInputStream(arguments[0]);
            axmlResource.read(fileInputStream);

            axmlResource.print();

            if (arguments.length > 1) {
                File file = new File(arguments[1]);
                fileOutputStream = new FileOutputStream(file);
                axmlResource.write(fileOutputStream);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }

            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }

    /*
     * Avoid anyone accidentally (purposefully?) Instantiating this class
     */
    private AXMLPrinter() {

    }
}
