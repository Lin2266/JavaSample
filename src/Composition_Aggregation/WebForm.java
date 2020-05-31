
package Composition_Aggregation;


//Composition組合，公司跟老闆的關係 A在B在
//Aggregation聚合，公司跟員工的關係 B不在A在

//Composition整合多種複雜的物件(is-a關係=公司-老闆-員工)，透過Method delegation(委託方法)設計來達成
//whole-part(整體-部分),公司就是整體(whole)，老闆、員工就是部分(part)
public class WebForm {
    private Label label = new Label();
    private ImageView imageView = new ImageView();
    private Button button= new Button();

    public String getLabel() {
        //這種方法稱為Method forwarding方法的轉發
        return label.getLabel();
    }

    public void setLabel(String text) {
        label.setLabel(text);
    }

    public ImageView getImageView() {
        return imageView.getImageView();
    }

    public void setImageView(ImageView imageView) {
        imageView.setImageView(imageView);
    }

    public void onClick() {
        button.onClick();
    }

}
class ImageView{
	int i ;
	
	ImageView getImageView(){
		ImageView iView = new ImageView();
		iView.i=100;
		return iView;
	}
	void setImageView(ImageView imageView){
		ImageView iView = new ImageView();
		iView.i = 200;
		imageView = iView;
		System.out.println("setImageView" + imageView);
	}
}
class Label{
	String getLabel(){
		return "getLable";
	}
	String setLabel(String s){
		return "setLabel";
	}
}
class Button{
	void onClick(){
		System.out.println("onClick");
	}
	
}
