<%@ page contentType="image/jpeg"
	import="java.awt.*, java.awt.image.*,java.util.*,javax.imageio.*"%>
<%!Color RandomColor(int fc, int bc) {
		Random random = new Random();
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}
	//随机颜色%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setDateHeader("Expires", 0);
	//设置页面不被缓存
	int width = 60, height = 20;
	BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	Graphics g = image.getGraphics();
	g.setColor(RandomColor(200, 250));
	g.fillRect(0, 0, width, height);
	//绘制矩形
	g.setFont(new Font("Terminal", Font.BOLD, 18));
	//设置矩形中字体
	g.setColor(RandomColor(160, 200));
	Random random = new Random();
	for (int i = 0; i < 200; i++) {
		int x = random.nextInt(width);
		int y = random.nextInt(height);
		int xl = random.nextInt(12);
		int yl = random.nextInt(12);
		g.drawLine(x, y, x + xl, y + yl);
		//画从（x,y）到(x+x1,y+y1)的线段
	}
	String sRand = "";
	for (int i = 0; i < 4; i++) {
		String rand = String.valueOf(random.nextInt(10));
		sRand += rand;
		g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
		g.drawString(rand, 13 * i + 6, 16);
	}
	//产生4个随机数字
	// 将认证码存入SESSION 
	session.setAttribute("rand", sRand);
	g.dispose();
	ImageIO.write(image, "JPEG", response.getOutputStream());
	//写入图片
%>