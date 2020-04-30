package cn.itcast.idea.basicplus.javaapi;

import java.util.Scanner;

/**
 * 随机点名 class
 *
 * @author hzx
 * @date 2020-04-08
 */
public class RadomPrintName {
    private String[] classNum = null;

    public RadomPrintName() {
    }


    public String[] getclassNum() {
        return classNum;
    }

    public void setclassNum(String[] classNum) {
        this.classNum = classNum;
    }


    public void radomPrintName(String[] classNum) throws InterruptedException {
        //记录初始人数
        int num = classNum.length;
        Scanner in = new Scanner(System.in);
        System.out.println("我们一共有：" + num + "人");
        System.out.println("现在开始点名,准备好了吗？(y/n)");
        if(in.nextLine().equals("y")){
            System.out.println("开始！");
            //循环点名，直到都点完为止
            for (int i = 0; i < classNum.length; i++) {
                int randomnum = (int) (Math.random() * (num - 1));
                System.out.println("第" + (i + 1) + "次：");
                System.out.println(3);
                Thread.sleep(1000);
                System.out.println(2);
                Thread.sleep(1000);
                System.out.println(1);
                Thread.sleep(1000);
                System.out.println("恭喜你：" + classNum[randomnum] + "，你被抽中了！");
                System.out.println("是否继续：(y/n)");
                //判断是否继续点名
                if (in.nextLine().equals("y")) {
                    //把被点过的人排除，用后一个人填补上
                    for (int j = randomnum; j < num - 1; j++) {
                        classNum[j] = classNum[j + 1];
                    }
                    num--;
                } else {
                    break;
                }

            }
            in.close();
            System.out.println("点名结束了！");
        }
    }
}
