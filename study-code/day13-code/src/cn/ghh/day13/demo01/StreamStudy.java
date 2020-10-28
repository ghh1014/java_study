package cn.ghh.day13.demo01;

public class StreamStudy {
    public static void main(String[] args) {
        /*File file = new File("E:\\Projects\\java\\study-code");
        try (OutputStream fos = new FileOutputStream("E:\\Projects\\java\\study-code\\a.txt",true)){
            fos.write(new byte[]{97,98,99,'f','r'});
            fos.write('\n');
            String str = "sldjfklsdjflksdfjlsfj你好";
            fos.write(str.getBytes());
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("文件流操作出现错误："+e.getMessage());
        }*/

        /*try(FileInputStream fis = new FileInputStream("E:\\Projects\\java\\study-code\\a.txt");
            OutputStream fos = new FileOutputStream("E:\\Projects\\java\\study-code\\b.txt")) {
            *//*int len = 0;
            while ((len = fis.read()) != -1){
                System.out.println((char) len);
            }*//*
            byte[] bytes = new byte[1024];
            int readLength = 0;
            while ((readLength = fis.read(bytes)) != -1){
                System.out.println(new String(bytes,0,readLength));
                fos.write(bytes,0,readLength);
            }
        }catch (IOException e){
            System.out.println("文件流操作出现错误："+e.getMessage());
        }*/
    }
}
