package zl.git;

import java.util.ArrayList;
import java.util.List;

public class Algorithm {

	private Algorithm() {
	}

	/**
	 * ��ϡ����
	 * 
	 * @param pList
	 *            ��ϡ��Դ����
	 * @param m
	 *            ��ϡ�ľ�������m*n��
	 * @param n
	 *            ��ϡ�ľ���������m*n��
	 * @return
	 */
	public static List<VecuteObject> vecutePoints(List<VecuteObject> pList,
			int m, int n) {
		if (pList == null || m < 1 || n < 1)
			return vecute(null);
		double minX = Double.MAX_VALUE, maxX = 0;
		double minY = Double.MAX_VALUE, maxY = 0;
		double x, y;
		for (VecuteObject vo : pList) {// ��һ�α�������ȡ���ֵ����Сֵ�������жϾ���ļ��
			x = vo.getX();
			y = vo.getY();
			maxX = Math.max(x, maxX);
			minX = Math.min(x, minX);
			maxY = Math.max(y, maxY);
			minY = Math.min(y, minY);
		}
		double disX = (maxX - minX) / m;
		double disY = (maxY - minY) / n;
		VecuteObject[][] vecuteMatrix = new VecuteObject[m][n];// ��ϡ���󣬴������
		int i, j;// ���������Ӧ�÷��ھ����ĸ�λ��
		VecuteObject point;
		for (VecuteObject vo : pList) {// �ڶ��α�������ϡ
			i = (int) ((vo.getX() - minX) / disX);
			i = (i < m) ? i : m - 1;
			j = (int) ((vo.getY() - minY) / disY);
			j = (j < n) ? j : n - 1;
			point = vecuteMatrix[i][j];
			if (point == null)
				vecuteMatrix[i][j] = vo;
			else
				point.setSum(point.getSum() + 1);
		}
		return vecute(vecuteMatrix);
	}

	/**
	 * ����ϡ��ľ�����list����
	 * 
	 * @param vecuteMatrix
	 *            ��Ҫ��ϡ�ľ���
	 * @return
	 */
	private static List<VecuteObject> vecute(VecuteObject[][] vecuteMatrix) {
		List<VecuteObject> reList = new ArrayList<>();// ��ϡ�������
		if (vecuteMatrix == null)
			return reList;
		for (VecuteObject[] vos : vecuteMatrix) {
			for (VecuteObject vo : vos) {
				if (vo == null)
					continue;
				reList.add(vo);
			}
		}
		return reList;
	}
}
