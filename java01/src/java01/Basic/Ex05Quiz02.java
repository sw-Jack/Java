package java01.Basic;
import java.util.Scanner;

/* ������ ���� ���۵ǵ��� �ڵ��Ͻÿ�
 * 2. �񸸵� ����ϱ�
 * (���� ü�� - ǥ�� ü��) / ǥ�� ü�� * 100
 */
public class Ex05Quiz02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���� ü�� �Է� : ");
		float weight = in.nextFloat();
		float mskg = weight*weight*22;
		float wskg = weight*weight*21;
		float mbmd = (weight - mskg) / mskg * 100; 
		float wbmd = (weight - wskg) / wskg * 100;
		System.out.println("���� �񸸵� : " + mbmd);
		System.out.println("���� �񸸵� : " + wbmd);    
	}

}
