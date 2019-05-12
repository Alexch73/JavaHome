package CWThread;

import java.io.FileOutputStream;
import java.io.IOException;

class Potok implements Runnable{
    public Potok( String potokName){
        new Thread(this, potokName).start();
    }

    @Override
    public void run() {
        synchronized ("FileThread.txt") {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("FileThread.txt", true);
                fileOutputStream.write((Thread.currentThread().getName() + "\n").getBytes());
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
