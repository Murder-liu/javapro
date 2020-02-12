package com.neuedu.test;

import java.io.*;

/**
 * Created by w on 2020/2/12.
 */
public class Mytest01 {
//     把d下 某个文件 复制到  d:/a 下
    public static void main(String[] args) {
        File from = new File("d\\1.wmv");
        File parent = new File("d\\a");
        if (!parent.exists()){
            parent.mkdirs();
        }
        File to = new File("d\\a\\"+from.getName());
        InputStream inputStream = null;
        OutputStream outputStream = null;
        byte[] b = new byte[1024];
        try {
            inputStream = new FileInputStream(from);
            outputStream = new FileOutputStream(to);
            int len = inputStream.read(b);
            while (len!=-1){
                outputStream.write(b,0,len);
                outputStream.flush();
                len = inputStream.read(b);
            }
            System.out.println("复制完成");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if (outputStream!=null)
                    outputStream.close();
                if (inputStream!=null)
                    inputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
