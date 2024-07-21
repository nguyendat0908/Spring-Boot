public class Main {
    public static void main(String[] args) {
        DongCoTrungQuoc dongCoTrungQuoc = new DongCoTrungQuoc();
        DongCoMy dongCoMy = new DongCoMy();
        XeMay xeMay = new XeMay();

        // Tiêm phụ thuộc vào constructor
//        XeMay xeMay = new XeMay(dongCoTrungQuoc);
//        xeMay.DiXe();

        // Tiêm phụ thuộc bằng setter
//        xeMay.setDongCo(dongCoMy);
//        xeMay.DiXe();

        // Tiêm phụ thuộc bằng Interface
        xeMay.set(dongCoMy);
        xeMay.DiXe();
    }
}