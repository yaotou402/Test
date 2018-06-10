import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args){
		Animal a = new Animal();
		a.setColor("red");
		a.setSex("male");
		Animal b = new Animal();
		b.setColor("red");
		b.setSex("male");
		Animal c = new Animal();
		c.setColor("red");
		c.setSex("male");
		Animal d = new Animal();
		d.setColor("red");
		d.setSex("male");
		
		List<Animal> list = new ArrayList<Animal>();
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		
		for(Animal ani : list){
			String color = "红";
			ani.setColor(color);
		}
		
		System.out.println(list.get(1).getColor());
		
		Dog d1 = new Dog();
		list.add(d1);
		
	}
}
