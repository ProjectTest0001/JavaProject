
public class Context {
	Strategy strategy;
	public Context(Strategy strategy)
	{
		this.strategy =  strategy;
	}
	/**
	 * ���ݲ�ͬ�Ĳ��Զ��󣬵������㷨��ͬ
	 */
	public void ContextInteface()
	{
		strategy.AlgorithmInterface();
	}
	
	/**
	 * ������ķ��������Լ���㶨��
	 */
	/**
	 * 
	 * ʹ�ù����Ͳ���ģʽ��ϵķ���
	 * 
	 * public Context(String type)
	 * {
	 * switch(type)
	 * {
	 * 		case "�����շ�":
	 * 			CashNormal cs0 = new CashNormal();
	 * 			cs = cs0;
	 * 			break;
	 * 		case "��300��100":
	 * 			CashReturn cr1 = new CashReturn();
	 * 			cs = cs1;
	 * 			break;
	 * 		case "�����":
	 * 			CashRebate cr2 = new CashRebate("0.8");
	 * 			cs = cr2;
	 * 			break;
	 * }
	 * }
	 * 
	 */
}
