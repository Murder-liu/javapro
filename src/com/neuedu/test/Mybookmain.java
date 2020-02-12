package com.neuedu.test;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by w on 2020/2/11.
 */
public class Mybookmain {
    public static com.neuedu.test.Mybook[] array = new com.neuedu.test.Mybook[200];
    public static List<com.neuedu.test.Mybook> list = new ArrayList<>();
//              主方法
    public static void main(String[] args) {
        inputData(list);
        menu();
//        print(list);
//        searchName(list,"书名9");
//        searchName(list,"书名10");
//        deleteName(list,"书名2");
//        print(list);
//        addBook(list);
//        print(list);

    }

//    创建菜单   1：添加图书2：删除图书3：查找图书（根据用户名）
//               4：退出当用户输入1-3时，分别调用输入、删除和查找函数，当用户输入4时程序结束。
    public static void menu(){
        System.out.println("输出菜单项请选择你要进行的操作（请输入1-4中的任一个数字）：");
        System.out.println("1：添加图书");
        System.out.println("2：删除图书");
        System.out.println("3：查找图书（根据书名）");
        System.out.println("4：查看所有");
        System.out.println("5.退出");
        Scanner scanner = new Scanner(System.in);
        int i=scanner.nextInt();
        switch (i){
            case 1:
                addBook(list);
                break;
            case 2:
                System.out.println("请输入要删除的书名");
                String name = scanner.next();
                deleteName(list,name);
                break;
            case 3:
                System.out.println("请输入要查看的书名");
                String searchName = scanner.next();
                searchName(list,searchName);
                break;
            case 4:
                print(list);
                break;
            default:
                System.exit(1);
                break;
        }
    }

//              编写一个函数inputData(ArrayList<Mybook>
    public static void inputData(List<Mybook>books){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

//                      输入n本书的信息，
        for (int i = 1;i<=n;i++){
            Mybook mybook = new Mybook("书名"+i,Double.valueOf(String.valueOf(i)),"出版社"+i,"作者"+i,"ISBN"+i);
                    books.add(mybook);


        }
    }
//                    打印列表
    public static void print(List<Mybook> book){
        for (int i = 0;i<book.size();i++){
            System.out.println(book.get(i));
        }
        menu();
    }

//                  查找功能
    public static void searchName(List<Mybook> books,String name){
        for (int i = 0;i<books.size();i++){
           Mybook mybook = books.get(i);
           if (mybook.getName().equals(name)){
               System.out.println(mybook);
               menu();
               return;
           }
        }
        System.out.println("此书不存在");
        menu();
    }
//           删除功能    如果存在，删除该书，并提示“此书删除成功。  并显示该书的详细信息。
//                       如果不存在，输出“没有此书，删除失败.”
    public static void deleteName(List<Mybook> books,String name){
        for (int i = 0;i<books.size();i++){
            Mybook mybook = books.get(i);
            if (mybook.getName().equals(name)){
               books.remove(i);
                System.out.println("删除成功");
                menu();
               return;
            }
        }
        System.out.println("没有此书，删除失败");
        menu();
    }
//          添加功能
    public static void addBook(List<Mybook> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名");
        String name = scanner.next();
        System.out.println("请输入价格");
        double price = scanner.nextDouble();
        System.out.println("请输入出版社");
        String press = scanner.next();
        System.out.println("请输入作者");
        String author = scanner.next();
        System.out.println("请输入书的ISBN号");
        String bookISBN = scanner.next();
        Mybook mybook = new Mybook(name,price,press,author,bookISBN);
        books.add(mybook);
        menu();
    }

}
