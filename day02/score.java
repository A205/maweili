import java.util.Random;

public class score {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = new int[20][5];//�����ɼ�����
		//�����γ����鲢��ֵ		
		String[] className = {"��Ŀ","core C++","coreJava","Servlet     ","JSP     ","EJB     "};
		String[] studentName = new String[20];//����ѧ������		
		for (int i=0;i<20;i++)//��ѧ������
		{
			studentName[i] = "Stud"+(i+1);
		}
		//����ĸ�û�ſγ̳ɼ�
		Random rand = new Random();
		for(int i=0;i<score.length;i++)
		{
			for(int j=0;j<score[1].length;j++)
			{
				score[i][j] = rand.nextInt(100);
			}
		}
		//�Ա����ʽ���
		System.out.println("ѧ���ĳɼ����±�");
		for(int i=0;i<className.length;i++)
		{
			System.out.print(className[i]+"\t");
		}
		System.out.print("\r");
		for(int i=0;i<studentName.length;i++)
		{
			System.out.print(studentName[i]+"\t");
			for (int j=0;j<score[i].length;j++)
			{
				System.out.print(String.valueOf(score[i][j])+"       \t");
			}
			System.out.print("\r");
		}
		//ÿ��ѧԱ���ܷ�
		System.out.println("ѧԱ���ֳܷɼ�����Ϊ��");
		int[] studentTotalScore = new int[studentName.length];
		//System.out.println(studentTotalScore[1]);
		for(int i=0;i<studentName.length;i++)
		{
			for(int j=0;j<score[i].length;j++)
			{
				studentTotalScore[i] = studentTotalScore[i] + score[i][j];
			}
			System.out.print(studentName[i]+"\t");
			System.out.print(studentTotalScore[i]);
			System.out.println();
		}
		//ÿ�ſε�ƽ����
		System.out.println("�γ̵�ƽ���ɼ�����Ϊ��");
		int[]averageScore = new int[score[1].length];
		for(int i=0;i<score[1].length;i++)
		{
			for(int j=0;j<score.length;j++)
			{
				averageScore[i] = averageScore[i] + score[j][i];
			}
			averageScore[i] = averageScore[i]/score.length;
			System.out.print(className[i+1]+"\t");
			System.out.print(averageScore[i]);
			System.out.println();
		}

		

	}

}
