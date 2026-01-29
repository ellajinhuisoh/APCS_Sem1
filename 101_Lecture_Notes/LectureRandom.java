/*
    Lecture note example - Random!!
*/

class LectureRandom{
    public static void main(String args[]) {
        System.out.println(Math.random() * 5);
        System.out.println(Math.random() * 5 + 15);
        System.out.println(Math.random() * 5743 + 1024);
        System.out.println((int)(Math.random() * (42-(-13)) + (-13)));
        int x = ((int)(Math.random() * 25 + 30));
        int y = ((int)(Math.random() * 25 + 80));
        System.out.println((int)(Math.random() * (y-x) + x));
	}
}
