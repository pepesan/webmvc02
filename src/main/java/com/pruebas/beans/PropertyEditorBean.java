package com.pruebas.beans;

import java.io.File;
import java.net.URL;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Pattern;

/**
 * Created by pepesan on 7/5/16.
 */
public class PropertyEditorBean {
    private byte[] bytes;
    private File file;
    private Locale locale;
    private Pattern pattern;
    private String[] strings;
    private URL url;
    private Properties properties;

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
