package objectExercise;

public class Land extends Property {
	private String breadth;
	
	Land(String buildingName,String ownerName,String property, String price, String breadth) {
		super(buildingName, ownerName, property, price);
		this.breadth = breadth;
	}
	
	 public void greeting() {
		    System.out.println("物件名" + ":" + this.buildingName);
		    System.out.println("物件所有者名" + ":" + this.ownerName);
		    System.out.println("物件種別" + ":" + this.property);
		    System.out.println("物件価格" + ":" + this.price);
		    System.out.println("広さ" + ":" + this.breadth);
	}
	 
	 public String getBreadth() {
		return this.breadth;
	}
		
     public void setBreadth(String breadth) {
		this.breadth = breadth;
	}

}
