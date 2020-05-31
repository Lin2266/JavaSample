package interface_abstract;

//包含抽象方法的類別一定要宣告為抽象類別,8/12 enum 加Grades型態
public abstract class Abstract1 {
	private int id;
	private String name;
	private double salary;
	private Grades grades;// 列舉型態

	public Abstract1(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// 把原來實作的方法改為抽象方法
	// 為了多型的應用，Test10-16的list方法參數
	public abstract double getFullSalary();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id:    " + getId() + "\n" + "name:  " + getName() + "\n" + "salary:" + getSalary();

	}

	public Grades getGrades() {
		return grades;
	}

	public void setGrades(Grades grades) {
		this.grades = grades;
	}

	// 顯示員工資料報表
	public void list(Abstract1 e) {
		// 員工種類
		String type = "";
		// 沒有父類別，所以這邊順序沒關係
		if (e instanceof Waiter) {
			type = "Engineer";
		} else if (e instanceof Manager) {
			type = "Manager";
		} else if (e instanceof Secretary) {
			type = "Secretary";
		}

		System.out.println(type + ": " + e.getName() + ": " + e.getFullSalary());
	}

	// 列舉
	public enum Grades {// 等級

		A(5000, "Great"), B(3000, "Good"), C(1000, "OHOH");

		private int bonus;// 獎金
		private String name;

		private Grades(int bonus, String name) {
			this.bonus = bonus;

			this.name = name; // (名字拿掉就會是null)
		}

		public int getBonus() {
			return bonus;
		}

		public String getName() {
			return name;
		}

	}

	// 8/12 enum Grades跟Employee
	public static void main(String[] args) {
		// 抽象類別不可以建立物件，Employee e不可以去建立Employee的物件
		// Employee e = new Employee(1,"A",300);
		Manager ma = new Manager(3, "C", 320, 2000);
		Secretary se = new Secretary(4, "D", 330, ma);
		Waiter en = new Waiter(2, "B", 310, 1000);

		en.setGrades(Grades.A);
		// getGrades()只有接收到A的值，只顯示A,
		System.out.println(en.getGrades());
		// getGrades().getBonus()顯示5000
		System.out.println(en.getGrades().getBonus());
		System.out.println(en.getGrades().getName());

		System.out.println("Engineer: " + en.getFullSalary());
		System.out.println("Manager:  " + ma.getFullSalary());
		System.out.println("Secretary:" + se.getFullSalary());

		System.out.println(en);
	

	}

}

class Manager extends Abstract1{//經理
    private double bonus;
    
    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }
    //忘了覆寫時，會跑到父類別那，所以不會有錯誤
    //因為父類別有抽象方法時，所以一定要實作，不然會有錯誤
    @Override
    public double getFullSalary(){
        return getSalary() + getBonus();
    }
    
    
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n" +
               "bonus: " + getBonus();
    }
    
}

class Secretary extends Abstract1{//秘書
    private Manager manager;

    public Secretary(int id, String name, double salary, Manager manager) {
        super(id, name, salary);
        this.manager = manager;
    }
     //因為父類別有抽象方法時，所以一定要實作，不然會有錯誤
    //@Override
    public double getFullSalary(){
        return getSalary();
    } 

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n" +
               "manager: " + getManager();
    }
    
}

class Waiter extends Abstract1 {

    private double snack;

    public Waiter(int id, String name, double salary, double snack) {
        super(id, name, salary);
        this.snack = snack;
    }
    //忘了覆寫時，會跑到父類別那，所以不會有錯誤
    //因為父類別有抽象方法時，所以一定要實作，不然會有錯誤
    @Override
    public double getFullSalary(){
        return getSalary() + getSnack();
    }

    public double getSnack() {
        return snack;
    }

    public void setSnack(double snack) {
        this.snack = snack;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n" +
               "snack:" + getSnack();
    }

}
