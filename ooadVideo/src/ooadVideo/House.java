package ooadVideo;

interface Brick
{
   public int getNumberOfBricks();
}

interface Cement
{
   public String getCementWeight();
}

public class House implements Brick, Cement{
	@Override
	public String getCementWeight() {
		return "5 Kg";
	}

	@Override
	public int getNumberOfBricks() {
		return 500;
	}
	public static void main(String[] args) {
		House obj = new House();
		System.out.println("Cement:" + obj.getCementWeight());
		System.out.println("Bricks:" + obj.getNumberOfBricks());
	}
}
