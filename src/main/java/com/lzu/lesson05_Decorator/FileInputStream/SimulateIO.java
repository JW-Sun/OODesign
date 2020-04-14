package com.lzu.lesson05_Decorator.FileInputStream;

import java.io.*;

public class SimulateIO extends FilterInputStream {

    public SimulateIO(InputStream in) throws FileNotFoundException {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toLowerCase(c);
    }
}
