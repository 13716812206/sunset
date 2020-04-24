package com.test.one;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class test1 {

    public static void rwFile() {

        File file =new File("e:\\text.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileWriter fw = null;
        try {
            fw = new FileWriter(file, false);
            fw.write("123\r\n");//这里向文件中输入结果123
            fw.write("456");
            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) {
        rwFile();
       org.apache.log4j.Logger logger= org.apache.log4j.Logger.getLogger(test1.class);
    logger.info(" ");
    logger.error("123");
    logger.warn("444");
    logger.debug("111");

    }
}

