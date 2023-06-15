package ConverttoJsontoJava;

import java.util.ArrayList;
import java.util.List;

public class MainClass 
{
	private List<Accounting> accounting = new ArrayList<Accounting>();
    private List<Sales> sales = new ArrayList<Sales>();
    public List<Accounting> getAccounting() 
    {
        return accounting;
    }
    public void setAccounting(List<Accounting> accounting) 
    {
        this.accounting = accounting;
    }
    public List<Sales> getSales() 
    {
        return sales;
    }
    public void setSales(List<Sales> sales) 
    {
        this.sales = sales;
    }

}
