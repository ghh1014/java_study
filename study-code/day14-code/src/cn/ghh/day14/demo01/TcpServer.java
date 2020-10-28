package cn.ghh.day14.demo01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true){
            Socket socket = serverSocket.accept();
            new Thread(()->{
                File file = new File("E:\\Projects\\java\\upload");
                if (!file.exists()){
                    file.mkdirs();
                }
                String fileName = "\\ghh"+System.currentTimeMillis()+new Random(99999).nextInt()+".jpg";
                try(FileOutputStream fos = new FileOutputStream(file+fileName)) {
                    InputStream inputStream = socket.getInputStream();
                    int len = 0;
                    byte[] bytes = new byte[1024];
                    while ((len = inputStream.read(bytes))!=-1){
                        fos.write(bytes,0,len);
                    }
                    //完成文件传输
                    socket.getOutputStream().write("上传成功".getBytes());
                    socket.close();
                }catch (IOException ex){
                    System.out.println(ex);
                }
            }).start();
        }
    }
}
