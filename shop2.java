package laba6;

public class shop2 implements SweetFactory{

    public ThirdPartyProviders createThirdPartyProviders() {
        return new provider2();
    }


    public hierarchy createHierarchy() {
        return new factory2();
    }
}
