import javax.swing.JFrame;
public class HelloSwing {
	public HelloSwing(){
	    
        JFrame frame = new JFrame("Hello");
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new HelloSwing();
    }
}
