package cn.ghh.day14.demo01;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("F:\\Personal\\xiaomi\\Camera\\20140110_100123.jpg");
            Socket socket = new Socket("127.0.0.1",8888)) {
            OutputStream outputStream = socket.getOutputStream();
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes))!=-1){
                outputStream.write(bytes,0,len);
            }
            socket.shutdownOutput();
            InputStream inputStream = socket.getInputStream();
            while ((len = inputStream.read(bytes))!=-1){
                System.out.println(new String(bytes,0,len));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
