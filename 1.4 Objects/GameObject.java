package video4;

//import java.util.ArrayList;

public abstract class GameObject {

	public String objectName;
	public String objectId;
	
	public GameObject(String name, String id){
		this.objectName = name;
		this.objectId = id;
	}
	
	//public ArrayList location;
	//optional bonus attribute for advanced tutorials!
}
