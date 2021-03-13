package b1;
import java.util.Scanner;
import java.util.Math;
public class bai1{
    public static void main(String[] args){
        DIEM diem = new DIEM();
        diem.nhap();
        diem.xuat();
        diem.diemDoixung();
        diem.khoangCachhaidiem();
        diem.kiemTra();
    }
}
class DIEM{
    int x,y;
    int x1,y1;
    double delta, dttamgiac;
    Scanner scan = new Scanner(System.in);
    void nhap(){
        System.out.println("Nhập vào hoành độ là x: ");
        x = scan.nextInt();
        System.out.println("Nhập vào tung độ là y: ");
        y = scan.nextInt();
    }
    void xuat(){
        System.out.println("Tọa độ của điểm là: ("+ x + "," + y +")");
    }
    void diemDoixung(){
        x1 = x;
        y1 = -y;
        System.out.println("Tọa độ của điểm đối xứng là: (" +x1 +"," + y1 +")");
    }
    void khoangCachhaidiem(){
        delta = Math.sqrt(Math.pow((x1-x),2) + Math.pow((y1-y),2));
        System.out.println("Khoảng cách giữa hai điểm là: " +delta);
    }
    void kiemTra(){
        if( x==0 || y==0 ){
            System.out.println("Điểm này nằm trên trục tọa độ");
        }else{
            System.out.println("Điểm này không nằm trên trục tọa độ");
            dttamgiac = 0.5 * delta *x ;
            System.out.println("Diện tich tam giác là: " +dttamgiac);
        }
    }
}
