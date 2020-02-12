package com.neuedu.test;



import java.io.*;

/**
 * Created by Neuedu on 2020/2/12.
 */
public class MyTest12 {
    public static void main(String[] args) {
       /* int a = 10;
        Student student = new Student();
        student.setId(10);
        student.setName("张三");
        student.setAge(18);
        student.setGrade("卓越1班");*/
        /**
         *  java中的数据在运行的时候 是保存在内存中的
         *  当进程结束的时候  内存中的数据会全部释放
         *  如果想保存当前进程下的数据  我们就必须把数据放到一个能一直保存住的地方
         *  如果想存住了  就必须把我们当前进程中的数据(内存) 保存到硬盘下 让数据能够持久的保存 这个技术叫 数据持久化
         *  也就是说  将数据从内存中转移到硬盘中  这一过程叫数据的输出
         *  那么 下次运行的时候  我们要读上一次保存的数据作为初始数据
         *  也就是  将数据从硬盘中 读到 内存中 这一过程叫数据的输入
         *  IO流 按照方向分
         *      输入流
         *      输出流
         *  IO流 按照传输单位分
         *      字节流
         *          构成文件的最小单位
         *      字符流
         *          如果是一个中文占 如果传了一个字节 传输失败 那么可能会出现传输错误 形成乱码
         *          所以传文本信息 需要用字符流
         *      传文字通常用字符流  传其他内容都是用字节流
         *      两者的区别在于
         *          字节流以 byte 为单位
         *          字符流以 2byte 的unicode为单位
         * */
        /**
         * 字节输出流
         *
         *  路径的写法  盘符:/文件夹/文件名
         *   路径之间用  / 分隔 或者 \\
         *
         *  File 对象只能提供文件的信息描述 并不能对文件进行任何读写操作
         *
         *      getName() 获取文件的文件名
         *      length() 获取文件大小(字节)
         *      exists() 查看文件是否存在
         *      getPath() 获取文件路径
         *      createNewFile() 创建文件 返回boolean 如果文件不存在 则可以创建  如果文件已经存在不会再创建
         *      mkdir() 创建目录  只创建目录的最后一级 必须保证前面的父目录是存在
         *      mkdirs() 创建目录  创建目录 无论是任何一级 不存在就会创建
         *      delete() 删除文件
         *      isDirectory() 是否是目录
         *      isFile() 是否是文件
         *
         *      流属于对资源进行操作 所以必须要关闭
         *      输出流  默认将内容写入到文件中 (覆盖源文件) 如果想保留原先的内容
         *      我们在构造的时候就必须设置为追加内容 而不是覆盖内容
         *
         *
         *    字节输出流 OutputStream
         *    字节输入流 InputStream
         *    字符输入流 Reader  BufferedReader
         *    字符输出流 Writer
         * */
        File file = new File("d:\\Test.java");
       /* System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.getPath());
        System.out.println(file.isDirectory());*/
       /* try {
            OutputStream outputStream = new FileOutputStream(file,true);
            String a = "\n11111111111";
            outputStream.write(a.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*InputStream inputStream = null;
        try {
             inputStream = new FileInputStream(file);
            byte[] a = new byte[10];
            int b = inputStream.read(a);
            while(b!= -1){
                System.out.println("读取字节数:"+b);
                System.out.println(new String(a,0,b));
                b = inputStream.read(a);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

       /* Reader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            String str = br.readLine();
            while(str!=null){
                System.out.println(str);
                str = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(br!=null){
                    br.close();
                }
                if(reader!=null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        Writer writer = null;
        try {
            writer = new FileWriter(file,true);
            writer.write("11111111");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(writer!=null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
