package zl.git;

import java.util.List;
import java.util.logging.Logger;

public class Main {
	private static Logger log;// ��־ϵͳ
	static {// ��ʼ����־Ϊ���������ļ�����������jre/lib�µ������ļ�
		System.setProperty("java.util.logging.config.file",
				"logging.properties");
		log = Logger.getAnonymousLogger();
	}

	private Main() {
	}

	public static void main(String[] args) {
		Point cp = new Point();// ѡһ�����ĵ�
		cp.setX(116.231);
		cp.setY(44.55231);
		List<VecuteObject> pList;// ��ϡĿ�꼯
		int pointNum = 500000;
		pList = new GeneratePoints().getTestPointList(cp, pointNum, 2.0);
		long startMillis = System.currentTimeMillis();
		pList = Algorithm.vecutePoints(pList, 100, 200);
		long endMillis = System.currentTimeMillis();
		for (Point point : pList) {
			log.info(point.toString());
		}
		log.warning(pointNum + "����λ��ϡ������������" + pList.size());
		double timeSpan = (endMillis - startMillis) / 1000.0;
		log.warning(pointNum + "����λ��ϡ����ʱ�䣨�룩��" + timeSpan);
	}

}
