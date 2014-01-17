

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BufferedImage img = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);
        
        
        Random rand = new Random(); 
    int farbe = rand.nextInt(7);
    int form = rand.nextInt(3);

        Graphics g = img.createGraphics();
        
        
        switch(farbe){
        case 0:
                System.out.println(form +"green");
                g.setColor(Color.green);
                break;
        case 1:
                System.out.println(form +"red");
                g.setColor(Color.red);
                break;
        case 2:
                System.out.println(form +"blue");
                g.setColor(Color.blue);
                break;
        case 3:
                System.out.println(form +"yellow");
                g.setColor(Color.yellow);
                break;
        case 4:
                System.out.println(form +"cyan");
                g.setColor(Color.cyan);
                break;
        case 5:
                System.out.println(form +"orange");
                g.setColor(Color.red);
                break;
        case 6:
           		System.out.println(form +"gray");
           		g.setColor(Color.gray);
           		break;
        }
        
        
        switch (form){
        case 0:
                System.out.println(farbe +"arc");
                g.fillArc(100, 100, 100, 100, 50, 50);
                break;
        case 1:
        		System.out.println(farbe +"rect");
        		g.fillRect(100, 100, 100, 100);
        		break;
                
        case 2:
        		System.out.println(farbe +"oval");
        		g.fillOval(100, 100, 100, 100);
        		break;
                
        }
        
        g.dispose();

        ImageIO.write(img, "jpg", response.getOutputStream()); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
