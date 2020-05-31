
import Collection_Generics.Product;

////9-18作業繼承Prodact Outletp9-14

public class Outlet extends Product {

    private int discount = 20;//打八折

    public Outlet(int id, String name, double unitPrice,
                 boolean free, int stock,int discount) {
        super(id, name, unitPrice, free, stock);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override //檢查覆寫
    public double getUnitPrice() {
        //單價 * (100-20(幾折)/100) = (0.8) 
        return super.getUnitPrice() * ((100 - getDiscount()) / 100.0);
    }

    //查原價

    public double getLisPrice() {
        return super.getUnitPrice();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + 
               "Discount:  " + getDiscount();

    }

    //覆寫equals

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        
        if (obj != null) {
            if (obj instanceof Outlet) {
                Outlet o = (Outlet) obj;
                if (super.equals(obj) && discount == o.discount) {
                    result = true;
                }

            }
        }
        return result;
    }
}
