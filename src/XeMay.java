public class XeMay implements InjectionMessage {

    private DongCo dongCo;

    public XeMay() {}


    public  XeMay (DongCo dongCo) {
        this.dongCo = dongCo;
    }

    public void DiXe() {
        dongCo.NoMay();
    }

    public void setDongCo(DongCo dongCo){
        this.dongCo = dongCo;
    }

    @Override
    public void set(DongCo dongCo) {
        this.dongCo = dongCo;
    }
}
