// StudentManager.java（文件名必须与public类名一致）
import java.util.ArrayList;
import java.util.List;

// 1. public顶级类：程序入口，负责管理学生信息
public class StudentManager {
    public static void main(String[] args) {
        // 创建学生对象（使用非public类Student）
        Student zhangsan = new Student("张三", 20);
        Student lisi = new Student("李四", 19);

        // 创建成绩对象（使用非public类Score）
        Score mathScore = new Score("数学", 92.5);
        Score englishScore = new Score("英语", 88.0);

        // 为学生添加成绩
        zhangsan.addScore(mathScore);
        lisi.addScore(englishScore);

        // 使用内部类计算平均分
        GradeCalculator calculator = new GradeCalculator();
        double avg1 = calculator.calculateAvg(zhangsan.getScores());
        double avg2 = calculator.calculateAvg(lisi.getScores());

        // 输出结果
        System.out.println(zhangsan.getName() + "的平均分：" + avg1);
        System.out.println(lisi.getName() + "的平均分：" + avg2);
    }

    // 2. 内部类（嵌套在public类中，编译后生成独立.class文件）
    static class GradeCalculator {
        // 计算成绩列表的平均分
        public double calculateAvg(List<Score> scoreList) {
            if (scoreList == null || scoreList.isEmpty()) {
                return 0.0;
            }
            double sum = 0;
            for (Score score : scoreList) {
                sum += score.getScoreValue();
            }
            return sum / scoreList.size();
        }
    }
}

// 3. 非public顶级类：存储学生基本信息
class Student {
    private String name;
    private int age;
    private List<Score> scores;

    // 构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.scores = new ArrayList<>();
    }

    // 添加成绩的方法
    public void addScore(Score score) {
        this.scores.add(score);
    }

    // Getter方法
    public String getName() {
        return name;
    }

    public List<Score> getScores() {
        return scores;
    }
}

// 4. 非public顶级类：存储单科成绩信息
class Score {
    private String subject; // 科目
    private double scoreValue; // 分数

    // 构造方法
    public Score(String subject, double scoreValue) {
        this.subject = subject;
        this.scoreValue = scoreValue;
    }

    // Getter方法
    public double getScoreValue() {
        return scoreValue;
    }
}