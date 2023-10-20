package meet7.DecoratorPattern;

public class WarnaiMerah extends WarnaiPakaian{
    public WarnaiMerah(Pakaian warnai) {
        super(warnai);
    }

    @Override
    public void pakai() {
        super.warnai.pakai();
        setWarnaPakaian(warnai);
    }

    private void setWarnaPakaian(Pakaian warnai){
        System.out.println("Warna Border : Merah");
    }
}
