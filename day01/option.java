import java.util.Scanner;

public class option {
	public static void main(String[] args){
	System.out.println("| 1. ����1��ѧ�� |\n| 2. ��ʾ����ѧ�� |\n| 3. �˳����� |\n| ������ѡ��1-3����");
		Scanner scanner=new Scanner(System.in);
                int i=scanner.nextInt();
                if(i==1)
                {
                  System.out.println("|����1��ѧ��|");
                 }
                else if(i==2)
                 {
                   System.out.println("|��ʾ����ѧ��|");
                  }
                else if(i==3)
                  {
                    System.out.println("|�˳�����|");
                   }
                else 
                   {
                     System.out.println("|�������|");
                    }
  }
}