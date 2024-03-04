package objectExercise;

public class Apartment extends Property {
	private String floorPlan;
	
	Apartment(String buildingName,String ownerName,String property, String price, String floorPlan) {
		super(buildingName, ownerName, property, price);
		this.floorPlan = floorPlan;
	}
	
	public void greeting() {
		    System.out.println("物件名" + ":" + this.buildingName);
		    System.out.println("物件所有者名" + ":" + this.ownerName);
		    System.out.println("物件種別" + ":" + this.property);
		    System.out.println("物件価格" + ":" + this.price);
		    System.out.println("間取り" + ":" + this.floorPlan);
	}
	 
	public String getFloorPlan() {
		return this.floorPlan;
	}
	
	public void setFloorPlan(String floorPlan) {
		this.floorPlan = floorPlan;
	}

}
