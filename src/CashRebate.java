/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/4/2217:12
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class CashRebate implements CashSuper {
    private double	moneyRebate	= 1;

    public CashRebate(double moneyRebate)
    {
        this.moneyRebate = moneyRebate;
    }

    public double acceptCash(double money)
    {
        return money * moneyRebate;
    }
}
