package Zadaci_07_03_2017;

import java.util.Date;
//jlasa G.Obj. ima tri atributa
public class GeometricObject {
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	//...sa klasicnim get i set metodama, pomocu kojih pristupamo atributima i mjenjamo ih
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", filled=" + filled
				+ ", dateCreated=" + dateCreated + "]";
	}
	
}
