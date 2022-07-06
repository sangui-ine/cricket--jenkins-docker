package cricket.player.cricket.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Product_TBL")
public class Product {
	@Id
	@GeneratedValue
 private int id;
 private String name;
 private  int runscored;
 private String playerType;
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
public int getRunscored() {
	return runscored;
}
public void setRunscored(int runscored) {
	this.runscored = runscored;
}
public String getPlayerType() {
	return playerType;
}
public void setPlayerType(String playerType) {
	this.playerType = playerType;
}
public Product(int id, String name, int runscored, String playerType) {
	super();
	this.id = id;
	this.name = name;
	this.runscored = runscored;
	this.playerType = playerType;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public int hashCode() {
	return Objects.hash(id, name, playerType, runscored);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	return id == other.id && Objects.equals(name, other.name) && Objects.equals(playerType, other.playerType)
			&& runscored == other.runscored;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", runscored=" + runscored + ", playerType=" + playerType + "]";
}
public Product orElse(Object object) {
	// TODO Auto-generated method stub
	return null;
}
 
 
 
}
