
public class Context {
	Strategy strategy;
	public Context(Strategy strategy)
	{
		this.strategy =  strategy;
	}
	/**
	 * 根据不同的策略对象，调用其算法不同
	 */
	public void ContextInteface()
	{
		strategy.AlgorithmInterface();
	}
	
	/**
	 * 这里面的方法可以自己随便定义
	 */
	/**
	 * 
	 * 使用工厂和策略模式结合的方法
	 * 
	 * public Context(String type)
	 * {
	 * switch(type)
	 * {
	 * 		case "正常收费":
	 * 			CashNormal cs0 = new CashNormal();
	 * 			cs = cs0;
	 * 			break;
	 * 		case "满300返100":
	 * 			CashReturn cr1 = new CashReturn();
	 * 			cs = cs1;
	 * 			break;
	 * 		case "打八折":
	 * 			CashRebate cr2 = new CashRebate("0.8");
	 * 			cs = cr2;
	 * 			break;
	 * }
	 * }
	 * 
	 */
}
