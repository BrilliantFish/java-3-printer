public class ColorPrinter extends Printer {
    //指定颜色名称显示
    public void printing(String color){
        System.out.println("color print color: "+color);
    }

    //指定颜色参数显示颜色
    public void printing(int red, int green, int blue){
        System.out.println("color print color: r="+red+",g="+green+",b="+blue);
    }
}
