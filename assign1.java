class Box {
	int length;
	int width;
	int height;

	Box(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}
	int volume () {
		return length*width*height;
	}
}
class assign1 {
	public static void main (String[] args) {
		Box cube = new Box(10, 5, 3);
		System.out.println("Volume of box: " + cube.volume());
	}
}
