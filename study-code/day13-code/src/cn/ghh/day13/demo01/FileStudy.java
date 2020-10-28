package cn.ghh.day13.demo01;

import java.io.File;
import java.util.ArrayList;

public class FileStudy {
    public static void main(String[] args) {
        //System.out.println(File.pathSeparator);
        //System.out.println(File.separator);
        //File file = new File("day13-code\\src\\cn\\ghh\\day13\\demo03");
        //System.out.println(file.exists());
        //System.out.println(file.isFile());
        //System.out.println(file.isDirectory());
        /*try {
            boolean r = file.createNewFile();
            System.out.println(r);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*if (!file.exists()){
            boolean r = file.mkdirs();
            System.out.println(r);
        }*/
        /*String[] list = file.list();
        for (String s : list) {
            File subFile = new File(s);
            boolean result = subFile.delete();
            System.out.println(result);
        }*/
        /*long start = System.currentTimeMillis();
        ArrayList<String> pathList = new ArrayList<>();
        searchFile("E:\\Projects\\java\\study-code",pathList);
        for (String s : pathList) {
            System.out.println(s);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);*/
        File file = new File("E:\\Projects\\java\\study-code");
        if (!file.exists())
            return;
        ArrayList<File> resultFiles = new ArrayList<>();
        searchFile(file,resultFiles);
        System.out.println(resultFiles.size());
    }

    private static void searchFile(File file, ArrayList<File> validFiles){
        //File[] files = file.listFiles((dir, name) -> new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java"));
        File[] resultFiles = file.listFiles(pathname -> {
            String name = pathname.getName();
            if (pathname.isDirectory()){
                return true;
            }
            return name.toLowerCase().endsWith(".java");
        });
        for (File subFile : resultFiles) {
            if (subFile.isDirectory()){
                searchFile(subFile,validFiles);
            }else{
                validFiles.add(subFile);
            }
        }
    }
}
