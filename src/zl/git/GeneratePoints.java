package zl.git;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * ��ȡ���Ե�
 * 
 * @author zl
 * 
 */
public class GeneratePoints {
	/**
	 * ��ȡĬ�ϲ��Ե�
	 * 
	 * @param center
	 *            ��ϡ���ĵ㣬�Ըõ���Ϊ���ĳ��ı���ɢ
	 * @param sum
	 *            ���ɵĵ�����
	 * @param dis
	 *            ��center����Ϊ���������Χ,x λ�����䡾center.x-dis��center.x+dis����ͬy
	 * @return ���ɵĽ����
	 */

	public List<VecuteObject> getTestPointList(Point center, int sum, double dis) {
		List<VecuteObject> pointList = new ArrayList<>();
		double x = center.getX();
		double y = center.getY();
		Random rand = new Random(new Date().getTime());// ��ȡ�����
		VecuteObject vp;
		double span;
		for (int i = 0; i < sum; i++) {
			vp = new VecuteObject();
			span = rand.nextDouble() * dis;// ���ƫ��xֵ
			// rd.nextBoolean()����ȷ��������Ǹ�����������
			vp.setX(x + (rand.nextBoolean() ? span : -1 * span));// ���xֵ
			span = rand.nextDouble() * dis;// ���ƫ��yֵ
			vp.setY(y + (rand.nextBoolean() ? span : -1 * span));// ���yֵ
			pointList.add(vp);
		}
		return pointList;
	}
}
