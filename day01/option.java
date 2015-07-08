import java.util.Scanner;

public class option {
	public static void main(String[] args){
	System.out.println("| 1. 增加1个学生 |\n| 2. 显示所有学生 |\n| 3. 退出程序 |\n| 请输入选择（1-3）：");
		Scanner scanner=new Scanner(System.in);
                int i=scanner.nextInt();
                if(i==1)
                {
                  System.out.println("|增加1个学生|");
                 }
                else if(i==2)
                 {
                   System.out.println("|显示所有学生|");
                  }
                else if(i==3)
                  {
                    System.out.println("|退出程序|");
                   }
                else 
                   {
                     System.out.println("|输入错误|");
                    }
  }
}