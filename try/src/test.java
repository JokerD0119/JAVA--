import java.util.Scanner;  // 导入Scanner类（用于获取输入）

// 含输入的格式化输出Java程序示例
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // 创建Scanner对象，指定输入源为键盘（System.in）

        System.out.print("请输入第一个整数：");  // 提示用户输入
        int number1 = input.nextInt();  // 读取用户输入的第一个整数

        System.out.print("请输入第二个整数：");  // 提示用户输入
        int number2 = input.nextInt();  // 读取用户输入的第二个整数

        int sum = number1 + number2;  // 计算两数之和并存储到sum变量
        System.out.printf("两数之和为：%d%n", sum);  // 格式化输出结果（%d对应整数sum，%n表示换行）
    }  // main方法结束
}  // Addition类结束

class test2 {
    // 打印文本的Java程序示例 Welcome2.java
    public static void main(String[] args) {
        System.out.print("Welcome to ");  // 不换行打印
        System.out.println("Java programming!");// 换行打印（此处换行指的是在打印结束后输出光标自动移至下一行）
        System.out.print("Hello World!");//不换行打印
        System.out.print("\nwelcome\nto\nJava\nprogramming\n!");//"\n"表示句内换行
        System.out.print("\n\t这是制表符\t功能和tab键一样\tyes");
        System.out.print("\n\"这是双引号符\"");
    }

// 运行命令：java Welcome2
// 输出结果：Welcome to Java programming!（两行代码的输出合并为一行
}


//git test