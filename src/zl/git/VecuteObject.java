package zl.git;

/**
 * ��ϡ���ض���
 * 
 * @author zl
 * 
 */
public class VecuteObject extends Point {
	/**
	 * ��ʼ�����캯����������Ϊ1
	 */
	public VecuteObject() {
		this.sum = 1;
	}

	/**
	 * ��ϡ���������������¼����ĳһ��С���п��ڵ�����
	 */
	private int sum;

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "������" + sum + ",X:" + getX() + ",Y:" + getY();
	}

}
